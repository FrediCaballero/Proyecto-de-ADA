package scripts;
import Escena.Mensaje;
import Escenario.Escenario;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tablero implements ActionListener, KeyListener {

    //VARIABLES PRINCIPALES 
    private JPanel esenario;
    private JButton[][] btn;
    private JLabel lbl_x;
    private JLabel lbl_o;
    private JLabel lbl_resultados;
    private int p[][];

    //VARIABLES DE LAS FICHAS DEL JUEGO
    private ImageIcon x;
    private ImageIcon o;

    //VARIABLES PARA EL ESTADO DE JUEGO
    private int turno = 0;
    private int victoriasX;
    private int victoriasO;
    private int empate;
    private boolean fin = false;

    //VARIABLES PARA LOS MENSAJES 
    public static boolean mensaje = true;
    private String jugador1;
    private String jugador2;

    // VARIABLES PARA LAS CASILLAS EN MAXIMIN
    private int humano = -1;
    private int maquina = 1;
    private int vacia = 0;

    private boolean isMaquina;

    public Tablero(String jugador1, String jugador2, JPanel esenario, JLabel lbl_x, JLabel lbl_o, JLabel lbl_resultados) {
        this.btn = new JButton[3][3];
        this.p = new int[3][3];
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.lbl_o = lbl_o;
        this.lbl_x = lbl_x;
        this.lbl_resultados = lbl_resultados;
        this.esenario = esenario;
        this.creaTablero();
    }

    public void setIsMaquina(boolean isMaquina) {
        this.isMaquina = isMaquina;
    }

    public String getJugador1() {
        return jugador1;
    }
    public String getJugador2() {
        return jugador2;
    }
    public int getVictoriasO() {
        return victoriasO;
    }
    public int getVictoriasX() {
        return victoriasX;
    }
    public int getEmpate() {
        return empate;
    }

    private void creaTablero() {
        esenario.setLayout(new GridLayout(3, 3));
        for (int i = 0; i < btn.length; i++) {
            for (int j = 0; j < btn[0].length; j++) {
                btn[i][j] = new JButton();
                btn[i][j].setPreferredSize(new Dimension(100, 100));
                btn[i][j].setSize(100, 100);
                btn[i][j].addKeyListener(this);
                btn[i][j].setContentAreaFilled(false);
                btn[i][j].addActionListener(this);
                btn[i][j].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                if (i == 0 || i == 1) {
                    btn[i][j].setBorder(javax.swing.BorderFactory.createMatteBorder(0, 8, 8, 0, new java.awt.Color(255, 102, 255)));
                }
                if (j == 0) {
                    btn[i][j].setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 8, 0, new java.awt.Color(255, 102, 255)));
                }
                if (i == 2) {
                    btn[i][j].setBorder(javax.swing.BorderFactory.createMatteBorder(0, 8, 0, 0, new java.awt.Color(255, 102, 255)));
                    if (j == 0) {
                        btn[i][j].setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 102, 255)));
                    }
                }

                esenario.add(btn[i][j]);
            }
        }
        x = escala(img("marca-x.png"),btn[0][0].getWidth(), btn[0][0].getHeight()); //para que abarque la casilla automáticamente 
        o = escala(img("letra-o.png"), 80, 80); 
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!fin) {
            for (int i = 0; i < btn.length; i++) {
                for (int j = 0; j < btn[0].length; j++) {
                    if (ae.getSource() == btn[i][j]) {
                        if (isVacia(i, j)) {

                            if (turno % 2 == 0) {

                                jugada(i, j, x, humano);
                                if (fin) {
                                    victoriasX++;
                                    lbl_x.setText("" + victoriasX);
                                    marcador(x, victoriasX, humano);
                                } else {
                                    if (isMaquina) {
                                        movMAQUINA(); //JUEGA MAQUINA Y SUMA UN TURNO
                                    }
                                }
                            } else {
                                jugador2(i, j);
                            }

                            turno++;

                            if (turno == 9 && !fin) {
                                empate++;
                                lbl_resultados.setText("EMPATE");
                                fin = true;
                            }

                        }
                    }
                }
            }
        }
    }

    private void jugador2(int i, int j) {
        jugada(i, j, o, maquina);
        if (fin) {
            victoriasO++;
            lbl_o.setText("" + victoriasO);
            marcador(o, victoriasO, maquina);
        }
    }

    private ImageIcon escala(ImageIcon img, int ancho, int alto) {
        return new ImageIcon(img.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
    }

    private ImageIcon img(String nombre) {
        return new ImageIcon(getClass().getResource("/Imagen/" + nombre));
    }

    private boolean fila(int f, int col1, int col2, int col3, int jugador) {
        return (p[f][col1] == jugador && p[f][col2] == jugador && p[f][col3] == jugador);
    }

    private boolean columna(int c, int fil1, int fil2, int fil3, int jugador) {
        return (p[fil1][c] == jugador && p[fil2][c] == jugador && p[fil3][c] == jugador);
    }

    private boolean diagonal(int col1, int col2, int col3, int jugador) {
        return p[0][col1] == jugador && p[1][col2] == jugador && p[2][col3] == jugador;
    }

    private boolean filas(int jugador) {
        return fila(0, 0, 1, 2, jugador) || fila(1, 0, 1, 2, jugador) || fila(2, 0, 1, 2, jugador);
    }

    private boolean columnas(int jugador) {
        return columna(0, 0, 1, 2, jugador) || columna(1, 0, 1, 2, jugador) || columna(2, 0, 1, 2, jugador);
    }

    private boolean isVictorias(int jugador) {
        return filas(jugador) || columnas(jugador) || diagonal(0, 1, 2, jugador) || diagonal(2, 1, 0, jugador);
    }

    private void jugada(int i, int j, ImageIcon img, int valor) {
  
            if (!fin) {
                p[i][j] = valor;
                btn[i][j].setIcon(img);
                if (isVictorias(valor)) {
                    fin = true;
                }
            }
     
    }

    private void marcador(ImageIcon img, int puntos, int jugador) {
        if (mensaje) {
            Escenario frm = new Escenario();
            Mensaje msg = new Mensaje(img, puntos);
            frm.setSize(410, 250);
            frm.add(msg);
            frm.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            frm.setResizable(false);
            frm.setLocationRelativeTo(null);
            frm.setVisible(true);
            frm.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent evt) {
                    reiniciar();
                }
            });
        } else {
            if (jugador == humano) {
                lbl_resultados.setText("GANASTE  " + jugador1);
            } else {
                lbl_resultados.setText("GANASTE  " + jugador2);
            }
        }
    }

    public void reiniciar() {
        lbl_resultados.setText("");
        turno = 0;
        fin = false;
        for (int i = 0; i < btn.length; i++) {
            for (int j = 0; j < btn[0].length; j++) {
                btn[i][j].setIcon(null);
                p[i][j] = 0;
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == 82) {
            reiniciar();
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }

    // ALGORITMO MINIMAX
    private void movMAQUINA() {
        if (!isTabLLeno()) {
            int f = -1;
            int c = -1;
            int aux = -9999;
            int mejor = -9999;
            for (int i = 0; i < p.length; i++) {
                for (int j = 0; j < p[0].length; j++) {

                    if (isVacia(i, j)) {

                        marcarCasilla(i, j, maquina);
                        aux = min();

                        if (aux > mejor) {
                            mejor = aux;
                            f = i;
                            c = j;
                        }

                        marcarCasilla(i, j, vacia);
                    }
                }
            }
            jugador2(f, c);
            turno++;
        }
    }

    private int min() {
        if (isVictorias(maquina)) {
            return 1;
        } else {
            if (isTabLLeno()) {
                return 0;
            } else {
                int aux = 9999;
                int mejor = 9999;

                for (int i = 0; i < p.length; i++) {
                    for (int j = 0; j < p[0].length; j++) {

                        if (isVacia(i, j)) {
                            marcarCasilla(i, j, humano);  //MARCA LA CASILLA COMO OCUPADA POR EL HUMANO
                            aux = max();

                            if (aux < mejor) //VE SI LA POSICION ES  OPTIMA
                            {
                                mejor = aux;
                            }

                            marcarCasilla(i, j, vacia);  //MARCA LA CASILLA COMO VACIA
                        }

                    }
                }
                return mejor;
            }
        }
    }

    private int max() {
        if (isVictorias(humano)) {
            return -1;
        } else {
            if (isTabLLeno()) {
                return 0;
            } else {

                int aux = -9999;
                int mejor = -9999;

                for (int i = 0; i < p.length; i++) {
                    for (int j = 0; j < p[0].length; j++) {

                        if (isVacia(i, j)) {

                            marcarCasilla(i, j, maquina);  //MARCA LA CASILLA COMO OCUPADA POR LA MAQUINA
                            aux = min();

                            if (aux > mejor) //VE SI LA POSICION ES OPTIMA
                            {
                                mejor = aux;
                            }

                            marcarCasilla(i, j, vacia);       //MARCA LA CASILLA COMO VACIA
                        }
                    }
                }
                return mejor;
            }
        }
    }

    private boolean isTabLLeno() {
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[0].length; j++) {
                if (p[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private void marcarCasilla(int i, int j, int valor) {
        p[i][j] = valor;
    }

    private boolean isVacia(int i, int j) {
        return p[i][j] == 0;
    }

}

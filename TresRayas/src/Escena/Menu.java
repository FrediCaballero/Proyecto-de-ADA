package Escena;

import Escenario.Escenario;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Menu extends javax.swing.JPanel {

    private JFrame frm;
    private final ImageIcon fondo;
    private ImageIcon humano;
    private ImageIcon robot;
    private ImageIcon x;
    private ImageIcon o;
    private boolean ismaquina;

    public Menu(JFrame frm) {
        initComponents();
        this.frm = frm;
        this.setSize(400, 600);
        this.fondo = img("fondo3.jpg");
        this.humano = escala(img("Persona 1.png"), 80, 70);
        this.lbl_modalidad.setBackground(new Color(0, 0, 0, 100));
        this.robot = escala(img("ai.png"), 70, 60);
        this.robot = escala(img("ai.png"), 70, 60);
        this.x = escala(img("marca-x.png"), 60, 60);
        this.o = escala(img("letra-o.png"), 50, 50);
        this.lbl_ficha1.setIcon(x);
        this.lbl_ficha2.setIcon(o);
        this.lbl_jugador1.setIcon(humano);
        this.lbl_jugador2.setIcon(robot);
        modalidad();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_jugador1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lbl_jugador1 = new javax.swing.JLabel();
        lbl_jugador2 = new javax.swing.JLabel();
        lbl_modalidad = new javax.swing.JLabel();
        txt_jugador2 = new javax.swing.JTextField();
        lbl_ficha1 = new javax.swing.JLabel();
        lbl_ficha2 = new javax.swing.JLabel();
        lbl_textoPlay = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 64)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GAME");

        txt_jugador1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txt_jugador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jPanel1.setOpaque(false);

        lbl_jugador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_jugador1MouseClicked(evt);
            }
        });

        lbl_jugador2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_jugador2MouseClicked(evt);
            }
        });

        lbl_modalidad.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_modalidad.setForeground(new java.awt.Color(255, 255, 255));
        lbl_modalidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_modalidad.setText("MODALIDAD");
        lbl_modalidad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_modalidad.setOpaque(true);
        lbl_modalidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_modalidadMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbl_jugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(lbl_jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addComponent(lbl_modalidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lbl_modalidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_jugador2, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(lbl_jugador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        txt_jugador2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txt_jugador2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbl_textoPlay.setFont(new java.awt.Font("Times New Roman", 1, 45)); // NOI18N
        lbl_textoPlay.setForeground(new java.awt.Color(255, 255, 255));
        lbl_textoPlay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_textoPlay.setText("PLAY");
        lbl_textoPlay.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        lbl_textoPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_textoPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_textoPlayMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_textoPlayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_textoPlayMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_ficha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_ficha2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_textoPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_jugador1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_jugador2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1)))
                .addGap(41, 85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_ficha1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_jugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_ficha2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbl_textoPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_textoPlayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_textoPlayMouseEntered
        lbl_textoPlay.setForeground(new java.awt.Color(102, 255, 51));
        lbl_textoPlay.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 3, 0, new java.awt.Color(102, 255, 51)));
    }//GEN-LAST:event_lbl_textoPlayMouseEntered

    private void lbl_textoPlayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_textoPlayMouseExited
        lbl_textoPlay.setForeground(new java.awt.Color(255, 255, 255));
        lbl_textoPlay.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, Color.white));
    }//GEN-LAST:event_lbl_textoPlayMouseExited

    private void lbl_modalidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_modalidadMouseClicked
        modalidad();
    }//GEN-LAST:event_lbl_modalidadMouseClicked

    private void lbl_textoPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_textoPlayMouseClicked
        if (txt_jugador1.getText().length() > 2 && txt_jugador2.getText().length() > 2) {
            frm.dispose();
            Juego tab = new Juego(txt_jugador1.getText(), txt_jugador2.getText(), ismaquina);
            Escenario frm2 = new Escenario();
            tab.setFrm(frm2);
            frm2.setSize(tab.getWidth(), tab.getHeight());
            frm2.setResizable(false);
            frm2.setLocationRelativeTo(null);
            frm2.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            frm2.add(tab, 0, 0);
            frm2.setTitle("3 en Rayas");
            frm2.setVisible(true);
             frm2.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent evt) {
                    frm.setVisible(true);
                    modalidad();
                }
            });
        } else {
            JOptionPane.showMessageDialog(this, "INGRESE NOMBRE");
        }
    }//GEN-LAST:event_lbl_textoPlayMouseClicked

    private void lbl_jugador1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_jugador1MouseClicked
        modalidad();
    }//GEN-LAST:event_lbl_jugador1MouseClicked

    private void lbl_jugador2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_jugador2MouseClicked
        modalidad();
    }//GEN-LAST:event_lbl_jugador2MouseClicked

    @Override
    public void paint(Graphics grphcs) {
        grphcs.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), null);
        setOpaque(false);
        super.paint(grphcs); //To change body of generated methods, choose Tools | Templates.
    }

    private ImageIcon escala(ImageIcon img, int ancho, int alto) {
        return new ImageIcon(img.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
    }

    private ImageIcon img(String nombre) {
        return new ImageIcon(getClass().getResource("/Imagen/" + nombre));
    }

    private void modalidad() {
        if ("HUMANO vs ROBOT".equals(lbl_modalidad.getText())) {
            lbl_modalidad.setText("HUMANO vs HUMANO");
            lbl_jugador1.setIcon(humano);
            lbl_jugador2.setIcon(humano);
            txt_jugador1.setText("");
             txt_jugador2.setText("");
            txt_jugador2.setEditable(true);
            ismaquina=false;
        } else {
            lbl_modalidad.setText("HUMANO vs ROBOT");
            lbl_jugador1.setIcon(humano);
            lbl_jugador2.setIcon(robot);
            txt_jugador2.setText("ROBOTO");
            txt_jugador2.setEditable(false);
            ismaquina=true;
        }
        this.lbl_modalidad.revalidate();
        jPanel1.updateUI();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_ficha1;
    private javax.swing.JLabel lbl_ficha2;
    private javax.swing.JLabel lbl_jugador1;
    private javax.swing.JLabel lbl_jugador2;
    private javax.swing.JLabel lbl_modalidad;
    private javax.swing.JLabel lbl_textoPlay;
    private javax.swing.JTextField txt_jugador1;
    private javax.swing.JTextField txt_jugador2;
    // End of variables declaration//GEN-END:variables
}

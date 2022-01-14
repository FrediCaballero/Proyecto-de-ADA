package Escena;

import Escenario.Escenario;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import scripts.Tablero;

public class Juego extends javax.swing.JPanel {

    private ImageIcon fondo;
    private ImageIcon x;
    private ImageIcon o;
    private Tablero tab;
    private JFrame frm;

    public Juego(String nombre1, String nombre2, boolean  maquina) {
        initComponents();
        this.setSize(400, 550);
        this.fondo = img("fondo3.jpg");
        this.x = escala(img("x.png"), 60, 60);
        this.o = escala(img("o.png"), 50, 50);
        this.lbl_jugador1.setIcon(x);
        this.lbl_jugador2.setIcon(o);
        this.tab = new Tablero(nombre1, nombre2, jPanel1, lbl_puntosX, lbl_puntosO,lbl_resultados);
       this. tab.setIsMaquina(maquina);
        this.jPanel2.setBackground(new Color(0, 0, 0, 100));
    }

    public void setFrm(JFrame frm) {
        this.frm = frm;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_puntosX = new javax.swing.JLabel();
        lbl_puntosO = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lbl_reiniciar = new javax.swing.JLabel();
        lbl_jugador1 = new javax.swing.JLabel();
        lbl_jugador2 = new javax.swing.JLabel();
        lbl_resultados = new javax.swing.JLabel();

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );

        lbl_puntosX.setBackground(new java.awt.Color(102, 255, 51));
        lbl_puntosX.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lbl_puntosX.setForeground(new java.awt.Color(102, 255, 51));
        lbl_puntosX.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lbl_puntosO.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lbl_puntosO.setForeground(new java.awt.Color(102, 255, 51));
        lbl_puntosO.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("FINALIZAR");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        lbl_reiniciar.setBackground(new java.awt.Color(0, 0, 0));
        lbl_reiniciar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbl_reiniciar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_reiniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_reiniciar.setText("REINICIAR");
        lbl_reiniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_reiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_reiniciarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addGap(177, 177, 177)
                .addComponent(lbl_reiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lbl_resultados.setBackground(new java.awt.Color(204, 0, 204));
        lbl_resultados.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_resultados.setForeground(new java.awt.Color(204, 0, 204));
        lbl_resultados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 43, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_jugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_puntosX, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_puntosO, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(lbl_resultados, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_jugador1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(lbl_jugador2, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(lbl_puntosO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_puntosX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_resultados, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_reiniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_reiniciarMouseClicked
        tab.reiniciar();
    }//GEN-LAST:event_lbl_reiniciarMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        frm.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_jugador1;
    private javax.swing.JLabel lbl_jugador2;
    private javax.swing.JLabel lbl_puntosO;
    private javax.swing.JLabel lbl_puntosX;
    private javax.swing.JLabel lbl_reiniciar;
    private javax.swing.JLabel lbl_resultados;
    // End of variables declaration//GEN-END:variables
}

/*
    EQUIPO 2: 
Arango Quispe, Esmeralda (19200300)
Caballero Leon, Fredi Alexander (18200076)
Magallanes Quiroz, Claudia Carolina (18200331)
Rivas Rodriguez, Catherine Lesly (18200289)
Rojas Rojas, Mauro Alexander (18200318)
======================================TRES EN RAYA========================================= 
Escenario , se usa como base para crear las interfaces de cada funcionalidad , en general del juego  
se invoca como clase para su creacion 
*/
package Escenario;

public class Escenario extends javax.swing.JFrame {
    
    public Escenario() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    
    public void sinBordes(){
        setUndecorated(false);
    }
public void todaPantalla(){
    setExtendedState(MAXIMIZED_BOTH);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}


package ventanas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ventana4 extends javax.swing.JFrame {

    
    public Ventana4() {
        initComponents();
        this.setLocationRelativeTo(null); //centro de la pantalla
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atras3 = new javax.swing.JButton();
        salir3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        area1 = new java.awt.TextArea();
        jLabel1 = new javax.swing.JLabel();
        p = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atras3.setBackground(new java.awt.Color(255, 102, 0));
        atras3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        atras3.setForeground(new java.awt.Color(0, 0, 0));
        atras3.setText("Atrás");
        atras3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atras3ActionPerformed(evt);
            }
        });
        getContentPane().add(atras3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, 100, 30));

        salir3.setBackground(new java.awt.Color(255, 102, 0));
        salir3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        salir3.setForeground(new java.awt.Color(0, 0, 0));
        salir3.setText("Salir");
        salir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir3ActionPerformed(evt);
            }
        });
        getContentPane().add(salir3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, 100, 30));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("<html>PLAGA R4T en PLANTACIONES de BANANO<html> ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 440, 40));
        getContentPane().add(area1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 560, 390));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/6.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    
    
    private void atras3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atras3ActionPerformed
        Ventana2 a= new Ventana2();//para acceder a la ventana 2
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_atras3ActionPerformed

    private void salir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir3ActionPerformed
        // TODO add your handling code here:
        System.exit(0); // cierra la ventana
    }//GEN-LAST:event_salir3ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextArea area1;
    private javax.swing.JButton atras3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel p;
    private javax.swing.JButton salir3;
    // End of variables declaration//GEN-END:variables
}

package ventanas;

public class Ventana2 extends javax.swing.JFrame {

    public Ventana2() {
        initComponents();
        this.setLocationRelativeTo(null); //centro de la pantalla
        
        //mostrar nombre
        Ventana1 p = new Ventana1();
        bienvenida.setText("Bienvenid@ "+p.name);
        
    }      
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cuadro = new javax.swing.JLabel();
        salir2 = new javax.swing.JButton();
        bienvenida = new javax.swing.JLabel();
        atras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sexto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        p = new javax.swing.JLabel();

        cuadro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir2.setBackground(new java.awt.Color(255, 102, 0));
        salir2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        salir2.setForeground(new java.awt.Color(0, 0, 0));
        salir2.setText("Salir");
        salir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir2ActionPerformed(evt);
            }
        });
        getContentPane().add(salir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 100, 30));

        bienvenida.setBackground(new java.awt.Color(255, 0, 0));
        bienvenida.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bienvenida.setForeground(new java.awt.Color(0, 0, 0));
        bienvenida.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                bienvenidaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 310, 30));

        atras.setBackground(new java.awt.Color(255, 102, 0));
        atras.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        atras.setForeground(new java.awt.Color(0, 0, 0));
        atras.setText("Atrás");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 100, 30));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("<html>PLAGA R4T en PLANTACIONES de BANANO<html> ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 440, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Selecciona la zona infectada de R4T");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 320, 30));

        sexto.setBackground(new java.awt.Color(0, 153, 0));
        sexto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sexto.setForeground(new java.awt.Color(255, 255, 255));
        sexto.setText("San Luis de Shuaro");
        sexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sextoActionPerformed(evt);
            }
        });
        getContentPane().add(sexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 180, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/6.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir2ActionPerformed
        // TODO add your handling code here:
        System.exit(0); // cierra la ventana
    }//GEN-LAST:event_salir2ActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        Ventana1 a= new Ventana1();//para acceder a la ventana 1
        a.setVisible(true); 
        this.setVisible(false);
    }//GEN-LAST:event_atrasActionPerformed

    private void bienvenidaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_bienvenidaAncestorAdded
        // TODO add your handling code here:        
    }//GEN-LAST:event_bienvenidaAncestorAdded

    private void sextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sextoActionPerformed
        // TODO add your handling code here:
        Ventana3 a= new Ventana3();//para acceder a la ventana 3
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_sextoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Ventana2().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JLabel bienvenida;
    private javax.swing.JLabel cuadro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel p;
    private javax.swing.JButton salir2;
    private javax.swing.JButton sexto;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancias2;

/**
 *
 * @author miguelangel
 */
public class MenuUsuario extends javax.swing.JFrame {

    /**
     * Creates new form MenuUsuario
     */
    public MenuUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        unidad1 = new javax.swing.JButton();
        unidad2 = new javax.swing.JButton();
        estancias3 = new javax.swing.JLabel();
        estancias2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Century Gothic", 1, 50)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Menu de Usuario");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jButton6.setBackground(new java.awt.Color(204, 204, 255));
        jButton6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton6.setText("Salir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 40, 130, 40));

        unidad1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        unidad1.setText("Seleccion de Evento");
        unidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidad1ActionPerformed(evt);
            }
        });
        getContentPane().add(unidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 460, 60));

        unidad2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        unidad2.setText("Consultar QR");
        unidad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidad2ActionPerformed(evt);
            }
        });
        getContentPane().add(unidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 460, 60));

        estancias3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        estancias3.setForeground(new java.awt.Color(255, 255, 255));
        estancias3.setText("Seleccionar operacion");
        getContentPane().add(estancias3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        estancias2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        estancias2.setForeground(new java.awt.Color(255, 255, 255));
        estancias2.setText("Estancias II");
        getContentPane().add(estancias2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 510, -1, -1));

        jButton7.setBackground(new java.awt.Color(204, 204, 255));
        jButton7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton7.setText("Inicio");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 40, 130, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/6bc831ded5c1e8f59a4f1ba55e9941d4.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void unidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidad1ActionPerformed
        ListaEventos obj = new ListaEventos();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_unidad1ActionPerformed

    private void unidad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidad2ActionPerformed
        ConsultarQR obj = new ConsultarQR();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_unidad2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Inicio obj = new Inicio();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel estancias2;
    private javax.swing.JLabel estancias3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton unidad1;
    private javax.swing.JButton unidad2;
    // End of variables declaration//GEN-END:variables
}

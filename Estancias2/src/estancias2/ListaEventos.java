package estancias2;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import java.util.Date;


/**
 *
 * @author miguelangel
 */
public class ListaEventos extends javax.swing.JFrame {

    ArrayList<String> CLAVE;
    Date fecha_actual = new Date();
    
    public ListaEventos() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        Busqueda();
    }
    //funcion creada para realizar la busqueda de todos los eventos activos en la tabla evento (dicho dato puede ser modificado dentro del primer select dentro de la funcion) se considera activo aquel evento 
    // que tiene menos de 20 min de tiempo para iniciar
    void Busqueda(){
        try {
            DefaultTableModel model= new DefaultTableModel();
            
            model.addColumn("Nombre");
            model.addColumn("Capacidad");
            model.addColumn("Fecha");
            model.addColumn("Hora de inicio");
            model.addColumn("Hora de fin");
            model.addColumn("Direccion");


            busqueda_table.setModel(model);
            CLAVE = new ArrayList();
            
            Date fecha_actual = new Date();
            
            String consultar="SELECT clave,nombre,capacidad,fecha,hora_inicio,hora_fin,calle,numero,cp,colonia FROM evento WHERE (now() BETWEEN (TIMESTAMP(fecha,hora_inicio) - INTERVAL 20 MINUTE) AND TIMESTAMP(fecha,hora_inicio)) and capacidad > 0";

            String []datos= new String[6];
            String dateInString,timeInString_inicio,timeInString_fin;
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(consultar);
            
            while(rs.next()){
                CLAVE.add(rs.getString(1));
                datos[0]=rs.getString(2);
                datos[1]=rs.getString(3);
                datos[2]=rs.getString(4);
                datos[3]=rs.getString(5);
                datos[4]=rs.getString(6);
                datos[5]="calle "+rs.getString(7)+", numero "+rs.getString(8)+", C.P "+rs.getString(9)+", colonia "+rs.getString(10);
             
                model.addRow(datos);
            }
          //  tbpro.setModel(model);
        } catch (SQLException ex) {
            showMessageDialog(null, "No hay eventos disponibles.");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        busqueda_table = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lista de Eventos Disponibles");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1270, 20));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Seleccionar el evento a donde se asistirá");
        jLabel18.setToolTipText("");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jButton7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton7.setText("Menu");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 40, 120, 40));

        jButton8.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton8.setText("Salir");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 40, 120, 40));

        busqueda_table.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        busqueda_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane1.setViewportView(busqueda_table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 1150, 340));

        jButton9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton9.setText("Ingresar Asistencia");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 190, 250, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/t7hNp4Q.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        MenuUsuario obj2 = new MenuUsuario();
        obj2.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        int fila = busqueda_table.getSelectedRow();
        //se manda la clave de la fila seleccionada una vez presionado este boton, dicha clave la recibe la interfaz grafica MarcarAsistencia
        if(fila!=-1){
            MarcarAsistencia inf = new MarcarAsistencia(CLAVE.get(fila));
            inf.setVisible(true);
            dispose();
        }else{
            showMessageDialog(null, "Seleccionar un lugar para ver su información.");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(ListaEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaEventos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable busqueda_table;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
    Conection cc = new Conection();
    Connection cn = cc.conexion();
}

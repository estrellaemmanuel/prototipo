
package Vistas_de_Administracion;

import Conexion.DBSetencias;
import Controlador.C_G_Proveedor;
import Vistas_de_Administracion.Actualizacion_de_datos.ActualizarProveedores;
import Vistas_de_Administracion.cargas_de_datos.DatosProveedores;
import esqueleto.Menu;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class AdministrarProveedores extends javax.swing.JFrame {
  public static String Searchs;
     C_G_Proveedor gg;
     DefaultTableModel modelo;
    
    public AdministrarProveedores() {
        initComponents();
        setLocationRelativeTo(this);
        gg = new C_G_Proveedor();
        modelo = new DefaultTableModel();
        actualizarTabla(DBSetencias.ConsultaSelectProveedores);

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4_ = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5_menu = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administrar Proveedores");

        jLabel2.setText("Proveedor");

        jButton5.setText("Buscar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable4_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Razon_Social", "Cuit", "Correo", "Calle", "Numero", "Telefono"
            }
        ));
        jTable4_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4_MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4_);

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5_menu.setText("Menu");
        jButton5_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5_menuActionPerformed(evt);
            }
        });

        jButton4.setText("Mostrar Todos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jButton5)
                        .addGap(40, 40, 40)
                        .addComponent(jButton4))
                    .addComponent(jButton5_menu))
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jButton1))
                        .addGap(68, 68, 68)
                        .addComponent(jButton2)
                        .addGap(82, 82, 82)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5)))
                .addGap(41, 41, 41)
                .addComponent(jButton5_menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(90, 90, 90)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    if(!jTable4_.getSelectionModel().isSelectionEmpty()){
        int row = jTable4_.getSelectedRow();
        int Onclick = (int) (jTable4_.getModel().getValueAt(row, 0)) ; 
        String ProductoNombre = (jTable4_.getModel().getValueAt(row, 1).toString()) ; 
        
        int reply = JOptionPane.showConfirmDialog(null, "Realmente desea eliminar el Proveedor  " +" - "+ProductoNombre+" ?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (reply == JOptionPane.YES_OPTION) {
            gg.EliminarProveedor(Onclick);
            JOptionPane.showMessageDialog(null, "El Proveedor fue eliminado correctamente");
            LimpiarTabla();
            actualizarTabla(DBSetencias.ConsultaSelectProveedores);
          
        }else {
           JOptionPane.showMessageDialog(null, "Se cancelo la operacion para eliminar el Proveedor");
        }
         }else{
               JOptionPane.showMessageDialog(null, "Para eliminar un Proveedor seleccione uno de la lista"); 
         
          }




    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       DatosProveedores dp= new DatosProveedores();
               dp.setVisible(true);
////////////        new Facturacion().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5_menuActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton5_menuActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     LimpiarTabla();
        actualizarTabla(DBSetencias.ConsultaSelectProveedores);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

          if(!jTable4_.getSelectionModel().isSelectionEmpty()){
           
           int row = jTable4_.getSelectedRow();
            int id=(int) (jTable4_.getModel().getValueAt(row, 0));
            String nombre=(jTable4_.getModel().getValueAt(row, 1).toString());
           int cuil= (int) (jTable4_.getModel().getValueAt(row, 2));
           String correo=(jTable4_.getModel().getValueAt(row, 3).toString());
           String calle=(jTable4_.getModel().getValueAt(row, 4).toString());
           int numero_calle = (int) (jTable4_.getModel().getValueAt(row, 5)) ; 
           int telefono = (int) (jTable4_.getModel().getValueAt(row, 6)) ;
     
          ActualizarProveedores Ap = new ActualizarProveedores();
          Ap.ObtenerInfo(id,nombre,cuil,correo,calle,numero_calle,telefono);
          Ap.setVisible(true);
          }else{
               JOptionPane.showMessageDialog(null, "Para modificar un Empleado seleccione uno de la lista"); 
         
          }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     LimpiarTabla();
        String Busqueda = txt_search.getText();
        gg.BuscarProveedor(Busqueda, jTable4_);


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable4_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4_MouseClicked
   
        try{
        int row = jTable4_.getSelectedRow();
        String Onclick = (jTable4_.getModel().getValueAt(row, 0).toString()) ;   
        System.out.println(Onclick);
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
        }
               }//GEN-LAST:event_jTable4_MouseClicked
  public void LimpiarTabla(){
         int rowCount = modelo.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
          modelo.removeRow(i);
          }
        actualizarTabla(DBSetencias.ConsultaSelectProveedores);
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton5_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable4_;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables



private void actualizarTabla(String consulta) {
        modelo = gg.mostrar(consulta);
        jTable4_.setModel(modelo);
        //Enable to hide "ID" - Disable to show "ID//
        //tabla.getColumnModel().removeColumn(tabla.getColumnModel().getColumn(0));
    }

   private void  Filter(String Query){
            // No se esta utilizando
        TableRowSorter<DefaultTableModel>  tr = new TableRowSorter<DefaultTableModel>(modelo);
        jTable4_.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(Query));
    }
}

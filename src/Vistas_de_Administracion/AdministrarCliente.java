/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas_de_Administracion;
////////////////////
////////////////////import Controlador.ControladorGeneral;
////////////////////import conexion.BaseDatos;
////////////////////import conexion.DBSetencias;
import Utilidades.ControladorPantalla;
import Vistas_de_Administracion.Actualizacion_de_datos.ActualizarCliente;
import Vistas_de_Administracion.cargas_de_datos.DatosCliente;
import esqueleto.Menu;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import javax.swing.JOptionPane;
//////////////import utilidades.ControladorPantalla;
/**
 *
 * @author daisi
 */
public final class AdministrarCliente extends javax.swing.JFrame {
    
//////////////     ControladorGeneral gg;
     DefaultTableModel modelo;
////////////     private ControladorPantalla refcontroladorPantalla;
     
    
    public AdministrarCliente() {
        initComponents();
        setLocationRelativeTo(this);

        
//////        windowEvent();
       
////////////////        gg = new ControladorGeneral();
////////////////        modelo = new DefaultTableModel();
////////////////        actualizarTabla(DBSetencias.consultaSelect);
        System.out.println("HOLA ");
        
    
        
    }        
  
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtvalorbuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        cboxfiltro = new javax.swing.JComboBox();
        jButton5_menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administrar Cliente");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Criterio:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Modificar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "Apellido", "Cuil", "Email", "Telefono", "Condcion Iva"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.Long.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        jButton2.setText("Mostrar Todos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cboxfiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DNI", "Nombre", "Apellido" }));
        cboxfiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxfiltroActionPerformed(evt);
            }
        });

        jButton5_menu.setText("Menu");
        jButton5_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5_menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5_menu)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cboxfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtvalorbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btnagregar)
                        .addGap(72, 72, 72)
                        .addComponent(jButton3)
                        .addGap(76, 76, 76)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtvalorbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(jButton2)
                    .addComponent(cboxfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jButton5_menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregar)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
       DatosCliente ac = new DatosCliente();
    
        ac.setVisible(true);
       
    }//GEN-LAST:event_btnagregarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            
            DefaultTableModel modelofoto;
//////////            conexion conectar = new conexion() {} ;
            String codBuscar ="";
            codBuscar = JOptionPane.showInputDialog("seleccione lo que desea buscar");
            
            
            
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }
             
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cboxfiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxfiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxfiltroActionPerformed

    private void jButton5_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5_menuActionPerformed
     Menu m = new Menu();
     m.setVisible(true);
     this.dispose();


    }//GEN-LAST:event_jButton5_menuActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ActualizarCliente ac = new ActualizarCliente();
         ac.setVisible(true);
       
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       AdministrarCliente form = new AdministrarCliente();
        form.setVisible(true);
  }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnagregar;
    public javax.swing.JComboBox cboxfiltro;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtvalorbuscar;
    // End of variables declaration//GEN-END:variables

    private void actualizarTabla(String consulta) {
//////////////////        modelo = gg.mostrar(consulta);
//////////////////        tabla.setModel(modelo);
//////////////////        tabla.getColumnModel().removeColumn(tabla.getColumnModel().getColumn(0));
    }

    // despues le agrego los chiches
////   private void windowEvent() {
////        this.addWindowListener(new WindowAdapter() {
////           @Override
////           public void windowClosing(WindowEvent e) {
////               int a ;
////                a=JOptionPane.showConfirmDialog(null,"Desea continuar con la salida"," ***Aviso***",JOptionPane.YES_NO_OPTION);
////        if(a==JOptionPane.YES_OPTION) {
////            JOptionPane.showMessageDialog(null," Nos vemos ");
////           Menu m = new Menu();
////           m.setVisible(true);
////        }
////        
////           }
////        });
////    }

}



package Controlador;

import Conexion.BaseDatos;
import Conexion.DBSetencias;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class ControladorGeneral extends DBSetencias {

    public DefaultTableModel modelo;
    public BaseDatos bd;
    public Connection conexion;

    public ControladorGeneral() {
        modelo = new DefaultTableModel();
        bd = new BaseDatos();
        conexion = bd.estableceConexion();
    }

    public DefaultTableModel mostrar(String consulta) {
        try {
            PreparedStatement ps = conexion.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            ControladorTabla.configura(rs, modelo);
            ControladorTabla.rellena(rs, modelo);
            
            
            return modelo;
        } catch (Exception e) {
            System.out.println("mos");
        }
        return modelo;
    }
    String SSQL;   
    
    public void BuscarCampo(String valor, String filtro, JTable table){
    
        String [] columnas ={"Nombre","Apellido","DNI","Cuil","Email","Telefono","Condicion_iva"};
        String [] registro = new String[7];
        modelo = new DefaultTableModel(null,columnas);
        
        
        if(filtro.equals("DNI")){
         
            String SSQL =("SELECT nombre,apellido,dni,cuil,email,telefono,condicion_iva" + "FROM basedatos.clientes WHERE dni LIKE '%"+valor+"%'"); 
              System.out.println("entraDni"+valor);
              
        }else if (filtro.equals("Nombre")){
        
            String SSQL ="SELECT nombre,apellido,dni,cuil,email,telefono,condicion_iva   FROM basedatos.clientes WHERE nombre = '"+valor+"'"; 
              System.out.println("entraNombre"+valor);
        }else {
             
            String SSQL ="SELECT nombre,apellido,dni,cuil,email,telefono,condicion_iva   FROM basedatos.clientes WHERE apellido = '"+valor+"'"; 
               System.out.println("entraApellido"+valor);
        }
  
      try {
            
            PreparedStatement ps = conexion.prepareStatement(SSQL);
            ResultSet rs = ps.executeQuery();  
            ControladorTabla.configura(rs, modelo);
            ControladorTabla.rellena(rs, modelo);
           // ControladorTabla.anhadeFilasBuscar(rs, modelo);        
            
            table.setModel(modelo);
            
            
            
            
            
            System.out.println("buscatable");
            
        } catch (Exception e) {
            System.out.println("errorbuscador");
        }  finally{
      
            if (conexion!=null){
                try {
                    conexion.close();   
                } catch (Exception ex) {
               
                System.out.println("error");
                }
            
            }
      
      }
        
           
    }
    
    
    public void BuscarProducto (String Search, JTable table){
        
        String[] columnas = {"Nombre", "Descripcion", "Precio", "Stock"};
        String[] registro = new String[4];
        modelo = new DefaultTableModel(null, columnas);
        
        if(Search != null){
            String ShootSql = "Select * from producto where Nombre LIKE '%"+ Search +"%'"; 
             try {
            
            PreparedStatement ps = conexion.prepareStatement(ShootSql);
            ResultSet rs = ps.executeQuery();  
            ControladorTabla.configura(rs, modelo);
            ControladorTabla.rellena(rs, modelo);
           // ControladorTabla.anhadeFilasBuscar(rs, modelo);        
            
            table.setModel(modelo);
            
            
            
            
            
            System.out.println("buscatable");
            
        } catch (Exception e) {
            System.out.println(e);
        }  
             
        }else{
            
        }
        
    }
    
    public void EliminarProducto (int Id){
        
        String[] columnas = {"Nombre", "Descripcion", "Precio", "Stock"};
        String[] registro = new String[4];
        modelo = new DefaultTableModel(null, columnas);
        
        if(Id > 0){
            String ShootSql = "Delete from producto where Id= ? "; 
             try {
            
                PreparedStatement preparedStmt = conexion.prepareStatement(ShootSql);
                preparedStmt.setInt(1, Id);
      
            //PreparedStatement ps = conexion.prepareStatement(ShootSql);
            //ResultSet rs = ps.executeQuery();  
            //ControladorTabla.configura(rs, modelo);
            //ControladorTabla.rellena(rs, modelo);
           // ControladorTabla.anhadeFilasBuscar(rs, modelo);        
            //table.setModel(modelo);
            preparedStmt.execute();
        } catch (Exception e) {
            System.out.println(e);
        }  
             
        }else{
            
        }
        
    }

    public void CargarClientes ( String  nombre, String apellido,int dni,int cuil, String email,int telefono,String condicion_iva) {
        try {
            
            PreparedStatement ps = conexion.prepareStatement(DBSetencias.consultaAnhadir);
            
            ps.setNString(1, nombre);
            ps.setNString(2, apellido);
            ps.setInt(3, dni);
            ps.setInt(4, cuil);
            ps.setNString(5, email);
            ps.setInt(6, telefono);
            ps.setNString(7,condicion_iva);
            
            
            
            
            ps.executeUpdate();
            System.out.println("actualiza");
            
        } catch (Exception e) {
            System.out.println("ya existe");
        }
                       
    }
    
     public void CrearProducto ( String  nombre, String Descripcion,int Precio,int Stock) {
        try {
            
            PreparedStatement ps = conexion.prepareStatement(DBSetencias.CrearNuevoProducto);
            ps.setNString(1, nombre);
            ps.setNString(2, Descripcion);
            ps.setInt(3, Precio);
            ps.setInt(4, Stock);
            
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "El producto fue creado correctamente");
        } catch (Exception e) {
            System.out.println(e);
        }
                       
    }
     
     public void ActualizarProducto ( int Id, String  nombre, String Descripcion,int Precio,int Stock) {
        try {
            
            PreparedStatement ps = conexion.prepareStatement(DBSetencias.ActualizarProducto);
            ps.setNString(1, nombre);
            ps.setNString(2, Descripcion);
            ps.setInt(4, Precio);
            ps.setInt(3, Stock);
            ps.setInt(5, Id);
            
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "El producto fue actualizado correctamente");
            
        } catch (Exception e) {
            System.out.println(e);
        }
                       
    }
     
     
    
     
}

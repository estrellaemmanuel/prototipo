/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.BaseDatos;
import Conexion.DBSetencias;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LUCAS
 */
public class C_G_Proveedor {
    
    public DefaultTableModel modelo;
    public BaseDatos bd;
    public Connection conexion;

    public C_G_Proveedor() {
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
            System.out.println("mosquito");
        }
        return modelo;
    }
    String SSQL;   
    
    public void BuscarCampo(String valor, String filtro, JTable table){
    
        String [] columnas ={"Razon_Social","Cuit","Correo","Calle","Numero","Telefono"};
        String [] registro = new String[6];
        modelo = new DefaultTableModel(null,columnas);
        
        
        if(filtro.equals("Cuit")){
         
            String SSQL =("SELECT id,cuil,razon_social,correo,telefono,calle,numero_calle  FROM basedatos.proveedores WHERE cuil LIKE '%"+valor+"%'"); 
    //     String SSQL =("SELECT id,cuil,razon_social,correo,telefono,calle,numero_calle" + "FROM basedatos.proveedores WHERE cuil LIKE '%"+valor+"%'"); 
            System.out.println("entracuil"+valor);
              
        }else if (filtro.equals("Razon_Social")){
        
            String SSQL ="SELECT id,razon_social,cuil,correo,telefono,calle,numero_calle  FROM basedatos.proveedores WHERE Razon_Social = '"+valor+"'"; 
              System.out.println("entra la razon "+valor);
        }else {
             
            String SSQL ="SELECT razon_social,cuil,correo,telefono,calle,numero_calle  FROM basedatos.proveedores WHERE calle = '"+valor+"'"; 
               System.out.println("entra calle"+valor);
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
    
    
    public void BuscarProveedor (String Search, JTable table){
        
        String[] columnas = {"Razon_Social","Cuit","Correo","Calle","Numero","Telefono"};
        String[] registro = new String[6];
        modelo = new DefaultTableModel(null, columnas);
        
        if(Search != null){
            String ShootSql = "Select * from proveedores where Razon_Social LIKE '%"+ Search +"%'"; 
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
    
    public void EliminarProveedor (int Id){
        
        String[] columnas = {"Razon_Social","Cuit","Correo","Calle","Numero","Telefono"};
        String[] registro = new String[6];
        modelo = new DefaultTableModel(null, columnas);
        
        if(Id > 0){
            String ShootSql = "Delete from proveedores where id= ? "; 
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
    
    
    
     public void CrearProveedor ( String razon_social, int cuil, String correo, String calle, int numero_de_calle , int telefono ) {
         
        try {
            
            PreparedStatement ps = conexion.prepareStatement(DBSetencias.CrearNuevoProveedores);
            
            ps.setNString(1, razon_social);
             ps.setInt(2, cuil);
            ps.setNString(3, correo);
            ps.setNString(4, calle);
            ps.setInt(5, numero_de_calle);
            ps.setInt(6, telefono);
            
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "El Proveedor fue creado correctamente");
        } catch (Exception e) {
            System.out.println(e);
        }
                       
    }
     
     public void ActualizarProveedor ( int id, String  razon_social,int cuil, String correo,String calle,int numero_calle, int telefono) {
        try {
            
            PreparedStatement ps = conexion.prepareStatement(DBSetencias.ActualizarProveedores);
         
        
            ps.setNString(1, razon_social);
            ps.setInt(2, cuil);
            ps.setNString(3, correo);
            ps.setNString(4, calle);
            ps.setInt(5, numero_calle);
            ps.setInt(6, telefono);
            ps.setInt(7, id);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "El Proveedor fue actualizado correctamente");
            
        } catch (Exception e) {
            System.out.println(e);
        }
                       
    }
     
     
    
}

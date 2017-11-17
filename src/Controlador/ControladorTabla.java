/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.table.DefaultTableModel;

    
/**
 *
 * @author daisi
 */
public class ControladorTabla {
    
 public static void rellena(ResultSet rs, DefaultTableModel modelo) {
        
     
        vaciaFilas(modelo);
        anhadeFilas(rs, modelo);
        
    }

    public static void vaciaFilas(final DefaultTableModel modelo) {
        try {
            while (modelo.getColumnCount() > 0) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            System.out.println("vac");
        }
    }

    public static void anhadeFilas(ResultSet rs, DefaultTableModel modelo) {
        try {
            while (rs.next()) {
                Object[] datosFila = new Object[modelo.getColumnCount()];
                for (int i = 0; i < modelo.getColumnCount(); i++) {
                    datosFila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(datosFila);
            }
        } catch (Exception e) {
            System.out.println("anh");
        }
    }
    
     
    public static void configura(ResultSet rs ,DefaultTableModel modelo){
        try {
            ResultSetMetaData metaDatos = rs.getMetaData();
            int nroColumnas = metaDatos.getColumnCount();
            Object [] etiquetas = new Object[nroColumnas];
            for (int i = 0; i < nroColumnas; i++) {
                etiquetas[i]= metaDatos.getColumnLabel(i+1);
            }
            modelo.setColumnIdentifiers(etiquetas);
            
        } catch (Exception e) {
            System.out.println("conf");
        }
    }
    
    public static DefaultTableModel anhadeFilasBuscar(String sentenciaSQL) {
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        try {
            ResultSet rsFotos = consulta (sentenciaSQL);
            ResultSetMetaData metaDatos = rsFotos.getMetaData();
            int nroColumnas = metaDatos.getColumnCount();
            Object [] etiquetas = new Object[nroColumnas];
            for (int i = 0; i < nroColumnas; i++) {
            etiquetas[i]= metaDatos.getColumnLabel(i+1);
            }
            modelo.setColumnIdentifiers(etiquetas);
            while (rsFotos.next()) {
                Object[] datosFila = new Object[modelo.getColumnCount()];
            
            for (int i = 0; i < modelo.getColumnCount(); i++) {
                datosFila[i]= rsFotos.getObject(i+1);
                
            }
            modelo.addRow(datosFila);
            }
        } catch (Exception e) {
            System.out.println("error buscar");
        }
        return modelo;
            
    } 
    
   
    
    
private static ResultSet consulta(String sentenciaSQL) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

}

    
         




/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class BaseDatos {
    
  public java.sql.Connection conexion;
    public String user = "root";
    public String pass = "";
    //public String host = "127.0.0.1";
   // public String puerto = "3306";
    public String baseDeDatos = "basedatos";
    public String url="jdbc:mysql://localhost/" +baseDeDatos;

    public Connection estableceConexion() {
        try {
            if (conexion != null) {
                return conexion;
            }
            Class.forName("com.mysql.jdbc.Connection");
          //  String urlConexion = "jdbc:mysql://" + host + ":" + puerto + "/" + baseDeDatos;
           //  String urlConexion = "jdbc:mysql://"  + ":" + "/" + baseDeDatos;
    
            conexion = DriverManager.getConnection(this.url, this.user, this.pass);
              JOptionPane.showMessageDialog(null, "conectado");
        } catch (Exception e) {
        }
        return conexion;
    }

    public void cierraConexion() {
        try {
            conexion.close();
        } catch (Exception e) {
        }
    }
}
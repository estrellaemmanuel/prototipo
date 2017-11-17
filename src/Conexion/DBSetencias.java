/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

////////////////////import Controlador.ControladorGeneral;
////////////////////import formularioprueba.AdministrarProducto;


/**
 *
 * @author daisi
 */
public class DBSetencias {
    
    //public static String Search;
    
    public static final String consultaSelect = "SELECT * FROM clientes";
    public static final String consultaAnhadir = "INSERT INTO clientes (nombre,apellido,dni,cuil,email,telefono,condicion_iva) values (?,?,?,?,?,?,?)";
   // public static final String consultaBuscardni = "SELECT nombre,apellido,dni,cuil,email,telefono,condicion_iva  FROM basedatos.clientes WHERE dni = (33)"; 
   //public static final String consultaBuscarnombre = "SELECT nombre,apellido,dni,cuil,email,telefono,condicion_iva  FROM basedatos.clientes WHERE nombre LIKE '"+valor+"'"; 
   //public static final String consultaBuscarapellido = "SELECT nombre,apellido,dni,cuil,email,telefono,condicion_iva  FROM basedatos.clientes WHERE apellido LIKE '"+valor+"'"; 

   public static final String consultaDelete= "DELETE FROM clientes WHERE id_cliente = ?";
   public static final String consultaActualiza= "UPDATE basedatos.clientes SET dni =(?), nombre=(?),  apellido=(?),  cuil=(?), email=(?) WHERE id_cliente=(?);";
 
   
   // Sentencias -> CRUD PRODUCTOS
   public static final String ConsultaSelectProducto = "SELECT * FROM producto";
   public static final String CrearNuevoProducto = "INSERT INTO producto(Nombre,Descripcion,Precio,Stock) values (?,?,?,?)";
   public static final String ActualizarProducto = "UPDATE producto SET Nombre = (?),Descripcion =(?),Precio = (?),Stock = (?) WHERE Id = ?"; 
  
 
// Sentencias -> CRUD EMPLEADOS
   public static final String ConsultaSelectEmpleado = "SELECT * FROM empleado";
   public static final String CrearNuevoEmpleado = "INSERT INTO empleado(Nombre,Apellido,DNI,Sueldo) values (?,?,?,?)";
   public static final String ActualizarEmpleado = "UPDATE empleado SET Nombre = (?),Apellido =(?),DNI = (?),Sueldo = (?) WHERE Id = ?"; 
  
// proveedores 
   public static final String ConsultaSelectProveedores = "SELECT * FROM proveedores";
   public static final String CrearNuevoProveedores = "INSERT INTO proveedores(razon_social,cuil,correo,calle,numero_calle,telefono) values (?,?,?,?,?,?)";
   public static final String ActualizarProveedores = "UPDATE proveedores SET razon_social =(?),cuil =(?),correo =(?), calle=(?),numero_calle=(?),telefono = (?) WHERE id = (?)"; 
  
    
   
}
   




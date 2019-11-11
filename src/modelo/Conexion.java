
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class Conexion 
{ 
    // Nombre del servidor,puerto y nombre del paquete.
    // jdbc:mysql LE DICE QUE HAY UN CONTROLADOR DE JAVA CON BASE DE DATOS y DESPUES LE DICE CON QUE TIPO DE DATO (MySql).

    private String Url ="jdbc:mysql://Localhost:3306/farper"; 
    
    // NOMBRE DE USUARIO
    private String Usuario ="root";
    
    // NO TIENE PASSWORD
    private String Clave ="";
    
    // Busca la libreria mysql Connector y driver
    private String Driver = "com.mysql.jdbc.Driver";
    
    // VARIABLE DE CONEXION, DE CLASE CONEXION
    
    Connection Conectar = null;
    
    
    public Conexion ()
    {
        /*try catch sirve para que el problema no se caiga  " evitar las lineas rojas" 
        exception, es para errores de java, y Exception SQLSERVER es base de datos.*/
        
        
        
        try 
        {
            Class.forName(Driver);
            //DriverManage, es un clase que conecta a la base de datos.
            Conectar = DriverManager.getConnection(Url,Usuario,Clave);
            
           
        }
        catch (ClassNotFoundException | SQLException e)
        {
           JOptionPane.showMessageDialog(null, "Error de conexion" + e);
        }
   }
    
    // el tipo de dato debe ser de tipo CONNECTION
    public Connection MeConecto ()
    {
        return Conectar;
    }
    
    public void MeDesconecto ()
    {
        Conectar = null;
        if (Conectar == null) 
        {
          JOptionPane.showMessageDialog(null, "Desconectado");
          
        }
    }
                    
                    
}

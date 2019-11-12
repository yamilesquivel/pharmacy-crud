
package controlador;

// Alta, baja ,modificacion de la base de datos

public class AbmVentas {
   private String Nom;
     private String ConsultaSql= "SELECT * FROM cliente;"; 
     private String AltaSql = "INSERT INTO cliente (NomCli) VALUES (?);";
     private String Borrar = "DELETE FROM cliente WHERE NomCli=(?);";
     
        
     
}

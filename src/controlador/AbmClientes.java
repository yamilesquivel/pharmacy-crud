
package controlador;

import modelo.Conexion;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;

// Alta, baja ,modificacion de la base de datos
public class AbmClientes {
    
     private String Nom;
     private String ConsultaSql= "SELECT * FROM cliente;"; 
     private String AltaSql = "INSERT INTO cliente (NomCli) VALUES (?);";
     private String Borrar = "DELETE FROM cliente WHERE NomCli=(?);";
     
    PreparedStatement Instruccion;
    ResultSet Muestra;
    DefaultListModel ModeloListaCliente = new  DefaultListModel();
    
    Conexion z =new Conexion(); 
    
     public AbmClientes (String Nom) 
    {
        this.Nom = Nom;
    }
     
       public AbmClientes ()
    {
        
    }
    
    public String getNom()
    {
        return Nom;
    }
    
     public void setNom(String Nom)
    {
        this.Nom=Nom;
    }
     
      public void Alta ()
    {
          try 
        {
            Instruccion = z.MeConecto().prepareStatement(AltaSql);     
            Instruccion.setString(1, this.getNom());

            int Registro = Instruccion.executeUpdate();
            if (Registro > 0) 
            {
                JOptionPane.showMessageDialog(null, "Registro guardado correctamente");
                z.MeConecto().close();  // esta instruccion en realidad se pone cuando el usuario aprieta el boton salir
                // estas ultimas 2 instrucciones son (X PEDAGOGÍA) para corroborar q ingresé cada registro 
            }
           
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No pudo ingresar los datos"+ e);
        }
    }
      
      
      public void Baja()
    {
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(Borrar);            

            Instruccion.setString(1,this.getNom());
            

            int RegistroElim = Instruccion.executeUpdate();
            
            if (RegistroElim > 0) 
            {
                JOptionPane.showMessageDialog(null, " Registro eliminado ");
                
            }
           
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "error al querer borrar un registro ");
        }
         
    }
    
      public void Modif (String NomNuevo)
      {
          String Cambia = "UPDATE cliente SET NomCli= '" + NomNuevo +"' WHERE NomCli ='" + this.getNom() +"';" ;
          try 
        {
            Instruccion = z.MeConecto().prepareStatement(Cambia);            

          

            int Registro = Instruccion.executeUpdate();
            if (Registro > 0) 
            {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                
            }
           
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Error al querer modificar el registro ");
        }
      }
    
      
      
      public DefaultListModel Muestro()
    {
        try 
        {  
            Instruccion = z.MeConecto().prepareStatement(ConsultaSql); 
            Muestra = Instruccion.executeQuery(); // muestra es una variable de tipo resultset
            
            while (Muestra.next())
            {
                
                ModeloListaCliente.addElement (Muestra.getString(2));
                
            }            
        } catch (Exception e) 
            
        {
            JOptionPane.showMessageDialog(null, "No pudo ingresar los datos"+ e);
        }
        
        return ModeloListaCliente;
    }
}

     
     
     
    


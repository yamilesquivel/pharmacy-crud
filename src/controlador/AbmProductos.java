
package controlador;
import modelo.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class AbmProductos 
{
    private String ListaLabSql = "SELECT * FROM laboratorio;";
    private String ListaDrogaSql = "SELECT * FROM droga;";
    DefaultListModel ModeloListadroga = new DefaultListModel();
    DefaultListModel ModeloListaLab = new DefaultListModel();
    
    PreparedStatement Instruccion;    
    ResultSet Muestra;
    
  //  DevuelveIdLab=
    
    Conexion z = new Conexion();

    public AbmProductos() 
    {
    }
     
    
     public DefaultListModel MuestroLab()
    {
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(ListaLabSql);
            Muestra = Instruccion.executeQuery();
            while   (Muestra.next())
            {
           //     System.out.println( Muestra.getString(2));
                ModeloListaLab.addElement(Muestra.getString(2));
            }           
            
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede mostrar los datos" + e);
        }
        
        return ModeloListaLab;
    }
     
     
     public DefaultListModel MuestroDroga()
    {
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(ListaDrogaSql);
            Muestra = Instruccion.executeQuery();
            while   (Muestra.next())
            {
           //     System.out.println( Muestra.getString(2));
                ModeloListadroga.addElement(Muestra.getString(2));
            }           
            
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede mostrar los datos" + e);
        }
        
        return ModeloListadroga;
        
    }
     
     public int BuscoIdCategoria (String NomCategoriaElegido)
    {
        int VarId=0;
      String DevuelveIdCatSql= "SELECT * FROM laboratorio WHERE NomLab ='" + NomCategoriaElegido + "';";
        try {
            Instruccion = z.MeConecto().prepareStatement(DevuelveIdCatSql);
            Muestra = Instruccion.executeQuery();
            while   (Muestra.next())
            {
                VarId= Muestra.getInt(1);
            }           
            
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "No puede mostrar los datos " + e);
        }
          return VarId;
    }
     
     public int BuscoIdDroga (String NomDrogaElegido)
    {
        int VarId=0;
       String DevuelveIdDrogaSql= "SELECT * FROM laboratorio WHERE NomLab ='" + NomDrogaElegido + "';";
        try {
            Instruccion = z.MeConecto().prepareStatement(DevuelveIdDrogaSql);
            Muestra = Instruccion.executeQuery();
            while   (Muestra.next())
            {
                VarId= Muestra.getInt(1);
            }           
            
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "No puede mostrar los datos " + e);
        }
          return VarId;
    }
}

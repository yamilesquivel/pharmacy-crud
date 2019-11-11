package controlador;
import modelo.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class AbmDroga 
{
    private String Nom;
    private String ConsultaSql = "SELECT * FROM droga;";     
    private String AltaSql = "INSERT INTO droga (NomDroga, laboratorio_idlaboratorio) VALUES (?,?)";
    private String Borrar = "DELETE FROM droga WHERE NomDroga = (?);";    
    
    private String ListaLabSql = "SELECT * FROM laboratorio;";
    
    /*
       private int VaridLab=0;
       public int getVaridLab()
       {
           return Varidlab;
       } si no lo declaro debajo como paramentro en el metodo, lo puedo declarar como global aca
    */
   
    
    DefaultListModel ModeloListadroga = new DefaultListModel();
    DefaultListModel ModeloListaLab = new DefaultListModel();
    PreparedStatement Instruccion;    
    ResultSet Muestra;
    
  //  DevuelveIdLab=
    
    Conexion z = new Conexion();
    
    public AbmDroga(String Nom) {
        this.Nom = Nom;
    }

    public AbmDroga() {
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }
    
    public void Alta(int VaridLab)
    {
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(AltaSql);            
            Instruccion.setString(1, this.getNom());
            
            Instruccion.setInt(2, VaridLab);
            
            int Registro = Instruccion.executeUpdate();
            if (Registro > 0) 
            {
                JOptionPane.showMessageDialog(null, "Registro guardado correctamente");
                z.MeConecto().close();
            }
           
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No pudo ingresar los datos");
        }
    }
    
    public void Baja()
    {
          try 
        {
            Instruccion = z.MeConecto().prepareStatement(Borrar);
            Instruccion.setString(1, this.getNom());
            int Registro = Instruccion.executeUpdate();
            if (Registro > 0) 
            {
                JOptionPane.showMessageDialog(null, "Registro eliminado");
            }
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Error al querer borrar un registro " + e);
        }      
    }
    
    public void Modif(String NomNuevo)
    {
        
        String Cambia ="UPDATE droga SET  NomDroga = '"+ NomNuevo+"' WHERE NomDroga = '"+ this.getNom() +"';";
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
            JOptionPane.showMessageDialog(null, "Error al querer modificar un registro " + e );
        }       
    }
    
    public DefaultListModel Muestro()
    {
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(ConsultaSql);
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
    
    public int BuscoId (String NomLabElegido)
    {
        int VarId=0;
       String DevuelveIdLabSql= "SELECT * FROM laboratorio WHERE NomLab ='" + NomLabElegido + "';";
        try {
            Instruccion = z.MeConecto().prepareStatement(DevuelveIdLabSql);
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

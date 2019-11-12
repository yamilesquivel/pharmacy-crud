
package controlador;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// Alta, baja ,modificacion de la base de datos

public class AbmLoguin
{
    private int id;
    private int NroLeg;
    private String Nom;
    private char Estado;
    private char Categoria;
    private String Usu;
    private String Clave;


    
    private String AltaSql = "INSERT INTO personal (`NroLeg`,`Nom`,`Estado`,`Categoria`,`Usu`,`Clave`) VALUES (?,?,?,?,?,?);";
    
    private String Borrar = "DELETE FROM personal WHERE NroLeg = (?);";
    
    
         
    Conexion z = new Conexion();
    PreparedStatement Instruccion;
    ResultSet MuestraLeg;
    
    

    
    public AbmLoguin() 
    {
    }

    public AbmLoguin(int NroLeg, String Nom, char Estado, char Categoria, String Usu, String Clave) 
    {
        this.NroLeg = NroLeg;
        this.Nom = Nom;
        this.Estado = Estado;
        this.Categoria = Categoria;
        this.Usu = Usu;
        this.Clave = Clave;
    }

 
    

    public String getNom() 
    {
        return Nom;
    }

    public void setNom(String Nom) 
    {
        this.Nom = Nom;
    }

    public String getUsu() 
    {
        return Usu;
    }

    public void setUsu(String Usu) 
    {
        this.Usu = Usu;
    }

    public String getClave() 
    {
        return Clave;
    }

    public void setClave(String Clave) 
    {
        this.Clave = Clave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNroLeg() {
        return NroLeg;
    }

    public void setNroLeg(int NroLeg) {
        this.NroLeg = NroLeg;
    }

    public char getCategoria() {
        return Categoria;
    }

    public void setCategoria(char Categoria) {
        this.Categoria = Categoria;
    }

    public char getEstado() {
        return Estado;
    }

    public void setEstado(char Estado) {
        this.Estado = Estado;
    }
 
    
    
    
    
    public void Alta()
    {
 
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(AltaSql);            

            Instruccion.setInt(1, this.getNroLeg());
            Instruccion.setString(2, this.getNom());
            Instruccion.setString(3, String.valueOf(this.getEstado()));
            Instruccion.setString(4, String.valueOf(this.getCategoria()));
            Instruccion.setString(5, this.getUsu());
            Instruccion.setString(6, this.getClave());

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

            Instruccion.setInt(1, this.getNroLeg());
            

            int RegistroElim = Instruccion.executeUpdate();
            if (RegistroElim > 0) 
            {
                JOptionPane.showMessageDialog(null, " Registro eliminado ");
                z.MeConecto().close();
            }
           
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "error al querer borrar el registro ");
        }
    }
    
    public void Modificacion(int legajo)
    {
        String Cambia ="UPDATE personal SET NroLeg = '"+ this.getNroLeg() +"', Nom = '"+ this.getNom()+"', Estado = '"+ this.getEstado() +"', Categoria = '"+ this.getCategoria() +"', Usu = '"+ this.getUsu() +"', Clave = '"+ this.getClave() +"' WHERE NroLeg = '"+ legajo +"';";
        
        try 
        {
            Instruccion = z.MeConecto().prepareStatement(Cambia);            

          

            int Registro = Instruccion.executeUpdate();
            if (Registro > 0) 
            {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                z.MeConecto().close();
            }
           
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No se pudo modificar el registro ");
        }

      
}
    
  public boolean BuscarLegajo (int nroLegajo)
  {
     String BuscarNro = "select Nom,Usu,Clave, Estado from personal where NroLeg = '" +nroLegajo+"';";
     boolean Encuentra=false;
      try 
      {
         Instruccion = z.MeConecto().prepareStatement(BuscarNro);
         MuestraLeg = Instruccion.executeQuery(); // para usar la instruccion select de SQL se usa ExecuteQuery
         
          if(MuestraLeg.next())
            {
                this.setNom( MuestraLeg.getString(1));
                this.setUsu( MuestraLeg.getString(2));
                this.setClave( MuestraLeg.getString(3));
                this.setEstado( MuestraLeg.getString(4).charAt(0));                
            }
          Encuentra = true;
      } 
      catch (Exception e) 
      {
          JOptionPane.showMessageDialog(null, "No encuentra ese numero de legajo " + e);
          Encuentra = false;
      }finally
      {
          return Encuentra;
      }
      
  }


}  

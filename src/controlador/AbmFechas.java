package controlador;
import modelo.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import javax.swing.JOptionPane;

// Alta, baja ,modificacion de la base de datos

public class AbmFechas {
    Date fechaactual;
    Date fechainicio;
    Date fechafin;

    public AbmFechas(Date fechaactual, Date fechainicio, Date fechafin) {
        this.fechaactual = fechaactual;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
    }

    public AbmFechas() 
    {
    }
 
    PreparedStatement Instruccion;
    ResultSet Muestra;
     private String AltaSql = "INSERT INTO categoria (fechainicio,fechaactual,fechafinal) VALUES (?,?,?);";
     
    Conexion c = new Conexion();
      
    public Date getFechaactual() {
        return fechaactual;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public Date getFechafin() {
        return fechafin;
    }
    
    
     public void Alta ()
    {
          try 
        {
            Instruccion = c.MeConecto().prepareStatement(AltaSql);     
             Instruccion.setDate(1,this.getFechainicio());
            Instruccion.setDate(2,this.getFechaactual());
            Instruccion.setDate(1,this.getFechafin());
            int Registro = Instruccion.executeUpdate();
            if (Registro > 0) 
            {
                JOptionPane.showMessageDialog(null, "Registro guardado correctamente");
                c.MeConecto().close(); 
                // esta instruccion en realidad se pone cuando el usuario aprieta el boton salir
                // estas ultimas 2 instrucciones son (X PEDAGOGÍA) para corroborar q ingresé cada registro 
            }
           
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No pudo ingresar los datos"+ e);
        }
    }
    
}

package accesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import alumnosbd.AlumnoPOO;
import alumnosbd.Nombre;
import alumnosbd.Nota;

public class AccesoDatos {
    private Connection conn;
    private Statement comandos;
    
public AccesoDatos(){
    try{
     Class.forName("com.mysql.cj.jdbc.Driver");
     conn=DriverManager.getConnection("jdbc:mysql://localhost/notasQuinto",
             "root","");
    
    comandos=conn.createStatement();
    } catch(ClassNotFoundException ex){
        System.out.println("Eror: No se encontró la BD");
        
    } catch(SQLException ex){
        System.out.println("Error: Usuario o pass incorrecto");
    }
}
 public void insertarAlumno(AlumnoPOO unAl){
     String sql="insert into alumnoPOO values("+unAl.getDni()+", '"+unAl.getNombreApe()+")";
 }

public void insertarNota(Nota n){
    String sql="insert into nota(dni,bimestre, valor, motivo) values("+n.getDni()+
            ", "+n.getNroBim()+", "+n.getNumero()+", "+n.getTipo()+")";



}

}


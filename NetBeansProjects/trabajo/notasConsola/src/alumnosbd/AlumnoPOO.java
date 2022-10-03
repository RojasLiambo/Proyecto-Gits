//Hecho en conjunto entre Axel Fenoglio y Javier Rojas
package alumnosbd;
import java.util.ArrayList;

public class AlumnoPOO{
 
    int dni;
    Nombre nombre;
    String correo;
    ArrayList<Nota> listaNotas;

    public AlumnoPOO(int dni, Nombre n) {
        this.dni = dni;
        this.nombre = n;
    }
    
    public double calcularPromedio(){
        double prom=0;
        double cantN=0;
        for(Nota a:listaNotas){
            prom += a.numero;
            cantN++;
            return prom;
        }
        double promC=prom/cantN;
        return promC;
        }

    @Override
    public String toString(){
        String info="Nombre del Alumno: "+nombre+"\nNota Promedio: "+calcularPromedio();
        return info;
    }
    
    /*---------------------------------------------------------------------*/
    
    //Getters y Setters
    
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombreApe() {
        String nomApe = nombre.getNombre() +nombre.getApellido();
        return nomApe;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<Nota> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Nota> listaNotas) {
        this.listaNotas = listaNotas;
    }
}

package alumnosbd;

public class Nombre {
    private String nombre;
    private String apellido;
    
    public Nombre(String n, String a){
        this.nombre = n;
        this.apellido = a;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
   
}

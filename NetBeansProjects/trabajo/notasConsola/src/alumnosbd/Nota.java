//Diego Liambo y Kiara Chunga
package alumnosbd;
import java.time.LocalDate;

public class Nota {
    protected double numero;
    private int dni;
    private String tipo;
    private int nroBim;
    private LocalDate fecha;

    public Nota(double numero, int dni, String tipo, int nroBim, LocalDate fecha) {
        this.numero = numero;
        this.dni = dni;
        this.tipo = tipo;
        this.nroBim = nroBim;
        this.fecha = fecha;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNroBim() {
        return nroBim;
    }

    public void setNroBim(int nroBim) {
        this.nroBim = nroBim;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
    
    
}


import java.util.ArrayList;

public class Lugar {
    protected String nombre;
    protected String direccion;
    protected int seguridad;
    protected ArrayList<Carretera> entrada = new ArrayList();
    protected Carretera salida = new Carretera();

    public Lugar() {
    }

    public Lugar(String nombre, String direccion, int seguridad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.seguridad = seguridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(int seguridad) {
        this.seguridad = seguridad;
    }

    public ArrayList<Carretera> getEntrada() {
        return entrada;
    }
    
    public String listEntrada(){
        String lugares="";
        for (Carretera carretera : entrada) {
            lugares+=""+carretera.toString()+"\n";
        }
        return lugares;
    }
    
    public void addEntrada(Carretera a){
        entrada.add(a);
    }

    public void setEntrada(ArrayList<Carretera> entrada) {
        this.entrada = entrada;
    }

    public Carretera getSalida() {
        return salida;
    }

    public void setSalida(Carretera salida) {
        this.salida = salida;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

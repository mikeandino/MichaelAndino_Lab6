public class Cancha extends Lugar{
    private String categoria;
    private boolean estado;

    public Cancha() {
        super();
    }

    public Cancha(String categoria, boolean estado, String nombre, String direccion, int seguridad) {
        super(nombre, direccion, seguridad);
        this.categoria = categoria;
        this.estado = estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cancha{" + "categoria=" + categoria + ", estado=" + estado + '}';
    }
    
}

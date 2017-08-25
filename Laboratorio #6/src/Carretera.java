
class Carretera {

    private int numero;
    private double distancia;
    private Lugar inicio;
    private Lugar fin;

    public Carretera() {
    }

    public Carretera(int numero, double distancia, Lugar inicio, Lugar fin) {
        this.numero = numero;
        this.distancia = distancia;
        this.inicio = inicio;
        this.fin = fin;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Lugar getInicio() {
        return inicio;
    }

    public void setInicio(Lugar inicio) {
        this.inicio = inicio;
    }

    public Lugar getFin() {
        return fin;
    }

    public void setFin(Lugar fin) {
        this.fin = fin;
    }

    @Override
    public String toString() {
        return "" + numero;
    }
}

package helloworld.liquidaciondiversos.modulo;

public class BienAfectado {

    private String descripcion;
    private Warranty garantia;
    private double valorANuevo;
    private double valorInicial;
    private int Antiguedad;

    public BienAfectado(String descripcion, Warranty garantia, double valorANuevo, double valorInicial, int antiguedad) {
        this.descripcion = descripcion;
        this.garantia = garantia;
        this.valorANuevo = valorANuevo;
        this.valorInicial = valorInicial;
        Antiguedad = antiguedad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Warranty getGarantia() {
        return garantia;
    }

    public double getValorANuevo() {
        return valorANuevo;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public int getAntiguedad() {
        return Antiguedad;
    }
}

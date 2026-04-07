package helloworld.liquidaciondiversos.modulo;

public class Poliza {

    private Product producto;
    private Cliente cliente;
    private double capitalAsegurado;

    public Poliza(Product prodcuto, Cliente cliente, double capitalAsegurado) {
        this.producto = prodcuto;
        this.cliente = cliente;
        this.capitalAsegurado = capitalAsegurado;
    }

    public Product getProdcuto() {
        return producto;
    }

    public void setProdcuto(Product prodcuto) {
        this.producto = prodcuto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getCapitalAsegurado() {
        return capitalAsegurado;
    }

    public void setCapitalAsegurado(double capitalAsegurado) {
        this.capitalAsegurado = capitalAsegurado;
    }
}

package helloworld.liquidaciondiversos.modulo;

public class Poliza {

    private Product prodcuto;
    private Cliente cliente;
    private double capitalAsegurado;

    public Poliza(Product prodcuto, Cliente cliente, double capitalAsegurado) {
        this.prodcuto = prodcuto;
        this.cliente = cliente;
        this.capitalAsegurado = capitalAsegurado;
    }

    public Product getProdcuto() {
        return prodcuto;
    }

    public void setProdcuto(Product prodcuto) {
        this.prodcuto = prodcuto;
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

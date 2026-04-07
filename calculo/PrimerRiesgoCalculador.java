package helloworld.liquidaciondiversos.calculo;

import helloworld.liquidaciondiversos.modulo.BienAfectado;
import helloworld.liquidaciondiversos.modulo.ProductWarranty;

public class PrimerRiesgoCalculador implements CalculadorPago {

    @Override
    public double calcularPago(BienAfectado bienAfectado, ProductWarranty garantia) {
        return Math.min(bienAfectado.getValorInicial(), garantia.getCapitalInsured());
    }
}

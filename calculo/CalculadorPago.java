package helloworld.liquidaciondiversos.calculo;

import helloworld.liquidaciondiversos.modulo.BienAfectado;
import helloworld.liquidaciondiversos.modulo.ProductWarranty;

public interface CalculadorPago {

        double calcularPago(BienAfectado bienAfectado, ProductWarranty productWarranty);

}

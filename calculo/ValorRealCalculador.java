package helloworld.liquidaciondiversos.calculo;

import helloworld.liquidaciondiversos.modulo.BienAfectado;
import helloworld.liquidaciondiversos.modulo.ProductWarranty;

public class ValorRealCalculador implements CalculadorPago {


    @Override
    public double calcularPago(BienAfectado bienAfectado, ProductWarranty productWarranty) {
        double ValorDepreciado = calculateBienDepreciado(bienAfectado.getValorInicial(),bienAfectado.getAntiguedad());

        return Math.min(ValorDepreciado,productWarranty.getCapitalInsured());
    }

    private double calculateBienDepreciado(double valorInicial, double antiguedad) {

        double depreciacion = antiguedad * 0.1;

        if(depreciacion > 0.8){
            depreciacion = 0.8;
        }

        return valorInicial * (1 - depreciacion);


    }
}

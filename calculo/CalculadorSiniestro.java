package helloworld.liquidaciondiversos.calculo;

import helloworld.liquidaciondiversos.modulo.*;

import java.util.ArrayList;
import java.util.List;

public class CalculadorSiniestro {


    public double calcular(Siniestro siniestro){
        Product producto;
        Risk riesgo;
        List<BienAfectado> bienesAfectados;
        double total=0;
        CalculadorPago calculador;
        double resultado;

        producto=siniestro.getPoliza().getProdcuto();
        riesgo=siniestro.getCausa();
        bienesAfectados=siniestro.getBienesAfectados();

        for (BienAfectado bienAfectado : bienesAfectados) {
            for (ProductWarranty productWarranty : producto.getProductWarranties()) {
                if (productWarranty.getRisk().equals(riesgo) && productWarranty.getWarranty().equals(bienAfectado.getGarantia())) {
                    if (!productWarranty.isExcluded()) {
                        calculador=CalculadorFactory.getCalculador(productWarranty.getPaymentType());
                        resultado=calculador.calcular(productWarranty.getCapitalInsured(), bienAfectado.getValorAfectado());
                        total+=resultado;
                    }
                }
            }
        }
        return total;
    }
}

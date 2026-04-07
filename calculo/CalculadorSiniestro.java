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
                if (productWarranty.getRisk().getCode().equals(riesgo.getCode()) && productWarranty.getWarranty().getCode().equals(bienAfectado.getGarantia().getCode())) {
                    if (!productWarranty.isExcluded()) {
                        calculador=CalculadorFactory.getCalculador(productWarranty.getPaymentType());
                        resultado=calculador.calcularPago(bienAfectado, productWarranty);
                        total+=resultado;
                    }
                    break;
                }
            }
        }
        return total;
    }
}

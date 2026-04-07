package helloworld.liquidaciondiversos.calculo;

import helloworld.liquidaciondiversos.modulo.PaymentType;

public class CalculadorFactory {

    public static CalculadorPago getCalculador(PaymentType tipo){
        if (tipo == PaymentType.PRIMER_RIESGO) {
            return new PrimerRiesgoCalculador();
        } else if (tipo == PaymentType.REPOSICION_NUEVO) {
            return new NuevoRiesgoCalculador();
        } else if (tipo == PaymentType.VALOR_REAL) {
            return new ValorRealCalculador();
        } else {
            throw new IllegalArgumentException("Tipo de pago no soportado: " + tipo);
        }
    }
}

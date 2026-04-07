package helloworld.liquidaciondiversos.calculo;

import helloworld.liquidaciondiversos.modulo.PaymentType;

public class CalculadorFactory {

    public static CaculadorPago getCalculador(PaymentType tipo){
        if (tipo == PaymentType.PRIMER_RIESGO) {
            return new CalculadorPrimerRiesgo();
        } else if (tipo == PaymentType.REPOSICION_NUEVO) {
            return new CalculadorReposicionNuevo();
        } else if (tipo == PaymentType.VALOR_REAL) {
            return new CalculadorValorReal();
        } else {
            throw new IllegalArgumentException("Tipo de pago no soportado: " + tipo);
        }
    }
}

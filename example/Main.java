package helloworld.liquidaciondiversos.example;


import helloworld.liquidaciondiversos.calculo.CalculadorSiniestro;
import helloworld.liquidaciondiversos.modulo.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BaseData baseData = new BaseData();

        Product producto = baseData.getProducts().get("HOGAR15");

        Cliente cliente = new Cliente("Juan", "12345678A", "Calle Falsa 123");

        Poliza poliza = new Poliza(producto, cliente, 10000);

        Warranty garantia = baseData.getWarranties().get("RO");

        BienAfectado bien = new BienAfectado(
                "Televisión robada",
                garantia,
                500,
                300,
                2
        );

        List<BienAfectado> bienes = new ArrayList<>();
        bienes.add(bien);

        Risk riesgo = baseData.getRisks().get("RO");

        Siniestro siniestro = new Siniestro(
                poliza,
                riesgo,
                bienes,
                LocalDate.now()
        );

        CalculadorSiniestro calculador = new CalculadorSiniestro();
        double total = calculador.calcular(siniestro);

        System.out.println("Total indemnización: " + total + " €");
    }

}

package helloworld.liquidaciondiversos.example;

import helloworld.liquidaciondiversos.modulo.Cliente;
import helloworld.liquidaciondiversos.modulo.Poliza;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        BaseData baseData=new BaseData();
        Cliente cliente=new Cliente("Juan Perez","12345678","Calle Falsa 123");
        Poliza poliza=new Poliza(baseData.getProduct(),cliente,10000);
    }

}

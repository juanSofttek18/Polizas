package helloworld.liquidaciondiversos.modulo;

import java.time.LocalDate;
import java.util.List;

public class Siniestro {

    private Poliza poliza;
    private Risk causa;
    private List<BienAfectado> bienesAfectados;
    private LocalDate fechaSiniestro;

    public Siniestro(Poliza poliza, Risk causa, List<BienAfectado> bienesAfectados, LocalDate fechaSiniestro) {
        this.poliza = poliza;
        this.causa = causa;
        this.bienesAfectados = bienesAfectados;
        this.fechaSiniestro = fechaSiniestro;
    }



    public Poliza getPoliza() {
        return poliza;
    }

    public Risk getCausa() {
        return causa;
    }

    public List<BienAfectado> getBienesAfectados() {
        return bienesAfectados;
    }
}

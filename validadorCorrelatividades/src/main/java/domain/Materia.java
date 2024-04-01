package domain;

import java.util.Collections;
import java.util.List;

public class Materia {
    private List<Materia> correlativas;

    public boolean sePuedeCursarTeniendoAprobadas(List<Materia> materias) {
        return materias.containsAll(this.correlativas);
    }

    public Materia(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }
}

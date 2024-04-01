package domain;

import java.util.List;

public class Alumno {
    private List<Materia> materiasAprobadas;

    public boolean puedeCursar(Materia unaMateria) {
        return unaMateria.sePuedeCursarTeniendoAprobadas(this.materiasAprobadas);
    }

    public Alumno(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
}

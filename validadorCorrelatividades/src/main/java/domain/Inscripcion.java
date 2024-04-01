package domain;

import java.util.List;

public class Inscripcion {
    private List<Materia> materiasAInscribirse;
    private Alumno alumno;

    public boolean aprobada() {
        return materiasAInscribirse.stream().allMatch(m -> this.alumno.puedeCursar(m));
    }

    public Inscripcion(List<Materia> materiasAInscribirse, Alumno alumno) {
        this.materiasAInscribirse = materiasAInscribirse;
        this.alumno = alumno;
    }
}

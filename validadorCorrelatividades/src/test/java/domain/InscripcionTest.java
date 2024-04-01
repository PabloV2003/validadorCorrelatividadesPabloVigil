package domain;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class InscripcionTest {

    @Test
    public void inscripcionAceptada() {

        Materia algoritmos = new Materia(null);
        Materia discreta = new Materia(null);

        List<Materia> correlativasDeSO = new ArrayList<>();
        correlativasDeSO.add(algoritmos);
        correlativasDeSO.add(discreta);
        Materia sistemasOperativos = new Materia(correlativasDeSO);

        List<Materia> materiasAprobadas = new ArrayList<>();
        materiasAprobadas.add(algoritmos);
        materiasAprobadas.add(discreta);
        Alumno pablo = new Alumno(materiasAprobadas);

        List<Materia> materiasAInscribirse = new ArrayList<>();
        materiasAInscribirse.add(sistemasOperativos);

        Inscripcion nuevaInscripcion = new Inscripcion(materiasAInscribirse, pablo);

        Assert.assertTrue(nuevaInscripcion.aprobada());


    }

    @Test
    public void inscripcionRechazada() { //ahora Pablo solo tiene aprobado algoritmos, y no discreta

        Materia algoritmos = new Materia(null);
        Materia discreta = new Materia(null);

        List<Materia> correlativasDeSO = new ArrayList<>();
        correlativasDeSO.add(algoritmos);
        correlativasDeSO.add(discreta);
        Materia sistemasOperativos = new Materia(correlativasDeSO);

        List<Materia> materiasAprobadas = new ArrayList<>();
        materiasAprobadas.add(algoritmos);
        Alumno pablo = new Alumno(materiasAprobadas);

        List<Materia> materiasAInscribirse = new ArrayList<>();
        materiasAInscribirse.add(sistemasOperativos);

        Inscripcion nuevaInscripcion = new Inscripcion(materiasAInscribirse, pablo);

        Assert.assertFalse(nuevaInscripcion.aprobada());
    }


}



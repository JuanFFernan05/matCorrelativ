package universidad;

import java.util.HashSet;


public class Inscripcion {
    private HashSet<Materia> materias;
    private Alumno alumno;

    public Inscripcion(Alumno alumno, HashSet<Materia> materias) {
        this.alumno = alumno;
        this.materias = materias;
    }

    public boolean aprobada(){
        return materias.stream().allMatch(materia -> materia.puedeInscribirse(alumno));
    }


}
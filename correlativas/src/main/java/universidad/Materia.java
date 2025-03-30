package universidad;

import java.util.HashSet;

public class Materia {
    private String nombre;
    private final HashSet<Materia> correlativas;

    public Materia(String nombre, HashSet<Materia> correlativas) {
        this.nombre = nombre;
        this.correlativas = correlativas;
    }

    public boolean puedeInscribirse(Alumno alumno) {
        return alumno.getMateriasAprobadas().containsAll(correlativas);
    }
}

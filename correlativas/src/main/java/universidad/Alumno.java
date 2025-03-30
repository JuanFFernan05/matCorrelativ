package universidad;

import lombok.Getter;

import java.util.HashSet;

public class Alumno {
    private String nombre;
    private String apellido;
    @Getter
    private HashSet<Materia> materiasAprobadas;

    public Alumno(String nombre, String apellido, HashSet<Materia> materiasAprobadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materiasAprobadas = materiasAprobadas;
    }
}


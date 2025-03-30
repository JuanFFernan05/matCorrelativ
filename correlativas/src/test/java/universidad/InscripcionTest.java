package universidad;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.HashSet;
import java.util.Set;



class InscripcionTest {

    // Inscripción valida :)
    @Test
    public void CorrectaInscripcion(){
        Materia ayed = new Materia("Algoritmos y Estructuras de Datos", new HashSet<>());
        Materia sypn = new Materia("Sistemas y Procesos de Negocio", new HashSet<>());
        Materia lyed = new Materia("Lógica y Estructuras Discretas", new HashSet<>());

        HashSet<Materia> correlativasPdep = new HashSet<>();
        correlativasPdep.add(ayed);
        correlativasPdep.add(lyed);
        Materia pdep = new Materia("Paradigmas de la programación", correlativasPdep);

        HashSet<Materia> correlativasAds = new HashSet<>();
        correlativasAds.add(ayed);
        correlativasAds.add(sypn);
        Materia ads = new Materia("Análisis de sistemas", correlativasAds);

        HashSet<Materia> matAprobDeMatias = new HashSet<>(Set.of(ayed, sypn, lyed, pdep, ads));
        Alumno matiasRiv = new Alumno("Matias", "Rivair", matAprobDeMatias);

        HashSet <Materia> correlativasDDS = new HashSet<>(Set.of(ads,pdep));
        Materia dds = new Materia("Análisis de Sistemas", correlativasDDS);

        HashSet <Materia> materiasDeInteres = new HashSet<>(Set.of(dds));
        Inscripcion inscripcionDisenio = new Inscripcion(matiasRiv, materiasDeInteres);

        Assertions.assertTrue(inscripcionDisenio.aprobada());
    }

    // Inscripción invalida (Matias no aprobó ads)
    @Test
    public void IncorrectaInscripcion(){
            Materia ayed = new Materia("Algoritmos y Estructuras de Datos", new HashSet<>());
            Materia sypn = new Materia("Sistemas y Procesos de Negocio", new HashSet<>());
            Materia lyed = new Materia("Lógica y Estructuras Discretas", new HashSet<>());

            HashSet<Materia> correlativasPdep = new HashSet<>();
            correlativasPdep.add(ayed);
            correlativasPdep.add(lyed);
            Materia pdep = new Materia("Paradigmas de la programación", correlativasPdep);

            HashSet<Materia> correlativasAds = new HashSet<>();
            correlativasAds.add(ayed);
            correlativasAds.add(sypn);
            Materia ads = new Materia("Análisis de sistemas", correlativasAds);

            HashSet<Materia> matAprobDeMatias = new HashSet<>(Set.of(ayed, sypn, lyed, pdep));
            Alumno matiasRiv = new Alumno("Matias", "Rivair", matAprobDeMatias);

            HashSet <Materia> correlativasDDS = new HashSet<>(Set.of(ads,pdep));
            Materia dds = new Materia("Análisis de Sistemas", correlativasDDS);

            HashSet <Materia> materiasDeInteres = new HashSet<>(Set.of(dds));
            Inscripcion inscripcionDisenio = new Inscripcion(matiasRiv, materiasDeInteres);

            Assertions.assertFalse(inscripcionDisenio.aprobada());
        }
    }

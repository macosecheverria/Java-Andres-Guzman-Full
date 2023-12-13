package org.aguzman.ejemplos.set;

import java.util.Set;
import java.util.TreeSet;

import org.aguzman.ejemplos.model.Alumno;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        Set<Alumno> sa = new TreeSet<>((a, b) -> b.getNombre().compareTo(a.getNombre()));
        sa.add(new Alumno("Marcos", 5));
        sa.add(new Alumno("Juan", 10));
        sa.add(new Alumno("Maria", 4));
        sa.add(new Alumno("Marquinho", 7));
        sa.add(new Alumno("Manuel", 5));

        System.out.println(sa);

        impimirAlumno(sa);

    }

    public static void impimirAlumno(Set<Alumno> alumno) {
        System.out.println(alumno);
    }
}

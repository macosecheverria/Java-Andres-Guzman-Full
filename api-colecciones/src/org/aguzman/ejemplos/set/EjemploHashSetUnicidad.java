package org.aguzman.ejemplos.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


import org.aguzman.ejemplos.model.Alumno;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {
        Set<Alumno> sa = new HashSet<>();
        sa.add(new Alumno("Marcos", 5));
        sa.add(new Alumno("Juan", 10));
        sa.add(new Alumno("Maria", 4));
        Alumno jose = new Alumno("Jose", 5);
        sa.add(jose);
        sa.add(jose);
        sa.add(new Alumno("Jose", 4));
        sa.add(new Alumno("Jose", 4));
        sa.add(new Alumno("Marquinho", 7));
        sa.add(new Alumno("Manuel", 5));

        System.out.println("Iterando usando un foreach");
        sa.forEach(el -> System.out.println(el.getNombre() + el.getNota()));

        System.out.println("Iterando usando while y iterator");

        Iterator<Alumno> it = sa.iterator();

        while (it.hasNext()) {
            Alumno a = it.next();
            System.out.println(a.getNombre() + a.getNota());
        }

        System.out.println("Usando Api Stream filter map");

        List<Alumno> alumnoMarquinho = sa.stream().filter(el -> el.getNombre() == "Marquinho").collect(Collectors.toList());

        System.out.println(alumnoMarquinho);

    }
}

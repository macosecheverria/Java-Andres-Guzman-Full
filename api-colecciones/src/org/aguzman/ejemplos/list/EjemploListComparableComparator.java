package org.aguzman.ejemplos.list;

//import java.util.Collections;
// import static java.util.Comparator.comparing;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.aguzman.ejemplos.model.Alumno;

public class EjemploListComparableComparator {
    public static void main(String[] args) {
        List<Alumno> sa = new ArrayList<>();
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

        
       // System.out.println("Ordenando el ArrayList<>()");
        // Collections.sort(sa, (a, b) -> b.getNota().compareTo(a.getNota()));

        // System.out.println("Ordenando una lista con List.sort()");
        // sa.sort((a,b) -> b.getNombre().compareTo(a.getNombre()));

        // System.out.println("Ordenando con List.sort(Comparator.comparing())");
        // sa.sort(Comparator.comparing(Alumno::getNota).reversed());
        
        System.out.println("Ordendo de con el Api Stream List.stream().sorted");
        List<Alumno> newListAlumnoSorted = sa.stream().sorted().map(el -> el).collect(Collectors.toList());
        System.out.println(newListAlumnoSorted);


        System.out.println("Iterando usando un foreach");
        sa.forEach(el -> System.out.println(el.getNombre() + el.getNota()));

        System.out.println("Iterando usando while y iterator");

        Iterator<Alumno> it = sa.iterator();

        while (it.hasNext()) {
            Alumno a = it.next();
            System.out.println(a.getNombre() + a.getNota());
        }

        System.out.println("Usando Api Stream filter map");

        List<Alumno> alumnoMarquinho = sa.stream().filter(el -> el.getNombre() == "Marquinho")
                .collect(Collectors.toList());

        System.out.println(alumnoMarquinho);
    }
}

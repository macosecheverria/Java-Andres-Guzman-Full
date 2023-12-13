package org.aguzman.ejemplos.list;

import java.util.ArrayList;
import java.util.List;
import org.aguzman.ejemplos.model.Alumno;

public class EjemploArrayList {
    public static void main(String[] args) {
        List<Alumno> al = new ArrayList<>();
        System.out.println(al + ", size  = " + al.size());
        System.out.println("esta vacia = " + al.isEmpty());
        al.add(new Alumno("Marcos", 5));
        al.add(new Alumno("Juan", 10));
        al.add(new Alumno("maria", 4));
        al.add(0 ,new Alumno("Marquinho", 7));
        al.add(new Alumno("Manuel", 5));
        al.set(2, new Alumno("Maria", 4));
        al.add(new Alumno("Eliminar1", 1));
        al.add(new Alumno("Eliminar2", 1));
        System.out.println(al + ", size  = " + al.size());

        al.remove(new Alumno("Eliminar1", 1)); //eliminado por instancia
        //al.remove(6); //eliminado por el indice
        System.out.println(al + ", size = " + al.size());

        boolean containMaria = al.contains(new Alumno("Maria", 4));
        System.out.println("contiene a maria? = " + containMaria);

    }
}

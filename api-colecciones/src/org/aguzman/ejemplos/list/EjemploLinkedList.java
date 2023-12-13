package org.aguzman.ejemplos.list;

import java.util.LinkedList;
import java.util.ListIterator;

import org.aguzman.ejemplos.model.Alumno;

public class EjemploLinkedList {
    public static void main(String[] args) {
        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada + ", size  = " + enlazada.size());
        System.out.println("esta vacia = " + enlazada.isEmpty());
        enlazada.add(new Alumno("Marcos", 5));
        enlazada.add(new Alumno("Juan", 10));
        enlazada.add(new Alumno("maria", 4));
        enlazada.add(new Alumno("Marquinho", 7));
        enlazada.add(new Alumno("Manuel", 5));
        System.out.println(enlazada + ", size  = " + enlazada.size());

        enlazada.addFirst(new Alumno("Zeus", 5));
        enlazada.addLast(new Alumno("Kratos", 8));
        System.out.println(enlazada + ", size = " + enlazada);

        System.out.println("Primero = " + enlazada.getFirst());
        System.out.println("Ultimo = " + enlazada.getLast());
        System.out.println("Indice 2 = " + enlazada.get(2));

        // La diferencia entre getFirst && getLast con peekFirst es que los get regresan
        // una excepcion si la lista esta vacia y el peek regresa un null
        System.out.println("Primero peek = " + enlazada.peekFirst());
        System.out.println("Ultimo peek = " + enlazada.peekFirst());

        // es lo mismo que deje en el comentario de arriba remove regresa una excepcion
        // si el arreglo no tiene elementos y el poll regresa un null
        enlazada.removeFirst();
        enlazada.removeLast();
        enlazada.pollFirst();
        enlazada.pollLast();
        System.out.println(enlazada + ", size = " + enlazada);

        // tambien se pueden eliminar por el indice o la instancia
        enlazada.add(new Alumno("Eliminar1", 2));
        enlazada.remove(new Alumno("Eliminar1", 2));

        Alumno alumnoLucas = new Alumno("Lucas", 5);
        System.out.println("Indice de lucas: " + enlazada.indexOf(alumnoLucas));

        // para cambiar el valor de un arreglo
        enlazada.set(2, new Alumno("Ramon",4));

        ListIterator<Alumno> li = enlazada.listIterator();

        System.out.println("====== Iterator Next ======");
        while (li.hasNext()) {
            Alumno alumno = li.next();
            System.out.println(alumno);
        }

        System.out.println("====== Iterator Previous ======");
        while (li.hasPrevious()) {
            Alumno alumno = li.previous();
            System.out.println(alumno);
        }
        
    }
}

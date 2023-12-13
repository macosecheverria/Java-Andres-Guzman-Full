package org.aguzman.ejemplos.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {

        Set<String> ts = new TreeSet<>(Comparator.reverseOrder());
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");

        System.out.println("ts" + ts);

        Set<Integer> numIntegers = new TreeSet<>((a, b) -> b.compareTo(a));
        numIntegers.add(1);
        numIntegers.add(5);
        numIntegers.add(2);
        numIntegers.add(3);
        numIntegers.add(4);

        System.out.println(numIntegers);
    }
}

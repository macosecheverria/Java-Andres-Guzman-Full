package org.aguzman.poosobrecarga;

import static org.aguzman.poosobrecarga.Calculadora.*;

public class EjemploSobrecarga {
    public static void main(String[] args) {

        System.out.println("Sumar cinco int: " + sumar(20,21,22,23,24,25));
        System.out.println("Sumando float + n int : " + sumar(20f, 2,3,5,7,8));
        System.out.println("Sumando n float: " + sumar(10f,10f,40f,3f));
        System.out.println("Sumar int: " + sumar(10,10));
        System.out.println("Sumar float: " + sumar(10f, 10.0));
        System.out.println("Sumar float-int: " + sumar(10f,10));
        System.out.println("Sumar int-float: " + sumar(10, 10f));
        System.out.println("Sumar double: " + sumar(10d, 10d));
        System.out.println("Sumar String: " + sumar("10", "10"));
        System.out.println("Sumar tres int: " +  sumar(2,20,3));

        System.out.println("Sumar long: " + sumar(10l, 5l));
        System.out.println("Sumar int: " + sumar(10, '@'));
        System.out.println("Sumar float: " + sumar(10f, '@'));
    }
}

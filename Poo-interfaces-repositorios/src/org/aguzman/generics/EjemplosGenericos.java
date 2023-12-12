package org.aguzman.generics;

import org.aguzman.poointerface.modelo.Cliente;
import org.aguzman.poointerface.modelo.ClientePremium;

import java.util.Arrays;
import java.util.List;

public class EjemplosGenericos {
    public static void main(String[] args) {

        List<Cliente> cliente = List.of(new Cliente("Marcos", "Echeverria"));
        System.out.println(cliente);

        Cliente[] arreglosClientes = {
                new Cliente("Juan","Echeverria"),
                new Cliente("Maria","Ramirez"),
                new Cliente("Renato", "Trinidad"),
                new Cliente("Hugo", "Medina")
        };

        Integer[] arreglosEnteros = {1,3,4,5,6,7,8};

        List<Cliente> clientes2 = fromArrayToList(arreglosClientes);
        List<Integer> enterosLista = fromArrayToList(arreglosEnteros);

        clientes2.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombresEnteros = fromArrayToList(
                new String[]{"marcos", "Lucas", "Jose"}, arreglosEnteros);
        nombresEnteros.forEach(System.out::println);

        List<ClientePremium> clientePremium = fromArrayToList(
                new ClientePremium[]{new ClientePremium("Marcos","Echeverria")});


        imprimirClientes(cliente);
        imprimirClientes(clientes2);
        imprimirClientes(clientePremium);

        System.out.println("Maximo de 1,  9, 4 es: " + maximo(1,9,4));
        System.out.println("Maximo de 3.9, 11.5 y 7.78 es: " + maximo(3.9, 11.5, 7.78));
        System.out.println("Maximo de zanahorias, arandanos, manzana es: " +
                maximo("zanahorias", "arandanos", "manzana"));
    }

    public static  <T> List<T> fromArrayToList(T[] arr){
        return Arrays.asList(arr);
    }

    public static <T extends  Number> List<T> fromArrayToList(T[] arr) { return Arrays.asList(arr); }

    public static <T extends  Cliente> List<T> fromArrayToList(T[] arr) { return Arrays.asList(arr); }

    public static  <T, G> List<T> fromArrayToList(T[] arr, G[] x){
        for (G elemento: x) {
            System.out.println(elemento);
        }

        return Arrays.asList(arr);
    }

    public static void imprimirClientes(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T maximo(T a, T b , T c){
        T max = a;

        if(b.compareTo(max) > 0) {
            max = b;
        }

        if(c.compareTo(max) > 0){
            max = c;
        }

        return max;
    }
}

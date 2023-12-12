package org.aguzman.genericsclass;
public class EjemploGenericos {
    public static void main(String[] args) {
        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Peregrino", "caballo"));
        transporteCaballos.add(new Animal("Grillo", "caballo"));
        transporteCaballos.add(new Animal("Tunquen", "caballo"));
        transporteCaballos.add(new Animal("Topocalma", "caballo"));
        transporteCaballos.add(new Animal("Longotoma", "caballo"));

        transporteCaballos.forEach(el -> System.out.println(el.getNombre() +  el.getTipo()));


        Camion<Maquinaria> transporteMaquinas = new Camion<>(3);
        transporteMaquinas.add(new Maquinaria("Bulldozer"));
        transporteMaquinas.add(new Maquinaria("Grua Horquilla"));
        transporteMaquinas.add(new Maquinaria("Perforadora"));

        transporteMaquinas.forEach(el -> System.out.println(el.getTipo()));

        Camion<Automovil> transporteAutomovil = new Camion<>(3);
        transporteAutomovil.add(new Automovil("Toyota"));
        transporteAutomovil.add(new Automovil("Mitsubishi"));
        transporteAutomovil.add(new Automovil("Chevrolet"));

        transporteAutomovil.forEach(el -> System.out.println(el.getMarca()));
    }

}

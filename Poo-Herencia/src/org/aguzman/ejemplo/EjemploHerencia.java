package org.aguzman.ejemplo;

import org.aguzman.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("=====  Creando la instancia de la clase alumno =====");
        Alumno alumno =  new Alumno();
        alumno.setNombre("Marcos");
        alumno.setApellido("Echeverria");
        alumno.setInstitucion("Instituto Nacional");
        alumno.setNotaCastellano(8.5);
        alumno.setNotaHistoria(10.0);
        alumno.setNotaMatematica(9.5);


        System.out.println("=====  Creando la instancia de la clase alumnoInternacional  =====");
        AlumnoInternacional alumnoInter = new AlumnoInternacional();
        alumnoInter.setNombre("Ryan");
        alumnoInter.setApellido("Gosling");
        alumnoInter.setPais("Reino Unido");
        alumnoInter.setInstitucion("Instituto Nacional");
        alumnoInter.setNotaIdiomas(6.5);
        alumnoInter.setNotaCastellano(5.0);
        alumnoInter.setNotaHistoria(8.0);
        alumnoInter.setNotaMatematica(8.0);


        System.out.println("=====  Creando la instancia de la  clase Profesor ===== ");
        Profesor profesor = new Profesor();
        profesor.setNombre("Jon");
        profesor.setApellido("Mircha");
        profesor.setAsignatura("Programacion");


        System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Alumno Internacional: " + alumnoInter.getNombre() + " "
                + alumnoInter.getApellido() + "con pais de origen: " + alumnoInter.getPais());
        System.out.println("Profesor de " + profesor.getAsignatura() + ": "
                + profesor.getNombre() + profesor.getApellido());

        Class clase = alumnoInter.getClass();

        while (clase.getSuperclass() != null){
            String claseHija = clase.getName();
            String clasePadre = clase.getSuperclass().getName();

            System.out.println(claseHija + " es una clase hija de la clase padre " + clasePadre);

            clase = clase.getSuperclass();
        }
    }
}

package org.aguzman.ejemplo;

import org.aguzman.pooherencia.*;

public class EjemploHerenciaToString {
    public static void main(String[] args) {

        Alumno alumno = new Alumno("Marcos" ,"Echeverria", 14, "Instituto Nacional");
        alumno.setInstitucion("Instituto Nacional");
        alumno.setEmail("marcosEcheverria@gmail.com");
        alumno.setNotaCastellano(8.5);
        alumno.setNotaHistoria(10.0);
        alumno.setNotaMatematica(9.5);

        AlumnoInternacional alumnoInt = new AlumnoInternacional("Ryan", "Gosling", "Reino Unido");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setEmail("ryangosling@gmail.com");
        alumnoInt.setNotaIdiomas(6.5);
        alumnoInt.setNotaCastellano(5.0);
        alumnoInt.setNotaHistoria(8.0);
        alumnoInt.setNotaMatematica(8.0);

        Profesor profesor = new Profesor("Jon","Mircha","Programacion");
        profesor.setEdad(40);
        profesor.setEmail("jonmircha@gmail.com");

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);
        }

        public static void imprimir(Persona persona){
            System.out.println(persona.toString());
        }
}

package org.aguzman.ejemplo;

import org.aguzman.pooherencia.*;

public class EjemploHerenciaConstructores {
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
            System.out.println("Nombre: " + persona.getNombre() + " Apellido: " + persona.getApellido()
                    + " Edad: " + persona.getEdad() + " Email: " + persona.getEmail());

            if(persona instanceof  Alumno){
                System.out.println("Institucion: " + (((Alumno) persona).getInstitucion()));
                System.out.println("Notas Matematicas: " + ((Alumno)persona).getNotaMatematica());
                System.out.println("Notas Castellano: " + ((Alumno)persona).getNotaCastellano());
                System.out.println("Notas Historia: " + ((Alumno)persona).getNotaHistoria());

                if(persona instanceof  AlumnoInternacional){
                    System.out.println("Notas Idiomas" + ((AlumnoInternacional) persona).getNotaIdiomas());
                    System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
                }

                System.out.println("========= sobre escritura promedio ========== ");
                System.out.println("Promedio: " + ((Alumno) persona).calcularPromedio());
                System.out.println("========= sobre escritura promedio ==========");
            }

            if(persona instanceof  Profesor){
                System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
            }

            System.out.println("========= sobre escrituta saludar ==========");
            System.out.println(persona.saludar());

            System.out.println("=================================");

        }
}

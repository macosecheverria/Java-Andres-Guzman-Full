package org.azguzman.poointerfaces.imprenta;

import org.azguzman.poointerfaces.imprenta.modelo.*;
import  static  org.azguzman.poointerfaces.imprenta.modelo.Genero.*;
import static org.azguzman.poointerfaces.imprenta.modelo.Imprimible.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv  = new Curriculo(new Persona("John ","Doe") ,
                "Ingeniero en Informatica","Resumel Laboral");

        cv.addExperiencia("Java")
                .addExperiencia("Postgres")
                .addExperiencia("Spring Framawork")
                .addExperiencia("Node js + Typescript")
                .addExperiencia("Desarrollador Fullstack")
                .addExperiencia("Reactjs");

        Libro libro = new Libro(new Persona("Erich ","Gamma"),
                "Patrones de Diseños: Elem. Reusables POO", CIENCIA_FICCION);
        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Facade"));


        Informe informe = new Informe(new Persona("Martin ","Fowler"),
               new Persona( "James","Gosling"),
                "Estudio sobre microservicio");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        Imprimible objImp = () -> "Imprimiendo un objeto de una clase anonima";

        imprimir(objImp);

        System.out.println(TEXTO);

    }

}

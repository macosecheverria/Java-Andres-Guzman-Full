package org.azguzman.poointerfaces.imprenta.modelo;

public enum Genero {
    DRAMA("drama"),
    ACCION("accion"),
    AVENTURA("aventura"),
    TERROR("terror"),
    CIENCIA_FICCION("ciencia ficcion"),
    PROGRAMACION("programacion");


    private final String genero;

    Genero(String genero){
        this.genero = genero;
    }
}

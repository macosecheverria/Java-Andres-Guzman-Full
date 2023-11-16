package org.azguzman.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja implements Imprimible{

    private Persona persona;
    private String carrera;
    private List<String> experencias;


    public Curriculo(Persona persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experencias = new ArrayList<>();
    }

    public Curriculo addExperiencia(String exp) {
        this.experencias.add(exp);
        return  this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append(persona).append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n").append("Profesion: ")
                .append(this.carrera).append("\n")
                .append("Experiencias : \n");

        for (String el : experencias) {
            sb.append("- ").append(el).append("\n");
        }

        return sb.toString();
    }
}

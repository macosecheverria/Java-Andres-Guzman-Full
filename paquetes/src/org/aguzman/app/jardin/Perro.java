package org.aguzman.app.jardin;

import org.aguzman.app.hogar.Persona;

public class Perro {

    protected String nombre;
    protected String color;
    protected String raza;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    String jugar(Persona persona){
        return  persona.lanzarPelota();
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", raza='" + raza + '\'' +
                '}';
    }
}

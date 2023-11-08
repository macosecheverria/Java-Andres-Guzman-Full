package org.aguzman.app.jardin;

import org.aguzman.app.hogar.*;
import static org.aguzman.app.hogar.Persona.*;
import static  org.aguzman.app.hogar.ColorPelo.*;

public class EjemplosPaquetes {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Marcos");
        persona.setApellido("Ramirez");
        persona.setColorPelo(NEGRO);

        System.out.println("Nombre de la persona : " + persona.getNombre());
        System.out.println("Apellido de la persona: " + persona.getApellido());

        Perro roki  = new Perro();
        roki.setNombre("Roki");
        roki.setColor("Blanco");
        roki.setRaza("Pitbull");

        System.out.println("Color del perro: " + roki.getColor());

        String jugando = roki.jugar(persona);
        System.out.println(jugando);

        String  saludar = saludar();
        System.out.println(saludar);

        String generoHombre =  GENERO_MASCULINO;
        String generoMujer = GENERO_FEMENINO;

        System.out.println(generoHombre);
        System.out.println(generoMujer);

    }

}

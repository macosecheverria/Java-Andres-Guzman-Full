package poo.aguzman.clasesabstractas.form;

import poo.aguzman.clasesabstractas.form.elementos.*;
import poo.aguzman.clasesabstractas.form.elementos.select.Opcion;
import poo.aguzman.clasesabstractas.form.validador.*;

import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador());

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new RequeridoValidador())
                .addValidador(new NumeroValidador());

        TextareaForm experencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());

        Opcion java = new Opcion("1" ,"Java");
        Opcion typescript =  new Opcion("3","TypeScript");
        lenguaje.addOpcion(java)
        .addOpcion(new Opcion("2","JavaScript"))
        .addOpcion(typescript)
        .addOpcion(new Opcion("4", "Php"))
        .addOpcion(new Opcion("5", "Python"));

        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "input disabled name=' " + this.nombre + " ' "
                        + "value='  " + this.valor + " ' ";
            }
        };

        saludar.setValor("Hola que tal este campo esta desabilitado");

        username.setValor("john.doe");
        password.setValor("abc123");
        email.setValor("joedoe@gmail.com");
        edad.setValor("28");
        experencia.setValor(".... mas de 10 años de experiencia .... ");
        typescript.setSelected(true);

        List<ElementoForm> elementos = Arrays.asList(username,
                password,
                email,
                edad,
                experencia,
                experencia,
                lenguaje,
                saludar);

        elementos.forEach(e -> System.out.println(e.dibujarHtml()));

        elementos.forEach(e -> {

            if(!e.esValido()){
                e.getErrores().forEach(System.out::println);
            }

        });

    }
}

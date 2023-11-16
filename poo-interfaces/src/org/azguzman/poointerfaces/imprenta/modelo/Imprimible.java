package org.azguzman.poointerfaces.imprenta.modelo;

import static java.lang.System.out;

public interface Imprimible {
    String imprimir();

    String TEXTO = "Esta es la forma de declarar un metodo opcional en una interface";

    default  String prueba(){
        return TEXTO;
    }

    static void imprimir(Imprimible imprimible){
        out.println(imprimible.imprimir());
    }



}

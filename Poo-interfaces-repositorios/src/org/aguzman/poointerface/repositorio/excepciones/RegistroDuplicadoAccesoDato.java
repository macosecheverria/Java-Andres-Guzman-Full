package org.aguzman.poointerface.repositorio.excepciones;

public class RegistroDuplicadoAccesoDato extends EscrituraAccesoDatosException{
    public RegistroDuplicadoAccesoDato(String message){
        super(message);
    }
    
}

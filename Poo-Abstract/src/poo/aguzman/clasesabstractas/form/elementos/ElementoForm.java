package poo.aguzman.clasesabstractas.form.elementos;

import poo.aguzman.clasesabstractas.form.validador.LargoValidador;
import poo.aguzman.clasesabstractas.form.validador.Validador;
import poo.aguzman.clasesabstractas.form.validador.mensaje.MensajeFormateable;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {
    protected String valor;
    protected  String nombre;

    private List<Validador> validadores;
    private List<String> errores;

    public ElementoForm(){
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementoForm(String nombre){
        this();
        this.nombre = nombre;
    }

    public List<String> getErrores() {
        return errores;
    }

    public ElementoForm addValidador(Validador validador){
        this.validadores.add(validador);
        return  this;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean esValido(){
        validadores.forEach(e -> {

            if(!e.esValido(this.valor)){

                if(e instanceof MensajeFormateable){
                    this.errores.add(((LargoValidador) e).getMensajeFormateado(nombre));
                }else {
                    this.errores.add(String.format(e.getMensaje(), nombre));
                }

            }

        });

        return this.errores.isEmpty();
    }

    abstract public String dibujarHtml();

}

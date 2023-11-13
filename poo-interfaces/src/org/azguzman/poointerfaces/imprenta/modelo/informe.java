package org.azguzman.poointerfaces.imprenta.modelo;

public class informe extends Hoja{
    private  String autor;
    private String revisor;

    public informe(String autor, String revisor ,String contenido) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por: " + autor
                + "Revisado por: " + revisor
                + "\n" + this.contenido;
    }
}

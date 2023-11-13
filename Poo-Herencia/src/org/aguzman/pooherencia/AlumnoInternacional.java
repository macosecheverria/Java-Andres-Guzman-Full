package org.aguzman.pooherencia;

public final class AlumnoInternacional extends Alumno {
    private String pais;
    private  double notaIdiomas;


    public AlumnoInternacional(){
        System.out.println("ALumno Internacional: Inicializando constructor... ");

    }

    public AlumnoInternacional(String nombre, String apellido){
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellldo, String pais){
        this(nombre, apellldo);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() { return notaIdiomas; }
    public void setNotaIdiomas(double notaIdiomas) { this.notaIdiomas = notaIdiomas; }

    @Override
    public String saludar() {
        return  super.saludar() + " soy del extranjero del pais " + getPais();
    }

    @Override
    public double calcularPromedio() {
        //System.out.println("Calcular promedio " + AlumnoInternacional.class.getCanonicalName());
        return ( ( super.calcularPromedio() * 3 ) + notaIdiomas) /4;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\npais='" + pais + '\'' +
                ", notaIdiomas=" + notaIdiomas;
    }
}

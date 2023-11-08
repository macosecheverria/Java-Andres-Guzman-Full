package org.aguzman.app.hogar;

class Gato {
    private String tamanio;

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "tamanio='" + tamanio + '\'' +
                '}';
    }
}

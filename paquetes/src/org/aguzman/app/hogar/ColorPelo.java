package org.aguzman.app.hogar;

public enum ColorPelo {
    NEGRO("negro"),
    CAFE("cafe"),
    CASTANIO("Castaño"),
    RUBIO("Rubio"),
    ROJO("Rojo");

    private final String colorPelo;

    ColorPelo(String colorPelo){
        this.colorPelo = colorPelo;
    }

    public String getColorPelo(){
        return  colorPelo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

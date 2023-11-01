public class Automovil {
    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;
    private int capacidadTanque;

    public Automovil() {
    }

    public Automovil(String fabricante, String modelo, String color) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadTanque) {
        this(fabricante, modelo, color, cilindrada);
        this.capacidadTanque = capacidadTanque;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public String acelerar(int rpm) {
        return "El auto" + fabricante + "esta acelerando a " + rpm;
    }

    public String frenar() {
        return fabricante + " " + modelo + " frenando";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(2000);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeGas) {
        return km / (capacidadTanque * porcentajeGas);
    }

    public float calcularConsumo(int km, int porcentajeGas) {
        return km / (capacidadTanque * (porcentajeGas / 100f));
    }

    public String verDetalle() {
        return "auto.fabricante = " + this.fabricante +
                "auto.modelo = " + this.modelo +
                "auto.color = " + this.color +
                "auto.cilindrada = " + this.cilindrada;
    }

}

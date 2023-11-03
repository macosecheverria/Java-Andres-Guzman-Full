public class Automovil {
    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;

    private TipoAutomovil tipo;
    private static int ultimoId;
    private static String colorPatente = "Naranja";
    private static int capacidadTanqueEstatico = 50;

    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;
    public static final Integer VELOCIDAD_MAXIMA_CUIDAD = 60;

    public static final String COLOR_ROJO = "rojo";
    public static final String COLOR_AMARILLO = "amarillo";
    public static final String COLOR_AZUL = "azul";
    public static final String COLOR_BLANCO = "blanco";
    public static final String COLOR_GRIS = "gris";

    public Automovil() {
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor,
            Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static String getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadTanqueEstatico() {
        return Automovil.capacidadTanqueEstatico;
    }

    public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico) {
        Automovil.capacidadTanqueEstatico = capacidadTanqueEstatico;
    }

    public TipoAutomovil getTipoAutomovil() {
        return tipo;
    }

    public void setTipoAutomovil(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
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
        return km / (estanque.getCapacidad() * porcentajeGas);
    }

    public float calcularConsumo(int km, int porcentajeGas) {
        return km / (estanque.getCapacidad() * (porcentajeGas / 100f));
    }

    public static float calcularConsumoEstatico(int km, int porcentajeGas) {
        return km / (Automovil.capacidadTanqueEstatico * (porcentajeGas / 100f));
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj instanceof Automovil) {
            return false;
        }

        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return "Automovil [id=" + id + "fabricante" + fabricante + ", modelo=" + modelo + ", color=" + color
                + ", cilindrada="
                + estanque + ", capacidadTanque=" + estanque + "colorPatente" + colorPatente
                + "Tipo de auto con su descripcion" + tipo.toString() + "]";
    }

    /*
     * public String verDetalle() {
     * return "auto.fabricante = " + this.fabricante +
     * "auto.modelo = " + this.modelo +
     * "auto.color = " + this.color +
     * "auto.patente" + colorPatente +
     * "auto.cilindrada = " + this.cilindrada;
     * }
     */
}

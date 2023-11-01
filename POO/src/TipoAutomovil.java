public enum TipoAutomovil {
  SEDAN("Sedan", "Auto mediano", 4),
  STATION_WAGON("Station Wagon", "Auto grande", 5),
  HATCHBACK("Hatchback", "Auto compacto", 4),
  PICKUP("Pickup", "Camioneta", 4),
  CUOPE("Coupe", "Auto pequeño", 2),
  CONVERTIBLE("Convertible", "Auto deportivo", 2),
  FURGON("Furgon", "Auto utilitario", 2);

  private final String nombre;
  private final String descripcion;
  private final int numeroPuerta;

  TipoAutomovil(String nombre, String descripcion, int numeroPuerta) {
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.numeroPuerta = numeroPuerta;
  }

  public String getNombre() {
    return nombre;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public int getNumeroPuerta() {
    return numeroPuerta;
  }

  @Override
  public String toString() {
    return "Nombre: " + nombre + "- Descripcion: " + descripcion + "- Numero de puertas: " + numeroPuerta;
  }
}

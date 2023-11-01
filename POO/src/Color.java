public enum Color {
  ROJO("rojo"),
  AMARILLO("amarillo"),
  AZUL("azul"),
  BLANCO("blanco"),
  GRIS("gris"),
  NARANJA("naranja");

  private final String color;

  Color(String color){
    this.color = color;
  }

  public String getColor(){
    return color;
  }

  @Override
  public String toString(){
    return this.color;
  }
  
}

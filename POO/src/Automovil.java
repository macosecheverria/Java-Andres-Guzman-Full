public class Automovil {
    String fabricante;
    String modelo;
    String color;
    double cilindrada;

    public String verDetalle(){
        return "auto.fabricante = " + this.fabricante +
                "auto.modelo = " + this.modelo +
                "auto.color = " + this.color +
                "auto.cilindrada = " + this.cilindrada;
    }

    public String acelerar(int rpm){
        return "El auto" + fabricante + "esta acelerando a " + rpm;
    }

    public String frenar(){
        return fabricante + " " + modelo + " frenando";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(2000);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

}

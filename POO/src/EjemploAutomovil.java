public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil subaru = new Automovil();
        subaru.fabricante = "Subaru";
        subaru.modelo = "Impreza";
        subaru.color = "Azul";
        subaru.cilindrada = 2.0;
        System.out.println(subaru.acelerar(70));
        System.out.println(subaru.verDetalle());
        System.out.println(subaru.acelerarFrenar(3000));

        Automovil mazda = new Automovil();
        mazda.fabricante = "Mazda";
        mazda.modelo = "Rx-7";
        mazda.color = "Rojo";
        mazda.cilindrada = 3.0;
        System.out.println(subaru.acelerar(299));
        System.out.println(mazda.verDetalle());
        System.out.println(mazda.acelerarFrenar(5000));
    }
}
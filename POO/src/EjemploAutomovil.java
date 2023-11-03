public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil subaru = new Automovil("Subaru", "Impreza", Color.AZUL);
        Motor motorSubaru = new Motor(2.0, TipoMotor.DIESEL);
        Estanque estaqueSubaru = new Estanque(50);

        subaru.setMotor(motorSubaru);
        subaru.setEstanque(estaqueSubaru);

        System.out.println(subaru.getFabricante());
        System.out.println(subaru.getModelo());
        System.out.println(subaru.getColor());
        System.out.println(subaru.getMotor());
        System.out.println(subaru.getEstanque());
        System.out.println(subaru.acelerar(70));
        System.out.println(subaru.toString());
        System.out.println(subaru.acelerarFrenar(3000));

        Automovil mazda = new Automovil();
        Motor motorMazda = new Motor(3.5, TipoMotor.BENCINA);
        Estanque estaqueMazda = new Estanque(70);

        mazda.setFabricante("Mazda");
        mazda.setModelo("Rx7");
        mazda.setColor(Color.ROJO);
        mazda.setMotor(motorMazda);
        mazda.setEstanque(estaqueMazda);

        System.out.println(mazda.getFabricante());
        System.out.println(mazda.getModelo());
        System.out.println(mazda.getColor());
        System.out.println(mazda.getMotor());
        System.out.println(mazda.getEstanque());
        System.out.println(mazda.acelerar(299));
        System.out.println(mazda.toString());
        System.out.println(mazda.acelerarFrenar(5000));
        System.out.println("Kilometros por litro " + mazda.calcularConsumo(300, 0.75f));
        System.out.println("Kilometros por litro " + mazda.calcularConsumo(300, 60));

        Automovil nissan = new Automovil("Nissan", "Skyline Gtr R34", Color.AZUL, new Motor(3.5, TipoMotor.DIESEL));

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.ROJO, new Motor(2.5, TipoMotor.BENCINA));

        Automovil auto = new Automovil();
        // Date fecha = new Date();

        System.out.println("Son iguales? " + (nissan == nissan2));
        System.out.println("Son iguales con equals? " + nissan.equals(nissan2));
        System.out.println(nissan.getFabricante());
        System.out.println(nissan.getModelo());
        System.out.println(nissan.getColor());

        System.out.println(auto.equals(nissan));
        // System.out.println(auto.equals(fecha));
        System.out.println(nissan);
        System.out.println(nissan.toString());

        Automovil toyota = new Automovil("Toyota", "Supra", Color.AMARILLO, new Motor(4.0, TipoMotor.DIESEL));

        System.out.println(toyota.getFabricante());
        System.out.println(toyota.getModelo());
        System.out.println(toyota.getColor());
        System.out.println(toyota.getMotor());

    }
}
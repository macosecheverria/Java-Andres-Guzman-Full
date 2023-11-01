public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil subaru = new Automovil("Subaru", "Impreza", Color.AZUL, 2.0, 40);
        System.out.println(subaru.getFabricante());
        System.out.println(subaru.getModelo());
        System.out.println(subaru.getColor());
        System.out.println(subaru.getCilindrada());
        System.out.println(subaru.getCapacidadTanque());
        System.out.println(subaru.acelerar(70));
        System.out.println(subaru.toString());
        System.out.println(subaru.acelerarFrenar(3000));

        Automovil mazda = new Automovil();
        mazda.setFabricante("Mazda");
        mazda.setModelo("Rx7");
        mazda.setColor(Color.ROJO);
        mazda.setCilindrada(4.0);
        mazda.setCapacidadTanque(70);
        System.out.println(subaru.getFabricante());
        System.out.println(subaru.getModelo());
        System.out.println(subaru.getColor());
        System.out.println(subaru.getCilindrada());
        System.out.println(subaru.getCapacidadTanque());
        System.out.println(subaru.acelerar(299));
        System.out.println(mazda.toString());
        System.out.println(mazda.acelerarFrenar(5000));
        System.out.println("Kilometros por litro " + subaru.calcularConsumo(300, 0.75f));
        System.out.println("Kilometros por litro " + subaru.calcularConsumo(300, 60));

        Automovil nissan = new Automovil("Nissan", "Skyline Gtr R34", Color.AZUL, 3.5, 40);

        Automovil nissan2 = new Automovil("Nissan", "Skyline", Color.ROJO, 3.5, 40);

        Automovil auto = new Automovil();
        // Date fecha = new Date();

        System.out.println("Son iguales? " + (nissan == nissan2));
        System.out.println("Son iguales con equals? " + nissan.equals(nissan2));
        System.out.println(nissan.getFabricante());
        System.out.println(nissan.getModelo());
        System.out.println(nissan.getColor());
        System.out.println(nissan.getCilindrada());
        System.out.println(nissan.getCapacidadTanque());
        System.out.println(auto.equals(nissan));
        // System.out.println(auto.equals(fecha));
        System.out.println(nissan);
        System.out.println(nissan.toString());

        Automovil toyota = new Automovil("Toyota", "Supra", Color.AMARILLO);
        toyota.setCilindrada(5.0);
        toyota.setCapacidadTanque(56);

        System.out.println(toyota.getFabricante());
        System.out.println(toyota.getModelo());
        System.out.println(toyota.getColor());
        System.out.println(toyota.getCilindrada());
        System.out.println(toyota.getCapacidadTanque());

    }
}
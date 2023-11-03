public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadTanqueEstatico(40);

        Automovil subaru = new Automovil("Subaru", "Impreza", Color.AZUL, new Motor(3.0,TipoMotor.BENCINA));
        subaru.setTipoAutomovil(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil();
        Motor motorMazda =  new Motor(3.0, TipoMotor.BENCINA);
        mazda.setFabricante("Mazda");
        mazda.setModelo("Rx7");
        mazda.setColor(Color.AZUL);
        mazda.setMotor(motorMazda);
        mazda.setTipoAutomovil(TipoAutomovil.CUOPE);

        Automovil nissan = new Automovil("Nissan", "Skyline Gtr R34", Color.ROJO, new Motor(5.0, TipoMotor.DIESEL));
        nissan.setTipoAutomovil(TipoAutomovil.HATCHBACK);

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.BLANCO, new Motor(3.4, TipoMotor.DIESEL));
        nissan2.setTipoAutomovil(TipoAutomovil.PICKUP);

        Automovil.setColorPatente("Azul");

        System.out.println(subaru.toString());
        System.out.println(nissan2.toString());
        System.out.println(nissan.toString());
        System.out.println(Automovil.getColorPatente());
        System.out.println("Kilometros por Litros = " + Automovil.calcularConsumoEstatico(300, 30));
        System.out.println(Automovil.VELOCIDAD_MAXIMA_CARRETERA);
        System.out.println(Automovil.VELOCIDAD_MAXIMA_CUIDAD);

        TipoAutomovil tipoSubaru = subaru.getTipoAutomovil();
        System.out.println("Nombre subaru" + tipoSubaru.getNombre());
        System.out.println("Descripcion de subaru" + tipoSubaru.getDescripcion());
        System.out.println("Numero de puertas en subaru" + tipoSubaru.getNumeroPuerta());

    }
}
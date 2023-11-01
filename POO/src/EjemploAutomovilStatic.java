public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadTanqueEstatico(40);

        Automovil subaru = new Automovil("Subaru", "Impreza", Color.AZUL, 2.0, 40);
        subaru.setTipoAutomovil(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil();
        mazda.setFabricante("Mazda");
        mazda.setModelo("Rx7");
        mazda.setColor(Color.AZUL);
        mazda.setCilindrada(4.0);
        mazda.setCapacidadTanque(70);
        mazda.setTipoAutomovil(TipoAutomovil.CUOPE);

        Automovil nissan = new Automovil("Nissan", "Skyline Gtr R34", Color.ROJO, 3.5, 40);
        nissan.setTipoAutomovil(TipoAutomovil.HATCHBACK);

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.BLANCO, 2.5, 40);
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
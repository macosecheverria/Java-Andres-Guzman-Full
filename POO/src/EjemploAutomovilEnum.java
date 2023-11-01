public class EjemploAutomovilEnum {
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

        TipoAutomovil tipoSubaru = subaru.getTipoAutomovil();
        System.out.println("Nombre subaru" + tipoSubaru.getNombre());
        System.out.println("Descripcion de subaru" + tipoSubaru.getDescripcion());
        System.out.println("Numero de puertas en subaru" + tipoSubaru.getNumeroPuerta());

        switch (tipoSubaru) {
            case CONVERTIBLE:
                System.out.println("El automovil es deportivo y descapotable de dos puertas");
                break;

            case CUOPE:
                System.out.println("Es un automovil pequeño de dos puertas y tipicamente deportivo");
                break;

            case FURGON:
                System.out.println("Es un automovil utilitario de transporte,de empresas");
                break;

            case HATCHBACK:
                System.out.println("Es un automovil mediano compacto, aspecto deportivo");
                break;

            case PICKUP:
                System.out.println("Es un automovil de doble cabina o camioneta");
                break;

            case SEDAN:
                System.out.println("Es un automovil mediano");
                break;

            case STATION_WAGON:
                System.out.println("Es un automovil grande, con maleta mas grande");
                break;

            default:
                break;
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();

        for (TipoAutomovil ta : tipos) {
            System.out.print(ta + "=>" + ta.getNombre() + ", " + ta.getDescripcion() + ", " + ta.getNumeroPuerta());
        }

    }
}
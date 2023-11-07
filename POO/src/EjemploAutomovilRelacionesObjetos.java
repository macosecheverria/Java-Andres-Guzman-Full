public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {

        Automovil.setCapacidadTanqueEstatico(40);

        Automovil subaru = new Automovil("Subaru", "Impreza", Color.AZUL, new Motor(3.0, TipoMotor.BENCINA));
        Persona conductorSubaru = new Persona("Marcos", "Echeverria");
        Rueda[] ruedasSubaru = new Rueda[1];
        ruedasSubaru[0] = new Rueda("Yokohama", 17, 7.5);

        subaru.setTipoAutomovil(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        subaru.setRuedas(ruedasSubaru);

        Automovil mazda = new Automovil();
        Motor motorMazda = new Motor(3.0, TipoMotor.BENCINA);
        Persona conductorMazda = new Persona("Selva", "Echeverria");
        Rueda[] ruedasMazda = new Rueda[1];
        ruedasMazda[0] = new Rueda("Michellin", 15, 5.0);

        mazda.setFabricante("Mazda");
        mazda.setModelo("Rx7");
        mazda.setColor(Color.AZUL);
        mazda.setMotor(motorMazda);
        mazda.setTipoAutomovil(TipoAutomovil.CUOPE);
        mazda.setConductor(conductorMazda);
        mazda.setRuedas(ruedasMazda);

        Automovil nissan = new Automovil("Nissan", "Skyline Gtr R34", Color.ROJO, new Motor(5.0, TipoMotor.DIESEL));
        Persona conductorNissan = new Persona("Juan", "Ramirez");
        Rueda[] ruedasNissan = new Rueda[1];
        ruedasNissan[0] = new Rueda("Pirelli", 17,6.0);

        nissan.setTipoAutomovil(TipoAutomovil.HATCHBACK);
        nissan.setConductor(conductorNissan);
        nissan.setRuedas(ruedasNissan);

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.BLANCO, new Motor(3.4, TipoMotor.DIESEL));
        Persona conductorNissan2 =  new Persona("Edgar", "Ramirez");
        Rueda[] ruedasNissan2  = new Rueda[1];
        ruedasNissan2[0] = new Rueda("Pirelli", 20, 7.5);

        nissan2.setTipoAutomovil(TipoAutomovil.PICKUP);
        nissan2.setConductor(conductorNissan2);
        nissan2.setRuedas(ruedasNissan2);

        Automovil.setColorPatente("Azul");

        System.out.println(subaru.toString());
        System.out.println(nissan2.toString());
        
        System.out.println("Conductor Subaru: " + subaru.getConductor());
        for(Rueda r: subaru.getRuedas()){
            System.out.print("Fabricante: " + r.getFabricante() + ", aro: " + r.getAro() + ", ancho: " + r.getAncho());
        }

    }
}
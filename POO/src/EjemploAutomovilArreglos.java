import java.util.Arrays;

public class EjemploAutomovilArreglos {
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

        Automovil suzuki = new Automovil("Suzuki", "Vitara", Color.BLANCO, new Motor(3.4, TipoMotor.DIESEL));
        Persona conductorNissan2 =  new Persona("Edgar", "Ramirez");
        Rueda[] ruedasNissan2  = new Rueda[1];
        ruedasNissan2[0] = new Rueda("Pirelli", 20, 7.5);

        suzuki.setTipoAutomovil(TipoAutomovil.SUV);
        suzuki.setConductor(conductorNissan2);
        suzuki.setRuedas(ruedasNissan2);

        Automovil audi = new Automovil("Audi", "A3", Color.GRIS);
        Persona conductorAudi =  new Persona("Juan", "Echeverria");
        Motor motorAudi = new Motor(4.5,TipoMotor.DIESEL);
        Estanque estanqueAudi =  new Estanque(90);
        
        audi.setConductor(conductorAudi);
        audi.setMotor(motorAudi);
        audi.setEstanque(estanqueAudi);
        audi.setTipoAutomovil(TipoAutomovil.SUV);

        Automovil[] autos = new Automovil[5];

        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = suzuki;
        autos[4] =  audi;

        Arrays.sort(autos);
        
        for(Automovil i: autos){
            System.out.println(i);
        }
    }
}
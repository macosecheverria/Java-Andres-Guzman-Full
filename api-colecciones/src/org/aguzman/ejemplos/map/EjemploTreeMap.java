package org.aguzman.ejemplos.map;

import java.util.HashMap;
import java.util.Map;
//import java.util.TreeMap;

// Por razones que no entiendo no me funciona el TreeMap y el SortedMap

public class EjemploTreeMap {

    public static void main(String[] args) {
        //Map<String, Object> persona = new TreeMap<>();        
        Map<String, Object> persona = new HashMap<>();
        System.out.println("Contiene elementos? " + !persona.isEmpty());
        persona.put("hola", "1234");
        persona.put("nombre", "Marcos");
        persona.put("apellido", "Ramirez");
        persona.put("apellido Materno", "Echeverria");
        persona.put("email", "marcostest@gmail.com");
        persona.put("edad", "25");

        Map<String, String> direccion = new HashMap<>();
        direccion.put("country", "usa");
        direccion.put("state", "California");
        direccion.put("city", "Santa Barbara");
        direccion.put("adress", "One Street");
        direccion.put("number", "120");

        persona.put("direccion", direccion);

        System.out.println("persona " + persona);

      
    }
}

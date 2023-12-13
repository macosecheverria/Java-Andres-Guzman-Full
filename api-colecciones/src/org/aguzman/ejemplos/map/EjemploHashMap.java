package org.aguzman.ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {

    public static void main(String[] args) {
        Map<String, Object> persona = new HashMap<>();
        System.out.println("Contiene elementos? " + !persona.isEmpty());
        persona.put(null, "1234");
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

        Object nombre = persona.get("nombre");
        System.out.println("nombre " + nombre);

        @SuppressWarnings("unchecked")
        Map<String, String> direccionPersona = (Map<String, String>) persona.get("direccion");

        String country = direccionPersona.get("country");
        String city = direccionPersona.get("city");

        System.out.println("Pais de la persona" + country);
        System.out.println("Cuidad de la persona " + city);

        Object keyApellido = persona.remove("apellido");
        System.out.println("Apellido eliminado: " + keyApellido);

        boolean containApellidoMaterno = persona.containsKey("apellido Materno");

        System.out.println("El mapa contiene el apellido materno: " + containApellidoMaterno);

        containApellidoMaterno = persona.containsValue("marcostest@gmail.co");
        System.out.println("Contiene el email?  " + containApellidoMaterno);

        // Desestructurando los valores del Map values
        Collection<Object> valuesMap = persona.values();
        valuesMap.forEach(System.out::println);

        // Desestructurando los valores del Map key
        Set<String> keyMap = persona.keySet();
        keyMap.forEach(System.out::println);

        // Iterando todo el map
        Set<Map.Entry<String, Object>> iper = persona.entrySet();
        iper.forEach(el -> System.out.println(el.getKey() + " => " + el.getValue()));

        // es lo mismo que arriba pero mucho mas limpio
        persona.forEach((key, value) -> System.out.println(key + " ==> " + value));

        System.out.println("total: " + persona.size());
        System.out.println("Contiene elementos? " + !persona.isEmpty());
    }
}

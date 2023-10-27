import java.util.Arrays;

public class EjemplosArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];
        Arrays.sort(productos);
        int total = productos.length;

        productos[0] = "Kingston Pendrive 64gb";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Mack book air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicicleta Oxfort";

        for(int i = 0; i < total; i++){
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        System.out.println("==========Usando foreach==========");

        for(var i: productos){
            System.out.println("cada producto = " + i);
        }

        int[] numeros = new int[4];
        int totalNumeros =  numeros.length;

        for(int i = 0; i < totalNumeros;i++){
            numeros[i] = i * 3;
        }


    }
}
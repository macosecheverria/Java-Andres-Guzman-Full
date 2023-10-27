import java.util.Arrays;

public class EjemplosArreglos {
    public static void main(String[] args) {

        String[] productos = new String[7];
        Arrays.sort(productos);

        String prod1 = productos[0] = "Kingston Pendrive 64gb";
        String prod2 = productos[1] = "Samsung Galaxy";
        String prod3 = productos[2] = "Disco duro SSD Samsung Externo";
        String prod4 = productos[3] = "Asus Notebook";
        String prod5 = productos[4] = "Mackbook air";
        String prod6 = productos[5] = "Chromecast 4ta generacion";
        String prod7 = productos[6] = "Bicicleta Oxfort";

        System.out.println("producto1 = " + prod1);
        System.out.println("producto2 = " + prod2);
        System.out.println("producto3 = " + prod3);
        System.out.println("producto4 = " + prod4);
        System.out.println("producto5 = " + prod5);
        System.out.println("producto6 = " + prod6);
        System.out.println("producto7 = " + prod7);

        int[] numeros = new int[4];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;

        Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];
        int m = numeros[numeros.length - 1];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("Ultimo elemento del arreglo" + m);
    }
}
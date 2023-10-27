import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemplosArreglosForInversoMutable {

    static void arregloInverso(String[] arr){
        int total = arr.length;
        int total2 = arr.length;

        for(int i = 0; i < total2; i++){
            String actual = arr[i];
            String inverso = arr[total-1-i];
            arr[i] = inverso;
            arr[total-1-i] = actual;
            total2--;
        }
    }

    public static void main(String[] args) {

        String[] productos = {
                "Iphone 16 Pro max",
                "Asus Gaming Tuf",
                "Logitech g05",
                "Rog Phone 6 Special Edition",
                "Monitor Samsung de 19 Pulgadas",
                "Nvidia rtx 3090",
                "Teclado Redragon 65%"
        };


        Arrays.sort(productos);
        int total = productos.length;

        Collections.reverse(Arrays.asList(productos));

        for(int i = total - 1; i >= 0; i--){
            System.out.println("Para i = " + i + "valor" + productos[i]);
        }

        arregloInverso(productos);

    }
}
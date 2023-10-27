import java.util.Arrays;

public class EjemplosArreglosForOrdenamientoBurbuja {


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
        int contador = 0;

        for(int i = 0; i < total; i++){
            for(int j = 0; i < total; j++){
                if(productos[i].compareTo(productos[j]) < 0){
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }

                contador++;
            }
        }

        System.out.println("Contador = " + contador);

        for(int i = total - 1; i >= 0; i--){
            System.out.println("Para i = " + i + "valor" + productos[i]);
        }

    }
}
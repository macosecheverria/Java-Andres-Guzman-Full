import java.util.Arrays;

public class EjemplosArreglosForInverso {
    public static void main(String[] args) {

        String[] productos = new String[7];
        String[] productos2 = {
                "Iphone 16 Pro max",
                "Asus Gaming Tuf",
                "Logitech g05",
                "Rog Phone 6 Special Edition",
                "Monitor Samsung de 19 Pulgadas",
                "Nvidia rtx 3090",
                "Teclado Redragon 65%"
        };

        for(var i: productos2){
            System.out.println("Produtos de la seccion 2" + i);
        }

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

        System.out.println("== Usando el for inverso ==");

        for(int i = 0; i< total; i++){
            System.out.println("Para i = " + (total-1-i) + " : " + productos[i]);
        }

        System.out.println("== Usando el for inverso 2 ==");

        for(int i = total - 1; i >= 0; i--){
            System.out.println("Para i = " + i + "valor" + productos[i]);
        }

    }
}
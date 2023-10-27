public class EjemploMatricesColumnasVariables {
    public static void main(String[] args) {
        int[][] matriz = new int[3][];

        matriz[0] = new int[2];
        matriz[1] = new int[3];
        matriz[2] = new int[4];

        System.out.println("Matriz length: " + matriz.length);
        System.out.println("Fila 0 length: " + matriz[0].length);
        System.out.println("Fila 1 length: " + matriz[1].length);
        System.out.println("Fila 2 length: " + matriz[2].length);

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; i++){
                matriz[i][j] = i * j;
            }
        }

        for(var fila: matriz){
            for(var columna: fila){
                System.out.print(columna + "\t");
            }
            System.out.println();
        }
    }
}

public class EjemploMatricesStringFor {
    public static void main(String[] args) {
        String[][] nombres = new String[3][2];

        nombres[0][0] = "Marcos";
        nombres[0][1] = "Maria";
        nombres[1][0] = "Juan";
        nombres[1][1] = "Yessica";
        nombres[2][0] = "Yeniffer";
        nombres[2][1] = "Bartola";

        for(int i = 0; i < nombres.length; i++){
            for(int j = 0; j < nombres[i].length; i++){
                System.out.print( nombres[i][j] + "\t");
            }
        }

        for(var fila: nombres){
            for(var columna: fila){
                System.out.print(columna + "\t");
            }
        }

    }
}

public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {

        String[][] nombres = {{"Marcos", "Yeniffer"},{"Maria","Bartola"},{"juan"}};

        for(var fila: nombres){
            for(var columna: fila){
                System.out.print(columna + "\t");
            }
        }

    }
}

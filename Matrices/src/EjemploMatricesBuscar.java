public class EjemploMatricesBuscar {
    public static void main(String[] args) {
        int[][] matrizEntersos = {
                {35,98,3,1978},
                {12,2020,188,9},
                {10,11,1998,16}
        };

        int elementoBuscar = 10;
        boolean encontrado = false;
        int i;
        int j = 0;

        buscar: for(i = 0; i < matrizEntersos.length; i++){
            for(j = 0; j < matrizEntersos[i].length; j++){
                if(matrizEntersos[i][j] == elementoBuscar){
                    encontrado = true;
                    break buscar;
                }
            }
        }

        if(!encontrado){
            System.out.println("No se ha encontrado el numero en la matriz");
        }else {
            System.out.println("Encontrado" + elementoBuscar + "en las cordenadas"+ i + "," + j);
        }

    }
}

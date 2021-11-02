package br.com.javacompleto.introducao.arrays;  //a primeira linha sempre será o nome do pacote

public class _022Arrays6 {
    public static void main(String[] args) {
        // Só revisando as formas de se inicializar um array
        int[] arrInt = {1,2,3};
        int[] arrInt2 = new int[3];
        int[] arrInt3 = new int[] {1,2,3};
        // --------------------------

        int [][] dias = new int[3][];
        dias[0] = new int[2];
        dias[1] = new int[]{1,2,3};
        dias[2] = new int[4];
        // poderia se inicializar assim:
        // int[][] dias = {{0,0},{1,2,3},{0,0,0,0}};
        //Qual o resultado da posição [1][2]? = 3
        for(int[] arr : dias){
            for(int num : arr){
                System.out.println(num);
            }
        }
    }
}

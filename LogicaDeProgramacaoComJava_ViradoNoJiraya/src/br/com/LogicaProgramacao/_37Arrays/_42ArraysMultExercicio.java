package br.com.LogicaProgramacao._37Arrays;

public class _42ArraysMultExercicio {
    public static void main(String[] args) {
        //Calcule a multiplicação dos elementos da diagonal principal de uma matriz quadrada

        int[][] matriz = new int[4][4];
        int mult = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                matriz[i][j]=i+j+1;
                if (i==j){
                    mult *= matriz[i][j];
                }
            }
            System.out.println(mult);
        }
    }
}

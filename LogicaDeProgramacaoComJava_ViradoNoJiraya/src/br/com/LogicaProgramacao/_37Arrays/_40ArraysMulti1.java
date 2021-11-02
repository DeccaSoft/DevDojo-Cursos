package br.com.LogicaProgramacao._37Arrays;

public class _40ArraysMulti1 {
    public static void main(String[] args) {
        int[][] arrayMult1 = new int[2][3];
        arrayMult1[0][0] = 22;
        arrayMult1[0][1] = 11;
        arrayMult1[0][2] = 99;
        arrayMult1[1][0] = 44;
        arrayMult1[1][1] = 55;
        arrayMult1[1][2] = 88;
        System.out.println(arrayMult1[0][0]);
        System.out.println(arrayMult1[0][1]);
        System.out.println(arrayMult1[0][2]);
        System.out.println(arrayMult1[1][0]);
        System.out.println(arrayMult1[1][1]);
        System.out.println(arrayMult1[1][2]);

        System.out.println("------Imprimindo pelo for--------");
        for (int i = 0; i < arrayMult1.length; i++) {
            for (int j = 0; j < arrayMult1[i].length; j++) {
                System.out.println(arrayMult1[i][j]);
            }
        }
        
        System.out.println("------Array de 3 Dimensões--------");
        int[][][] arrayMult2 = new int[3][3][3];
        arrayMult2[0][1][2] = 9;
        arrayMult2[1][2][0] = 1;
        arrayMult2[2][0][1] = 5;
        System.out.println(arrayMult2[2][1][0]); //O java inicializa com valores padrões os arrays
        System.out.println(arrayMult2[0][2][1]); //No caso de int ele inicilaiza com zero
        System.out.println(arrayMult2[0][1][2]);
    }
}

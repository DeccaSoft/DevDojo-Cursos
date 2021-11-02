package br.com.LogicaProgramacao._28LacosRepeticao;

public class _35ForExercicio3 {
    public static void main(String[] args) {
        //Fors aninhados

        for (int i = 1; i <=10 ; i++) {
            System.out.println("Tabuada do " + i);
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}

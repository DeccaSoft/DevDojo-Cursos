package br.com.LogicaProgramacao._28LacosRepeticao;

public class _34ForExercicio1 {
    public static void main(String[] args) {
        //Imprimir os números quadrados perfeitos de 15 a 200
        int i = 0;
        int q = 0;
        for (i = 0; i <= 20 ; i++) {
            q = i*i;
            if (q>=15 && q<=200){
                System.out.println(q + " é quadrado perfeito de " + i);
            }
        }
    }
}

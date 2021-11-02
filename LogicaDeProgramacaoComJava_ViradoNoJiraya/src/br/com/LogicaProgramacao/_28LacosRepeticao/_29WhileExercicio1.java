package br.com.LogicaProgramacao._28LacosRepeticao;

import java.util.Scanner;

//Imprimir todos os números Ímpares de 1 até um valor digitado

public class _29WhileExercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor sesejado: ");
        int valor = teclado.nextInt();
        int i=1; //i = Iteração (Prática de programação)
        while(i <= valor){
            if((i%2)!=0){
                System.out.println(i);
            }
            i++;
        }
    }
}

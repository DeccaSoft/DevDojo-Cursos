package br.com.LogicaProgramacao._28LacosRepeticao;

import java.util.Scanner;

public class _32DoWhile {
    public static void main(String[] args) {
        boolean condicao = false;
        //Diferença entre While e Do...While
        while (condicao){
            System.out.println("Dentro do While");
        }
        do{
            System.out.println("Dentro do Do...While");
        }while(condicao);

        //Treinando... joguinho
        int desejaContinuar = 1;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Player1...Digite um número (de 1 a 10): ");
            int num1 = teclado.nextInt();
            System.out.println("Player2...Digite um número (de 1 a 10): ");
            int num2 = teclado.nextInt();
            System.out.println("Acertou: " + (num1 == num2));
            System.out.println("Deseja Continuar (1=Sim / 2=Não) ? ");
            desejaContinuar = teclado.nextInt();
        }while(desejaContinuar==1);
    }
}

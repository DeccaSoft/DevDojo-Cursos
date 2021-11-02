package br.com.LogicaProgramacao._28LacosRepeticao;

//Menu Visual navegável em loop onde: 1=Calcular Imposto
                            //2=Depositar Salário
                            //3=Sair

import java.util.Scanner;

public class _30WhileExercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int op = 0;
        while(op!=3){
            System.out.println("MENU");
            System.out.println("1=Calcular Imposto");
            System.out.println("2=Depositar Salário");
            System.out.println("3=Sair");
            System.out.print("Digite sua Opção: ");
            op=teclado.nextInt();
            System.out.println("Opção Escolhida: "+op);
        }
        System.out.println("Fim do Programa");
    }
}

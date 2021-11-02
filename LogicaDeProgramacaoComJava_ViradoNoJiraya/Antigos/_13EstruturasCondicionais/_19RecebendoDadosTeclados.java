package br.com.LogicaProgramacao._13EstruturasCondicionais;

import java.util.Scanner;

public class _19RecebendoDadosTeclados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu Nome: ");
        String nome = teclado.next(); //recebe uma String
        System.out.println("Olá... " + nome);
        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();
        System.out.println(idade + " anos! Parabéns!");
    }
}

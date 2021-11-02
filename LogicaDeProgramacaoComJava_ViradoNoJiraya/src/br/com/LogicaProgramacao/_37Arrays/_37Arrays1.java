package br.com.LogicaProgramacao._37Arrays;

import java.util.Scanner;

public class _37Arrays1 {
    public static void main(String[] args) {
        double nota = 7.5;
        double nota1 = 8.0;
        double nota2 = 3;
        double nota3 = 10;
        double media = (nota + nota1 + nota2 + nota3) / 4;
        System.out.println(media);

        double[] notas = new double[4];
        //poderia ser double notas2[] = new double[4];
        notas[0] = 7.5;
        notas[1] = 8.0;
        notas[2] = 3;
        notas[3] = 10;
        System.out.println(notas);
        System.out.println(notas[0]);
        System.out.println(notas[3]);
        //System.out.println(notas[4]);
        System.out.println("-----------------");
        double soma2 = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
            soma2 += notas[i];
        }
        double media2 = soma2 / notas.length;
        System.out.println(media2);

        System.out.println("Melhorando o programinha!!");
        Scanner teclado = new Scanner(System.in);
        double soma3 = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a Nota " + (i+1));
            notas[i] = teclado.nextDouble();
            soma3 += notas[i];
        }
        double media3 = soma3 / notas.length;
        System.out.println("Sua média é: " + media3);
    }
}

package br.com.LogicaProgramacao._13EstruturasCondicionais;

import java.util.Scanner;

public class _20Condicionais07ExercicioNatacaoMelhorado {
    public static void main(String[] args) {
        //Torneio de Natação
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o Nome do Concorrente: ");
        String nome = teclado.next();
        System.out.println("Digite a Idade do Concorrente: ");
        int idade = teclado.nextInt();

        if(idade <10){
            System.out.println(nome + " - Categoria Infantil");
        }else if(idade>=11 && idade<=15){
            System.out.println(nome + " - Categoria Juventil");
        }else if(idade>=16 && idade<=19){
            System.out.println(nome + " - Categoria Pré-Adulto");
        }else{
            System.out.println(nome + " - Categoria Adulto");
        }
    }
}

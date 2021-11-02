package br.com.LogicaProgramacao._13EstruturasCondicionais;

import java.util.Scanner;

public class _22Condicionais09_Exercicio {
    public static void main(String[] args) {
        //Cadastro de Logins
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = teclado.next();
        System.out.println("Digite seu login: ");
        String login = teclado.next();
        //Strings se compara com o .equals()
        //Variante: .equalsIgnoreCase()
        if(login.equalsIgnoreCase("admin") || login.equalsIgnoreCase("administrador")
                || login.equals("") || login.isBlank() || login.isEmpty()){
            System.out.println("Usuário/Login Inválido!!!");
        }else{
            System.out.println("Usuário Cadastrado com Sucesso!!!");
        }
    }
}

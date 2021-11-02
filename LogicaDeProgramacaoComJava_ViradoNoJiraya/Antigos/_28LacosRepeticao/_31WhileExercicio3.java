package br.com.LogicaProgramacao._28LacosRepeticao;

import java.util.Scanner;

public class _31WhileExercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final String LOGIN = "Andre";
        final String SENHA = "123";
        boolean telaLogin = true;
        while(telaLogin){
            System.out.println("Digite seu login: ");
            String loginDigitado = teclado.next();
            System.out.println("Digite sua Senha: ");
            String senhaDigitada = teclado.next();
            if(LOGIN.equals(loginDigitado) && SENHA.equals(senhaDigitada)){
                System.out.println("Acesso Concedido!!!");
                telaLogin=false;
            }else{
                System.out.println("Acesso Negado!!!André");
            }
            /*
            Poderia usar o break... ficaria assim:
                ...
                    telaLogin=false;
                    break;
                }
                System.out.println("Acesso Negado!!!André");
            }
            */

        }


    }
}

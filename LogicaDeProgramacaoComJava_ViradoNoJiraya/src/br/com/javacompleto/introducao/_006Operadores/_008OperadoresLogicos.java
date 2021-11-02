package br.com.javacompleto.introducao._006Operadores;

public class _008OperadoresLogicos {
    public static void main(String[] args){
        int idade = 18;
        float salario = 1000f;

        System.out.print("i>=10 e S>=1000 -> "); System.out.println(idade >= 18 && salario >= 1000);
        System.out.print("i>=10 e S>=3000 -> "); System.out.println(idade >= 18 && salario >= 3000);
        System.out.print("i>=10 ou S>=3000 -> "); System.out.println(idade >= 18 || salario >= 3000);
    }
}

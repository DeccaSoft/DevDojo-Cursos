package br.com.javacompleto.introducao._006Operadores;

public class _009OperadoresDeAtribuicao {
    public static void main(String[] args) {
        // =, -=, +=, *=, /=, %=
        int salario = 1800;
        salario = salario + 1000;
        System.out.println(salario);
        salario += 1000;
        System.out.println(salario);
        salario -= 1000;
        System.out.println(salario);
        salario *= 1.1;
        System.out.println(salario);
        salario /= 10;
        System.out.println(salario);
        salario = salario + (int) (salario * 0.1);
        System.out.print(salario);
        System.out.println(" ...Perdeu as casa decimais pois foi convertido em inteiro!");
        int resto = salario %= 3;
        System.out.println("Resto da Divisão de Salário por 3 é: " + resto);
    }
}

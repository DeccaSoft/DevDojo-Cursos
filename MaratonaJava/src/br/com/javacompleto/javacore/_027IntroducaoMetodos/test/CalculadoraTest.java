package br.com.javacompleto.javacore._027IntroducaoMetodos.test;

import br.com.javacompleto.javacore._027IntroducaoMetodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) { //pode ser trocado por psvm(String... args) ... ou até mesmo psvm(String args[])
        Calculadora calc = new Calculadora();
        System.out.println("Executando Soma...");
        calc.somaDoisNumeros();
        System.out.println("Continuando a Execução de calculadoraTest...");
        System.out.println("Executando Subtração...");
        calc.subtraiDoisNumeros();
        System.out.println("Continuando a Execução de calculadoraTest...");
        System.out.println("Executando Multiplicação...");
        calc.multiplicaDoisNumeros(5, 5);
        System.out.println("Continuando a Execução de calculadoraTest...");
        System.out.println("Executando Divisão...");
        System.out.println("Imprimindo diretamente o resultado da divisão...");
        System.out.println(calc.divideDoisNumeros(20, 2));
        System.out.println("Guardando o resultado da divisão em uma variável e imprimindo essa variável na tela...");
        double resultado=calc.divideDoisNumeros(20, 2); //Não se pode colocar dentro de um "sout" um método void!
        System.out.println(resultado);
        System.out.println("Continuando a Execução de calculadoraTest...");
        System.out.println("Executando imprimeDoisNumerosDivididos");
        calc.imprimeDoisNumerosDivididos(20, 0);

        System.out.println("Continuando a Execução...");
        int[] numeros = {1,2,3,4,5};
        calc.somaArray(numeros);
        calc.somaVarArgs(1,2,3,4,5);
        calc.somaVarArgs(numeros);

    }
}

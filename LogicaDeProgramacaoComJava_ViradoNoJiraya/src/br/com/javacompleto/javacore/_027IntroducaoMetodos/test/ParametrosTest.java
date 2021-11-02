package br.com.javacompleto.javacore._027IntroducaoMetodos.test;

import br.com.javacompleto.javacore._027IntroducaoMetodos.classes.Calculadora;

public class ParametrosTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int num1 = 5;
        int num2 = 10;
        System.out.println("Antes da chamada do Altera");
        System.out.println("Num1= "+num1);
        System.out.println("Num2= "+num2);
        System.out.println("Chamando o Altera...");
        calc.alteraDoisNumeros(num1, num2);
        System.out.println("Voltando pro teste...");
        System.out.println("Dentro do teste");
        System.out.println("Num1= "+num1);
        System.out.println("Num2= "+num2);
        System.out.println("Valores não se alteram, pois o java passa uma cópia do valor para o método... e não a referência!");

    }
}

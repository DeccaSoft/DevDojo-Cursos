package br.com.javacompleto.javacore._056ModificadorFinal.test;

import br.com.javacompleto.javacore._056ModificadorFinal.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro();
        System.out.println(c.getComprador());
        c.getComprador().setNome("Kuririm");
        System.out.println(c.getComprador());
    }
}

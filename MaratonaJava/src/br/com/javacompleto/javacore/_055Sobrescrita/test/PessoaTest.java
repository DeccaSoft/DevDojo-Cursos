package br.com.javacompleto.javacore._055Sobrescrita.test;

import br.com.javacompleto.javacore._055Sobrescrita.classes.Pessoa;

public class PessoaTest {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Joaquina");
        p.setIdade(300);
        System.out.println(p);
        Pessoa p2 = new Pessoa();
        p2.setNome("Joao");
        p2.setIdade(30);
        System.out.println(p2);


    }
}

package br.com.javacompleto.javacore._060ClassesAbstratas.test;

import br.com.javacompleto.javacore._060ClassesAbstratas.classes.Gerente;
import br.com.javacompleto.javacore._060ClassesAbstratas.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {

        Gerente g = new Gerente("Anna", "22-2", 2000.0);
        g.calculaSalario();
        System.out.println(g);
        g.imprime();
        Vendedor v = new Vendedor("Camila", "333-3", 1500, 5000);
        v.calculaSalario();
        System.out.println(v);
        v.imprime();


    }
}

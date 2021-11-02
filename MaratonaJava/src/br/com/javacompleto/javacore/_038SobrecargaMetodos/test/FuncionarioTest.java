package br.com.javacompleto.javacore._038SobrecargaMetodos.test;

import br.com.javacompleto.javacore._038SobrecargaMetodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("André3");
        Funcionario f = new Funcionario("Andre´4");
        /*funcionario.setNome("André");
        funcionario.setCpf("111.222.333-44");
        funcionario.setSalario(4500);*/

        funcionario.init("André", "111.222.333-44", 4500);
        f.init("André2", "789.456.123-00", 8000, "98765-4");
        funcionario.imprime();
        f.imprime();




    }
}

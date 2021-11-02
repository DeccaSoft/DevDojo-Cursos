package br.com.javacompleto.javacore._050Heranca.test;

import br.com.javacompleto.javacore._050Heranca.classes.Endereco;
import br.com.javacompleto.javacore._050Heranca.classes.Funcionario;
import br.com.javacompleto.javacore._050Heranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("André");
        //p.setNome("André");
        p.setCpf("12345");

        Endereco end = new Endereco();
        end.setRua("Tianagua, 13");
        end.setBairro("Parreão");

        p.setEndereco(end);
        p.imprime();

        System.out.println("---Funcionário---");
        Funcionario f = new Funcionario("Augusto");
        //f.setNome("Augusto");
        f.setCpf("45678");
        f.setSalario(1500.08);
        f.setEndereco(end);
        f.imprime();
    }
}

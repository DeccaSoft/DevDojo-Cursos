package br.com.javacompleto.javacore._067Excecoes._76RegrasSobrescrita;

import br.com.javacompleto.javacore._067Excecoes._75CustomException.LoginInvalidoException;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionsTest {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        Pessoa p = new Pessoa();

        try {
            f.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

        try {
            p.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

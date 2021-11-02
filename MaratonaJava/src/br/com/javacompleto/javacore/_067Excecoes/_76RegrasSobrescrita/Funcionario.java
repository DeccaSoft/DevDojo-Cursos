package br.com.javacompleto.javacore._067Excecoes._76RegrasSobrescrita;

import br.com.javacompleto.javacore._067Excecoes._75CustomException.LoginInvalidoException;

public class Funcionario extends Pessoa{

    public void salvar() throws LoginInvalidoException{
        //Pode-se Declarar somente uma Exceção
        //Só pode lançar Exceções da Classe Mãe ou filhas delas,
        //Ou RuntimeException e sua SubClasse dela.
        //Não pode lançar nem mesmo Exception! Por ser mais Genérica do que RuntimeException
    }
}

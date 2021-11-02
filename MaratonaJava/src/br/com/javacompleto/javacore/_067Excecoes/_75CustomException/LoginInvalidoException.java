package br.com.javacompleto.javacore._067Excecoes._75CustomException;

public class LoginInvalidoException extends Exception{
    public LoginInvalidoException(){
        super("Usuário e/ou Senha Inválido(s)");
    }

    //ATENÇÂO: NUNCA coloque qualquer tipo de Tratamento nas Classes de Exceção
}

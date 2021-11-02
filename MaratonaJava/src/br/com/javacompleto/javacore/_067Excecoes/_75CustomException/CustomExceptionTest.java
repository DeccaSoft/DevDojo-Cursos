package br.com.javacompleto.javacore._067Excecoes._75CustomException;

public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
    private static void logar() throws LoginInvalidoException{
        String usuarioBD = "Goku";
        String senhaBD = "123";
        String usuarioDigitado = "Goku";
        String senhaDigitada = "122";

        if(!usuarioDigitado.equals(usuarioBD) || !senhaDigitada.equals(senhaBD)){
            throw new LoginInvalidoException();
        }else{
            System.out.println("Login Realizado comSucesso!!!");
        }
    }
}

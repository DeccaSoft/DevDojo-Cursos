package br.com.javacompleto.javacore._067Excecoes.ExceptionsExemplos;

public class RuntimeExceptionTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        //Prevenindo o Erro
        if (b!=0){
            int c = a/b;
            System.out.println(c);
        }

    }
}

package br.com.javacompleto.javacore._067Excecoes.ErrorExemplo;

public class ErrorTest {
    public static void main(String[] args) {
        //Provocando um Erro
        stackOverflowError();
    }
    public static void stackOverflowError(){
        stackOverflowError();
    }
}

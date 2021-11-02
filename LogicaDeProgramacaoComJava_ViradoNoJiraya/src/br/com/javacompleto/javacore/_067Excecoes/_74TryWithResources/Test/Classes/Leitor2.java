package br.com.javacompleto.javacore._067Excecoes._74TryWithResources.Test.Classes;

public class Leitor2 implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Fechando Leitor2");
    }
}

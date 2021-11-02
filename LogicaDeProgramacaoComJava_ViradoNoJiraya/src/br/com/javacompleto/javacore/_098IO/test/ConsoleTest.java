package br.com.javacompleto.javacore._098IO.test;

import java.io.Console;

public class ConsoleTest {
    public static void main(String[] args) {
        Console c = System.console();
        char[] pw = c.readPassword("%s", "pw: ");
        for(char pass : pw){
            c.format("%c", pass);
        }
        c.format("\n");
        //Depois de tudo isso tem-se que chamar pelo Terminal, pois o InteliJ não reconhece o teclado
        String texto;
        while(true){
        texto = c.readLine("%s", "Digite: ");
        c.format("Esse texto %s foi Digitado: ", retorno(texto));
        }
    }

    public static String retorno(String arg1){
        return arg1;
    }
}
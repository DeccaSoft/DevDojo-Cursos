package br.com.javacompleto.javacore._067Excecoes._74TryWithResources.Test;

import br.com.javacompleto.javacore._067Excecoes._74TryWithResources.Test.Classes.Leitor1;
import br.com.javacompleto.javacore._067Excecoes._74TryWithResources.Test.Classes.Leitor2;

import java.io.*;

public class TryWithResoucesTest {
    public static void main(String[] args) {

    }
    //Atenção: Mais abaixo está o novo método lerArquivo()... para versões do Java 7 em diante
    public static void lerArquivoOld(){ //Até a versão 6 do Java

        //Para demonstrar estamos utilizando um código para abertura de arquivos (Ainda vamos aprender isso)
        Reader reader = null; //Tem que ser criada fora do Bloco try, porque se colocassemos
        //dentro do try, seria uma variável local e o finally não reconheceria!
        try {
            reader = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally{ //Código até a versão 6 do Java seria assim
                    //ou voce poderia criar um método para isso.
            try {
                if(reader != null){
                    reader.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void lerArquivo() throws IOException { //A partir do Java 7

        //Para demonstrar estamos utilizando um código para abertura de arquivos (Ainda vamos aprender isso)
        try(Reader reader = new BufferedReader(new FileReader("text.txt"))) { //Try With Resources - Try com recursos = Ideal para se trabalhar com arquivos ou Banco de Dados
            //Poderia colocar outro reader, ficaria assim:
            //try(Reader reader = new BufferedReader(new FileReader("text.txt"));
            // Reader reader2 = new BufferedReader(new FileReader("text2.txt"))){
            //A regra é que as variáveis de referência dentro do try DEVEM implementar a Classe AutoCloseable ou Closeable
            //Por isso não precisamos mais se preocupar em fechar!
            //Apesar de poder, você não precisa mais colocar um catch, mas precisa lançar a exceçaõ lá em cima: throws IOException,
            //Porém é aconselhado se colocar o catch!
        }

        try(Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()) {

        }catch (Exception e){
            e.printStackTrace();
        }
    }


}

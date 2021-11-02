package br.com.javacompleto.javacore._098IO.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _99FileWriterReaderTest {
    public static void main(String[] args) {
        File file = new File("Arquivo2.txt");
//        try {
//            FileWriter fw = new FileWriter(file, true); //Append=true -> Acrescenta o Texto no final do Arquivo2
//            fw.write("Escrevendo uma Mensagem no Arquivo\ne pulando uma linha2\n");
//            fw.flush(); //"Cospe tudo de dentro do Túnel"
//            fw.close(); //Fecha o Arquivo
//
//            //Lendo o Arquivo
//            FileReader fr = new FileReader(file);
//            char[] in = new char[500];
//            int size = fr.read(in); //Retorna um int e coloca o conteúdo dentro de um Array
//            System.out.println("Tamanho do Array: " + size);
//            for(char c : in){
//                System.out.print(c);
//            }
//            fr.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //Try With Resouces
        try (FileWriter fw = new FileWriter(file, true); FileReader fr = new FileReader(file)){
            fw.write("Escrevendo uma Mensagem no Arquivo\ne pulando uma linha2\n");
            fw.flush(); //"Cospe tudo de dentro do Túnel"
            //fw.close(); //Fecha o Arquivo Automaticamente

            //Lendo o Arquivo
            char[] in = new char[500];
            int size = fr.read(in); //Retorna um int e coloca o conteúdo dentro de um Array
            System.out.println("Tamanho do Array: " + size);
            for(char c : in){
                System.out.print(c);
            }
            //fr.close(); //Fecha o Arquivo Automaticamente
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

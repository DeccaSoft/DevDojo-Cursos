package br.com.javacompleto.javacore._098IO.test;

import java.io.*;

public class _100BufferedTest {
    public static void main(String[] args) {
        File file = new File("Arquivo3.txt");
//        try {
//            FileWriter fw = new FileWriter(file); //Append=true -> Acrescenta o Texto no final do Arquivo2
//            BufferedWriter bw = new BufferedWriter(fw);
//            bw.write("Escrevendo uma Mensagem no Arquivo");
//            bw.newLine();
//            bw.write("E Pulando uma Linha3");
//            bw.flush(); //"Cospe tudo de dentro do Túnel"
//            bw.close(); //Fecha o Arquivo
//
//            //Lendo o Arquivo
//            FileReader fr = new FileReader(file);
//            BufferedReader br = new BufferedReader(fr);
//            String s = null;
//            while((s=br.readLine()) != null){
//                System.out.println(s);
//            }
//            br.close(); //Fechando o mais externo "br" o mais interno será fechado "fr"
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //Try with Resources
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));
             BufferedReader br = new BufferedReader(new FileReader(file))){

            bw.write("Escrevendo uma Mensagem no Arquivo");
            bw.newLine();
            bw.write("E Pulando uma Linha3");
            bw.flush(); //"Cospe tudo de dentro do Túnel"
            //bw.close(); //Fecha o Arquivo Automaticamente

            //Lendo o Arquivo
            String s;
            while((s=br.readLine()) != null){
                System.out.println(s);
            }
            br.close(); //Fechando o mais externo "br" o mais interno será fechado "fr"
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

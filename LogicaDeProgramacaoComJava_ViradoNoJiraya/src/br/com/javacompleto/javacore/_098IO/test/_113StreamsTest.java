package br.com.javacompleto.javacore._098IO.test;

import java.io.*;

public class _113StreamsTest {
    public static void main(String[] args) {
        gravador();
        leitor();
        gravadorTunado();
        leitorTunado();
    }

    private static void gravador(){
        byte[] dados = {65,66,67,68,69,70};
        try(FileOutputStream gravador = new FileOutputStream("pasta/stream.txt")){
//            for(byte b : dados){
//                gravador.write(b);
//            }
            //Outra forma além do for é a seguinte:
            gravador.write(dados); //Aqui ele já recebe um Array diretamente
            System.out.println("Dados Gravados com Sucesso!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void gravadorTunado(){
        //Forma mais longa:
//        FileOutputStream gravador = new FileOutputStream("pasta/stream.txt");
//        BufferedOutputStream bf = new BufferedOutputStream(gravador);

        //Forma mais curta:
        byte[] dados = {65,66,67,68,69,70};
        try(BufferedOutputStream gravadorBuffer = new BufferedOutputStream(new FileOutputStream("pasta/stream.txt"), 4098)){ //Reduziu o tamanho do buffer para 4098 para não ficar ocupando muita memória
            gravadorBuffer.write(dados); //Aqui ele já recebe um Array diretamente
            gravadorBuffer.flush(); //Força ao buffer "cuspir" tudo o que faltar...
            System.out.println("Dados Gravados com Sucesso!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void leitor(){
        try(FileInputStream leitor = new FileInputStream("pasta/stream.txt")){
            //O retorno ao chegar no final do arquivo é -1
            int leitura; //pois o read retorna um int
            while((leitura = leitor.read()) != -1){ //o read retorna um int
                byte b = (byte) leitura;
                System.out.println(" " + b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void leitorTunado(){
        try(BufferedInputStream leitorBuffer = new BufferedInputStream(new FileInputStream("pasta/stream.txt"),4098)) {
            //O retorno ao chegar no final do arquivo é -1
            int leitura; //pois o read retorna um int
            while((leitura =leitorBuffer.read())!=-1){ //o read retorna um int
                byte b = (byte) leitura;
                System.out.println(" " + b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

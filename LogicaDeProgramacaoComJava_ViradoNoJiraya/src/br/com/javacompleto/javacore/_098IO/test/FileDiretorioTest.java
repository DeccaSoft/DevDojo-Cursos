package br.com.javacompleto.javacore._098IO.test;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTest {
    public static void main(String[] args) throws IOException {
        //Criando Diretório
        File diretorio = new File("folder");
        boolean mkdir = diretorio.mkdir();
        System.out.println("Diretório Criado? " + mkdir);
        //Criando Arquivo
        File arquivo = new File(diretorio,"Arquivo.txt");
        boolean newFile = arquivo.createNewFile();
        System.out.println("Arquivo Criado? " + newFile);
        //Renomeando Arquivo
        File arquivoNovoNome = new File(diretorio,"arquivo_Renomeado.txt");
        boolean renamed = arquivo.renameTo(arquivoNovoNome);
        System.out.println("Arquivo renomeado? " + renamed);
        //Renomeando Diretório
        File diretorio_Renomeado = new File("folder2");
        boolean diretorio_Renamed = diretorio.renameTo(diretorio_Renomeado);
        System.out.println("Diretório Renomeado? " + diretorio_Renamed);

        buscarArquivos();
    }

    public static void buscarArquivos(){
        File file = new File("folder2");
        String[] list = file.list();
        for(String arquivo : list){
            System.out.println(arquivo);
        }
    }
}

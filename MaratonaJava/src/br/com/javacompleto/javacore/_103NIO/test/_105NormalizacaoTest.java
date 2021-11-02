package br.com.javacompleto.javacore._103NIO.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class _105NormalizacaoTest {
    public static void main(String[] args) {
        String diretorioProjeto = "JavaCompleto\\home\\Andre\\Dev";
        String arquivoTxt = "..\\..\\Arquivo.txt";
        Path p1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(p1);
        System.out.println(p1.normalize());
        Path p2 = Paths.get("home/./Andre/./Dev");
        System.out.println(p2);
        System.out.println(p2.normalize());
        //Não garante que o arquivo exista
    }

}

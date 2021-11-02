package br.com.javacompleto.javacore._103NIO.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class _107RelativizarTest {
    public static void main(String[] args) {
        Path dir = Paths.get("\\home\\Andre");
        Path classe = Paths.get("\\home\\Andre\\java\\Pessoa.java");
        //Relativizar = Eliminar o que tem em comum nos Paths
        //Mais ou menos o contrário do resolve
        Path pathToClasse = dir.relativize(classe);
        System.out.println(pathToClasse);

        Path absoluto1 = Paths.get("\\home\\Andre");
        Path absoluto2 = Paths.get("\\user\\local");
        Path absoluto3 = Paths.get("\\home\\Andre\\java\\Pessoa.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp\\Funcionarios.java");
        System.out.println("1: " + absoluto1.relativize(absoluto3));
        System.out.println("2: " + absoluto3.relativize(absoluto1));
        System.out.println("3: " + absoluto1.relativize(absoluto2));
        System.out.println("4: " + relativo1.relativize(relativo2));
        //System.out.println("5: " + absoluto1.relativize(relativo1));
        //Esse de cima dá um erro em tempo de execução
        //pois não se tem como o java saber onde está o caminho relativo
    }
}

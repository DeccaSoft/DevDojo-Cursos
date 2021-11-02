package br.com.javacompleto.javacore._103NIO.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class _106ResolvendoPaths {
    public static void main(String[] args) {
        Path dir = Paths.get("home\\Andre");
        Path arquivo = Paths.get("Dev\\Arquivo.txt");
        Path result = dir.resolve(arquivo);
        System.out.println(result);

        Path absoluto = Paths.get("\\home\\Andre");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");
        System.out.println("1: " + absoluto.resolve(relativo));
        System.out.println("2: " + absoluto.resolve(file));
        System.out.println("3: " + relativo.resolve(file));
        System.out.println("4: " + relativo.resolve(absoluto));
        System.out.println("5: " + file.resolve(absoluto));
        System.out.println("6: " + file.resolve(relativo));
    }
}

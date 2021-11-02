package br.com.javacompleto.javacore._103NIO.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class _110PosixFileAttributesTest {
    public static void main(String[] args) throws IOException {
        //ATENÃO:
        //Exclusivo para sistemas Operacionais baseado em Unix ou Linux
        //(Não vai rodar no Windows)

        Path path = Paths.get("/home/Andre/dev/arquivo");
        PosixFileAttributes posix = Files.readAttributes(path, PosixFileAttributes.class);
        //Adiciona os atributos grupos e permissões baseados em sistema Unix
        System.out.println(posix.permissions());

        //Ele utilizou uma Máquina Virtual Linux
        // e o site dontpad.com que é bem interessante:
        //Você escreve uma coisa em um navegador no windows e vê em tempo real no linux

        System.out.println("Alterando as Permissões");
        Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("rw-rw-rw-");
        Files.setPosixFilePermissions(path, permissions);
        posix = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println(posix.permissions());
    }
}

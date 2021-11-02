package br.com.javacompleto.javacore._103NIO.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class _109DosFileAttributesTest {
    public static void main(String[] args) {
        Path path = Paths.get("folder2\\teste.txt");
        try {
            //Files.createFile(path);
            // Foi comentado, pois após a 1ª execução o arquivo já existe
            // e não precisa ser criado novamente, caso contrário dá erro
            Files.setAttribute(path, "dos:hidden", true);
            Files.setAttribute(path, "dos:readonly", true);
            DosFileAttributes dos = Files.readAttributes(path, DosFileAttributes.class);
            System.out.println(dos.isHidden());
            System.out.println(dos.isReadOnly());
            //Comentados para poder explicar a Classe DosFileAttributeView
            //Files.setAttribute(path, "dos:hidden", false);
            //Files.setAttribute(path, "dos:readonly", false);
            DosFileAttributeView dosView = Files.getFileAttributeView(path, DosFileAttributeView.class);
            dosView.setHidden(false);
            dosView.setReadOnly(false);
            dos = Files.readAttributes(path, DosFileAttributes.class);
            System.out.println(dos.isHidden());
            System.out.println(dos.isReadOnly());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

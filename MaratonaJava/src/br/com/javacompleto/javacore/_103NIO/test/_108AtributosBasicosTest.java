package br.com.javacompleto.javacore._103NIO.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class _108AtributosBasicosTest {
    public static void main(String[] args) throws IOException {
        Date primeiroDeDezembro = new GregorianCalendar(2015, Calendar.DECEMBER, 1).getTime();
        File file = new File("folder2\\arquivo.txt");
        file.createNewFile();
        file.setLastModified(primeiroDeDezembro.getTime());
        System.out.println(file.lastModified());
        file.delete();
        Path path = Paths.get("folder2\\arquivo_path.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.fromMillis(primeiroDeDezembro.getTime());
        Files.setLastModifiedTime(path, fileTime);
        System.out.println(Files.getLastModifiedTime(path));
        Files.deleteIfExists(path);

        path = Paths.get("src\\br\\com\\javacompleto\\javacore\\introducaoclasses\\classes\\Carro.java");
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isExecutable(path));
        //Interfaces:
        // BasicFileAttributes (Atributos Básicos para Todos os Sistemas Operacionais)
        // PosixFileAttributes (Atributos baseados nos Sistemas Unix ou Linux)
        // e DosFileAttributes (Atributos baseados nos Sistemas Windows)
        //São atributos só de leitura
        BasicFileAttributes atributosBasicos = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("Criado em: " + atributosBasicos.creationTime());
        System.out.println("Último Acesso em: " + atributosBasicos.lastAccessTime());
        System.out.println("Última Modificação em: " + atributosBasicos.lastModifiedTime());
        System.out.println(atributosBasicos.isDirectory());
        System.out.println(atributosBasicos.isRegularFile());
        System.out.println("==================================");
        //Se quisermos alterar esses atributos, temos que utilizar outras interfaces:
        // BasicFileAttributeView (Atributos Básicos para Todos os Sistemas Operacionais)
        // PosixFileAttributeView (Atributos baseados nos Sistemas Unix ou Linux)
        // DosFileAttributeView (Atributos baseados nos Sistemas Windows)
        // FileOwnerAttributeView (Seta o Dono do arquivo/diretório
        // AclFileAttributeView (Permissões mais avançadas)
        FileTime lastModified = atributosBasicos.lastModifiedTime();
        FileTime created = atributosBasicos.creationTime();
        FileTime lastAccess = FileTime.fromMillis(System.currentTimeMillis());
        BasicFileAttributeView basicView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        basicView.setTimes(lastModified, lastAccess, created);
        //Após as mudanças devemos ler novamente os atributos para podermos visulaizar corretamente
        atributosBasicos = Files.readAttributes(path, BasicFileAttributes.class);

        System.out.println("Criado em: " + atributosBasicos.creationTime());
        System.out.println("Último Acesso em: " + atributosBasicos.lastAccessTime());
        System.out.println("Última Modificação em: " + atributosBasicos.lastModifiedTime());
    }
}

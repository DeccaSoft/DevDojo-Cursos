package br.com.javacompleto.javacore._103NIO.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class FindAllTest extends SimpleFileVisitor<Path>{
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test*}.{java,class}");
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if(matcher.matches(file)){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class _112PathMatcherTest {
    public static void main(String[] args) throws IOException {
        //Windows usa-se (\\) e Linux (/), mas também se pode usar (/) no Windows, observe:
        Path path = Paths.get("pasta/subpasta/subsubpasta");
        Files.walkFileTree(path, new AcharTodosOsBkps());

        Path path1 = Paths.get("pasta/subpasta/subsubpasta/file.bkp");
        Path path2 = Paths.get("file.bkp");
        Path path3 = Paths.get("andre-morais");
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.bkp");
        System.out.println("path1: " + matcher.matches(path1));
        System.out.println("path2: " + matcher.matches(path2));
        System.out.println("path: " + matcher.matches(path));
        System.out.println("--------------------------------");
        //* Não inclui separadores de Diretórios
        //** considera os separadores de diretórios
        matches(path1, "glob:*.bkp");
        matches(path1, "glob:**/*.bkp");
        matches(path1, "glob:*");
        matches(path1, "glob:**");
        System.out.println("--------------------------------");
        matches(path1, "glob:*.???");
        matches(path1, "glob:**/*.???");
        matches(path1, "glob:**.???");
        System.out.println("--------------------------------");
        matches(path3, "glob:{andre*, morais*}");
        matches(path3, "glob:{andre,morais}*");
        matches(path3, "glob:{andre,morais}");

        Files.walkFileTree(Paths.get("./"), new FindAllTest());
    }

    private static void matches(Path path, String glob){
        //Método para evitar ficar duplicando o código
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ":" + matcher.matches(path));
    }
}

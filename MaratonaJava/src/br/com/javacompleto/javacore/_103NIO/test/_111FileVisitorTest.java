package br.com.javacompleto.javacore._103NIO.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

//Atenção: Você pode criar quantas classes quiser dentro de um mesmo arquivo
//Porém só pode haver uma Classe Pública e esta DEVE ter o mesmo nome do Arquivo
class AcharTodosOsBkps extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        //No Parâmetro ("T" file), o "T" foi substituído por Path
        if(file.getFileName().toString().endsWith(".bkp")){
            //E se quisessemos mais opções de arquivos? (*.bkp; *.txt; *.doc...)
            //Ficaria um if muito grande, para isto foi criada a Classe PathMatcher
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class _111FileVisitorTest {
    public static void main(String[] args) throws IOException{
        //Files.walkFileTree(Paths.get("pasta"), new AcharTodosOsBkps());
        Files.walkFileTree(Paths.get("pasta"), new PrintDirs());
    }
}

class PrintDirs extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs){
        System.out.println("Pre: " + dir);
        if(dir.getFileName().toString().equals("subsubpasta")){
            //return FileVisitResult.TERMINATE;
            //Aqui ele para na subsubpasta!

            //return FileVisitResult.SKIP_SUBTREE;
            //Aqui ele pula todos que estiverem abaixo dessa pasta!

            //return FileVisitResult.SKIP_SIBLINGS;
            //Aqui ele pula todos que estiverem no mesmo nível dessa pasta!
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        //No Parâmetro ("T" file), o "T" foi substituído por Path
        System.out.println("File " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException{
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc){
        System.out.println("Post: " + dir);
        return FileVisitResult.CONTINUE;
    }
}

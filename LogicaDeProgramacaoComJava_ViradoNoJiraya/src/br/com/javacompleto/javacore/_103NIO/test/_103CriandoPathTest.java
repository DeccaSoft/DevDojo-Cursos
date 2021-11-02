package br.com.javacompleto.javacore._103NIO.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class _103CriandoPathTest {
    public static void main(String[] args) {
        //Path é uma Interface

        //C:\Users\andre\Documents\IntelliJProjects\JavaCompleto
        Path p1 = Paths.get("C:\\Users\\andre\\Documents\\IntelliJProjects\\JavaCompleto\\Arquivo.txt");
        Path p2 = Paths.get("C:\\Users\\andre\\Documents\\IntelliJProjects\\JavaCompleto","Arquivo.txt");
        Path p3 = Paths.get("C:","Users\\andre\\Documents\\IntelliJProjects\\JavaCompleto","Arquivo.txt");
        Path p4 = Paths.get("C:","Users","andre","Documents","IntelliJProjects","JavaCompleto","Arquivo.txt");
        System.out.println(p4.toAbsolutePath());
        File file = p4.toFile();
        Path path = file.toPath();

        //Criando Diretórios
        //Path path1 = Paths.get("pasta"); //Sem a contrabarra pega-se o caminho relativo ao projeto
        Path path2 = Paths.get("pasta\\subpasta\\subsubpasta");
        Path arquivo = Paths.get("pasta\\subpasta\\subsubpasta\\file.txt");
        try {
            //Files.createDirectory(path1);
            if(Files.notExists(path2)) {
                Files.createDirectories(path2);
                //Files.createFile(arquivo);
                //Files.createDirectories(path2.getParent()); geraria somente o diretório
                //caso tivesse o arquivo.txt no caminho... se não geraria um diretório (file.txt)
            }
            if(Files.notExists(arquivo)){
                Files.createFile(arquivo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path source = Paths.get("folder2\\Arquivo.txt");
        Path target = Paths.get(path2.toString() + "\\ArquivoCopiado.txt");
        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            //Files.deleteIfExists(target);
        } catch (IOException e) {
            e.printStackTrace();
        }

        
    }
}

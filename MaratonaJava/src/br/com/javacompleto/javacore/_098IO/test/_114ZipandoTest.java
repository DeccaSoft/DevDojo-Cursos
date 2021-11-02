package br.com.javacompleto.javacore._098IO.test;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class _114ZipandoTest {
    public static void main(String[] args) {
        Path dirZip = Paths.get("pasta/subpasta"); //Diretório onde ficará o Arquivi Zipado
        //Atenção: Devemos criar uma pasta separada para zipar os arquivos
        Path dirFiles = Paths.get("pasta/subpasta/subsubpasta"); //Diretório onde estão os Arquivos a serem Zipados
        Path zipFile = dirZip.resolve("arquivo.zip"); //Nome do Arquivo Zipado. Feito o resolve (junção) com o diretório onde ele ficará
        try (ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(zipFile.toFile())); //.toFile converte um path em file
             DirectoryStream<Path> stream = Files.newDirectoryStream(dirFiles);) { //Isso também deve fazer parte do Try.With.Resources
            //Para zipar todos os arquivos, precisamos percorrer o diretório em busca desses arquivos...
            for(Path path : stream){
                ZipEntry zipEntry = new ZipEntry(path.getFileName().toString()); //Lembre-se que voce pode enxugar este código colocando o new ZipEntry(path.getFileName().toString()) diretamente dentro do zip.putNextEntry(zipEntry)
                //ZipEntry recebe o nome do arquivo (path.getFileName()) que por sua vez
                //retorna um Path, por isso, ,toString().
                zip.putNextEntry(zipEntry); //Colocando o zipEntry dentro do zip
                //Lendo os Arquivos para depois criar uma cópia dos mesmos e zipar
                FileInputStream fileInputStream = new FileInputStream(path.toFile());
                //Utilizando o Buffered...
                BufferedInputStream bf = new BufferedInputStream(fileInputStream);
                //Lembre-se que voce pode enxugar este código colocando o new FileInputStream(path.toFile()) diretamente dentro do BufferedInputStream(fileInputStream)
                byte[] buff = new byte[2048];
                int bytesRead;
                //Gravando os dados
                zip.write(bf.read());
//                while((bytesRead = fileInputStream.read(buff))>0){
                while((bytesRead = bf.read(buff))>0){ //Aqui utilizando
                    zip.write(buff, 0, bytesRead);
                }
                zip.flush();
                zip.closeEntry();
                //fileInputStream.close();
                bf.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

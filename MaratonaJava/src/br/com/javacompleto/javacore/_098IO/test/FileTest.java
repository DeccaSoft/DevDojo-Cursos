package br.com.javacompleto.javacore._098IO.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt"); //Aqui apenas cria o Objeto do tipo File
        //Caso queira criar o Arquivo em um Diretório Específico é só escrever o caminho completo:
        //Exemplo: File file = new File("C:\\JavaCompleto\\src\\br\\com\\IO\\test\\Arquivo.txt");
        try {
            boolean newFile =  file.createNewFile(); //método booleano que diz se o arquivo será criado caso ele não exista
                                //Este método lança exceção, por isso o try..catch
            System.out.println("Arquivo Criado? " + newFile);
            //Poderia fazer diretamente assim: System.out.println(file.createNewFile());
            System.out.println("Arquivo Existe? " + file.exists()); //Retorna se o Arquivo Existe
            System.out.println("Permite Leitura? " + file.canRead()); //Retorna se Permite Leitura
            System.out.println("Path: " + file.getPath()); //Retorna se o Diretório
            System.out.println("Path Completo: " + file.getAbsolutePath()); //Retorna se Caminho Completo
            System.out.println("É um Diretório? " + file.isDirectory()); //Retorna se é Diretório ou Arquivo
            System.out.println("Arquivo Oculto? " + file.isHidden()); //Retorna se é Arquivo Oculto
            System.out.println("Última Modificação: " + new Date(file.lastModified())); //Retorna um Long com a última modificação em milesegundos
            //file.delete() -> Apaga o Arquivo
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

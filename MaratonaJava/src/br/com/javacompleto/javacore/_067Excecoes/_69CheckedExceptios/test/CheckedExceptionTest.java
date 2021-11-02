package br.com.javacompleto.javacore._067Excecoes._69CheckedExceptios.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) {
        try {
            criarArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Para se provocar uma Checked Exception mais rapidamente,
    //vamos utilizar um código já Existente na JVM...
    //Iremos utilizar o método createNewFile() throws IOException

    //Criando um novo método que deve ser Estático, pois vamos acessá-lo a partir do método main
    public static void criarArquivo() throws IOException {
        File file = new File("Teste.txt");
        try{
            System.out.println("Arquivo Criado? " + file.createNewFile());
            System.out.println("Com Sucesso!!!");
        }catch(IOException e){ //Você TEM que ter algum método no bloco TRY que possivelmente lance essa Exceção
            //NUNCA crie um Bloco Try-Catch sem nenhum código aqui! Somente assim você saberá o que aconteceu de errado.
            //Utilize no mínimo o printStackTrace para saber, pois ele mostra qual o tipo de Erro.
            e.printStackTrace(); //Este é um método sem retorno(Void), portanto não pode está dentro de um Println
            //Se você quiser, ainda pode lançar novamente essa exceção, utilizando o:
            throw e; //Mas para isso o método criarArquivo teria que ter o throws IOException
        }

    }
}

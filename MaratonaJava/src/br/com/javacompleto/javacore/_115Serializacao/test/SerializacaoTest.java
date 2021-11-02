package br.com.javacompleto.javacore._115Serializacao.test;

import br.com.javacompleto.javacore._115Serializacao.classes.Aluno;
import br.com.javacompleto.javacore._115Serializacao.classes.Turma;

import java.io.*;

public class SerializacaoTest {

    //Serialização = Fazer um objeto passar por um Fluxo de Dados (Semelhante ao Stream)

    public static void main(String[] args) {
        System.out.println("Gravando Objeto...");
        gravadorObjeto();
        System.out.println("Lendo Objeto...");
        leitorObjeto();
        //Atenção: Na leitura o Construtor não é Chamado!!! Ou seja, se tivéssemos Herança o (super) NÃO seria chamado.
    }

    private static void gravadorObjeto() {
        Turma t = new Turma("Maratona Java, só para os Campeões!");
        Aluno aluno = new Aluno(1L, "Andre Morais", "123456");
        aluno.setTurma(t);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aluno.ser"));) {
//            FileOutputStream fos = new FileOutputStream("aluno.set");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(aluno);
//            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void leitorObjeto() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aluno.ser"));) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //ATENÇÃO: Trabalhamos desde o início com Objetos e não com Atributos Estáticos,
    //porque estes pertencem à Classe e não podem ser Serializados
}

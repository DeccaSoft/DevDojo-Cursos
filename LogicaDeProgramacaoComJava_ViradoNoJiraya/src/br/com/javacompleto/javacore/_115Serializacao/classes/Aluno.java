package br.com.javacompleto.javacore._115Serializacao.classes;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Aluno extends Pessoa implements Serializable { //Indica que esta Classe é Serializada

    private long id;
    private String nome;
    private transient String password; //transient = Este atributo não será Serializado
    private static String nomeEscola = "DevDojo :)";
    private transient Turma turma;

    public Aluno(long id, String nome, String password) {
        System.out.println("Dentro do Construtor");
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    private void writeObject(ObjectOutputStream oos){
        //Na hora da Serialização é verificado se existe este método
        try {
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());
            //ATENÇÃO: Na hora da Leitura DEVE-SE seguir a mesma ordem acima
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois){
        //Na hora da Serialização é verificado se existe este método
        try {
            ois.defaultReadObject();
            turma = new Turma(ois.readUTF());
            //ATENÇÃO: DEVE-SE seguir a mesma ordem do método writeObject
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ID=" + id +
                ", Nome='" + nome + '\'' +
                ", Password='" + password + '\'' +
                ", Escola='" + nomeEscola + '\'' +
                ", Turma='" + turma + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String getNomeEscola() {
        return nomeEscola;
    }

    public static void setNomeEscola(String nomeEscola) {
        Aluno.nomeEscola = nomeEscola;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}

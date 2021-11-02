package br.com.javacompleto.javacore._115Serializacao.classes;

import java.io.Serializable;

public class Turma { //Caso não tivéssemos acesso para aqui colocarlmos o (implements Serializable)
    //Neste caso poderíamos colocar o Turma na Classe Aluno como Transient , porém ficaria como Nulo
    //Neste caso utilizamos os métodos writeObject e readObject

    private String nome;

    public Turma(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

package br.com.javacompleto.javacore._056ModificadorFinal.classes;

public class Comprador { //Se a classe fosse final, ela não poderia ser extendida!
    private String nome;

    @Override
    public String toString() {
        return "Comprador{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

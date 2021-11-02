package br.com.javacompleto.javacore._055Sobrescrita.classes;

public class Pessoa {
    private String nome;
    private int idade;

    @Override                   //Sobrescrita
    public String toString(){   //Tem que ter o mesmo modificador de acesso ou um menos restrito!
                                //Tem que ter o mesmo tipo de Retorno ou um retorno Covariante!
                                //Tem que ter o mesmo nome e a mesma quantidade de parâmetros!
        return "Nome: " + nome + ", Idade: " + idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

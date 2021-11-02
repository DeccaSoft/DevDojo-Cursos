package br.com.javacompleto.javacore._054ExercitandoSequenciaInicializacao;

public class Pessoa {
    private String Nome;
    static{
        System.out.println("Bloco de Inicialização Estático SuperClasse Pessoa");
    }
    {
        System.out.println("Bloco de Inicialização SuperClasse Pessoa");
    }
    public Pessoa(){
        System.out.println("Construtor SuperClasse Pessoa");
    }
    public Pessoa(String nome){
        System.out.println("Construtor SuperClasse Pessoa String");
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
}

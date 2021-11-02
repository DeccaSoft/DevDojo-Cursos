package br.com.javacompleto.javacore._054ExercitandoSequenciaInicializacao;

public class Filho  extends Pessoa{
    private String sobrenome;
    static{
        System.out.println("Bloco de Inicialização Estático SubClasse Filho");
    }
    {
        System.out.println("Bloco de Inicialização SubClasse Filho");
    }
    public Filho() {
        System.out.println("Construtor SubClasse Filho ");
    }
    public Filho(String sobrenome) {
        System.out.println("Construtor SubClasse Filho String");
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}

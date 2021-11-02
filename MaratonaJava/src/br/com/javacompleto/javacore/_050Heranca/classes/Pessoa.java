package br.com.javacompleto.javacore._050Heranca.classes;

//Herança é utlizado principalmente para se reutilizar código e/ou para Polimorfismo

//Toda classe em Java Extends da classe Object

public class Pessoa{
    protected String nome; //protected pode ser acessado nas classes filhas ou do mesmo pacote!
    protected String cpf;
    protected Endereco endereco;


    public Pessoa(String nome){
        System.out.println("Dentro do Construtor Pessoa(String)");
        this.nome = nome;
    }

    static{
        System.out.println("Bloco de Inicialização Estático de Pessoa");
    }
    {
        System.out.println("Bloco de Inicialização de Pessoa 1");
    }
    {
        System.out.println("Bloco de Inicialização de Pessoa 2");
    }

    public Pessoa(String nome, String cpf){
        this(nome); //Chama o construtor da própria classe sem repetir o nome
        this.cpf = cpf;
    }

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço:");
        System.out.println("Rua: " + this.endereco.getRua());
        System.out.println("Bairro: " + this.endereco.getBairro());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}

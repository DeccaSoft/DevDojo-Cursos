package br.com.javacompleto.javacore._038SobrecargaMetodos.classes;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String rg;

    //Construtores são rotinas de inicilaização
    //Copnstrutores NÃO podem ter retorno, nem mesmo void!
    public Funcionario(String nome){ //Assim sempre terá que inicilaizar o Funcionário com o nome do mesmo
        System.out.println("Dentro do Construtor...");
        this.nome = nome;
    }

    public Funcionario(){//Construtor também aceita sobrecarga
        //Construtor vazio
    }

    public void init(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    public void init(String nome, String cpf, double salario, String rg){
        init(nome, cpf, salario);
        /*this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;*/
        this.rg = rg;
    }

    public void imprime(){
        System.out.println("Funcionário: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Salário: " + this.salario);
        System.out.println("RG: " + this.rg);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setRg(String rg){
        this.rg = rg;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getRg(){
        return this.rg;
    }
}

package br.com.javacompleto.javacore._039SobrecargaConstrutores.classes;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;

    public Estudante(String matricula, String nome, double[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

    public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
        //A chamada para outro construtor DEVE ser a primeira instrução.
        this(matricula, nome, notas); //Somente construtores podem chamar outros construtores
        this.dataMatricula = dataMatricula;
    }

    public Estudante() {
        System.out.println("Construtor Deafault...");
    }

    public void imprime() {
        System.out.println(this.matricula);
        System.out.println(this.nome);
        for (double nota : notas) {
            System.out.println(nota + " ");
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
}

package br.com.javacompleto.javacore._042ModificadorEstático.classes;

public class Carro {
    //Velocidade Limite deve ser de 240km/h
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 240; //Com o static o atributo pertence à classe e não ao objeto.

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }
    public static double getVelocidadeLimite(){
        return velocidadeLimite;
    }

    //OBS<: Qualquer método pode se tornar estático desde ele que não esteja acessando atributo de classe
    public void imprime() {
        System.out.println("----------------------");
        System.out.println("Carro: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}

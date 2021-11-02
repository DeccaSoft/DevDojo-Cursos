package br.com.javacompleto.javacore._054ExercitandoSequenciaInicializacao;

public class Test {
    public static void main(String[] args) {
        System.out.println("Instanciando Pessoa p -----------------------------");
        Pessoa p = new Pessoa();
        System.out.println("Instanciando Filho f ------------------------------");
        Filho f = new Filho();
        System.out.println("Instanciando Pessoa2(String) p2 - André -----------");
        Pessoa p1 = new Pessoa("André");
        System.out.println("Instanciando Filho2(String) f2 -Morais ------------");
        Filho f1 = new Filho("Morais");
        System.out.println("---------------------------------------------------");
    }
}

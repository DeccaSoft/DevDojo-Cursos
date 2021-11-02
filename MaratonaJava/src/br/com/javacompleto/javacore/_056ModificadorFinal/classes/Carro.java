package br.com.javacompleto.javacore._056ModificadorFinal.classes;

public class Carro {
    private static final double VELOCIDADE_FINAL=200;   //Constante
    private final Comprador comprador = new Comprador();//Para se inicializar uma variável final do tipo reference
                                                        //obviamente, devemos construir um novo objeto.
    private String nome;
    private String marca;


    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public final void imprime(){  //Método final: ele não pode ser sobrescrito, mas pode ser sobrecarregado!
        System.out.println("Imprimindo um carro");
    }

    public Comprador getComprador() {
        return comprador;
    }

    public static double getVelocidadeFinal() {
        return VELOCIDADE_FINAL;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

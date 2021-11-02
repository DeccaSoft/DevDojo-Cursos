package br.com.javacompleto.javacore._062Interfaces.classes;

//Uma Interface diz O QUE deve ser feito, mas não COMO ser feito

public class Produto implements Tributavel, Transportavel{ //Pode-se Imlpementar mais de um Interface
    //Implements faz a Relação (É UM), ou seja, um produto é tributável
    private String nome;
    private double peso;
    private double preco;
    private double precoFinal;
    private double valorFrete;

    public Produto(String nome, double peso, double preco) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }

    @Override
    public void calculaImposto() {
        precoFinal = this.preco + (this.preco * IMPOSTO);
    }

    @Override
    public void calculaFrete() {
        this.valorFrete = this.preco/peso * 0.1;
    }

    //Devido à oredem de Restritividade dos Modificadores (private>default>protected>public)
    //Aqui os todos os métodos Sobrescritos DEVEM ser públicos, pois na Interfarce são Públicos por Padrão

    @Override
    public String toString() {
        return "Produto{" +
                "Nome= '" + nome + '\'' +
                ", Peso= " + peso +
                ", Preco= " + preco +
                ", Preco Final (com Imposto)= " + precoFinal +
                ", Valor Frete= " + valorFrete +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public double getValorFrete() {
        return valorFrete;
    }
}

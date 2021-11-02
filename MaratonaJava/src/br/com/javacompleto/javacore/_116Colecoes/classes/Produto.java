package br.com.javacompleto.javacore._116Colecoes.classes;

import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private String serialNumber;
    private String nome;
    private double preco;
    //Para se Implementar o compareTo() o ideal seria mudar double para Double
    //pois tipos primitivos não possuem métodos

    //Aula 125: Removendo elementos da lista com Iterator
    //Aula 125: Caso - Queremos selecionar produtos da lista com quantidade = 0 e remevê-los
    //Aula 125: Acrescentando atributo quantidade
    private int quantidade;
    //Aula 125: Incluindo novo Construtor Sobrecarregado com o Atributo Quantidade
    public Produto(String serialNumber, String nome, double preco, int quantidade) {
        this.serialNumber = serialNumber;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    //Aula 125: Agora vamos acrescentar o Atributo quantidade no toString() e Adicionar o get e set para quantidade

    public Produto(String serialNumber, String nome, double preco) {
        this.serialNumber = serialNumber;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto outroObjeto) {
        //Regra: Retirna um int, onde:
        //Negativo se thisObject < outroObjeto (thisObject = Atributo Escolhido de Produto)
        //Zero se thisObject == outroObjeto
        //Positivo se thisObject > outroObjeto
        return this.serialNumber.compareTo(outroObjeto.getSerialNumber());
        //A Classe String já tem o método compareTo implementado

        //ATENÇÃO:
        // Se fossemos mudar o compareTo para o preco,
        //além de mudar lá em cima na declaração do atributo de double para Double,
        //ficaria assim:
        // return this.preco.compareTo(outroObjeto.getPreco());
        //ou
        //Double d = preco;
        // return d.compareTo(outroObjeto.getPreco());
    }
    //ATENÇÃO:
    //O IDEAL é utilizar a Interface Comparator, pois assim não corre os risco de você quebrar Outros Códigos
    //ao se alterar o compareTo()

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(serialNumber, produto.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "serialNumber='" + serialNumber + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade + //Aula 125: Acrescentando atributo aquntidade no toString
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //Aula 125: Adicionando o get e set para quantidade...

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

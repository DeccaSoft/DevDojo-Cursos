package br.com.javacompleto.javacore._116Colecoes.test;

import br.com.javacompleto.javacore._116Colecoes.classes.Produto;

import java.util.*;

class ProdutoNomeComparator implements Comparator<Produto>{

    @Override
    public int compare(Produto o1, Produto o2) {
        //Os Retornos são exatamente os mesmos de Comparable
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class SortProdutoTest {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0);
        Produto produto2 = new Produto("321", "Picanha", 26.4);
        Produto produto3 = new Produto("879", "Teclado Razer", 1000.0);
        Produto produto4 = new Produto("012", "Sansung Galaxy S7 64Gb", 3250.5);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        //(Utilizando Comparable)
        //Collections.sort(produtos); //Para se ordenar uma Lista de Objetos
        // DEVE-SE implementar a Interface Comparable
        // e assim informar como o Java deverá proceder (sob qual atributo deverá ordenar)

        //(Utilizando Comparator) - Também é válido para Arrays
        Collections.sort(produtos, new ProdutoNomeComparator());
        for(Produto produto : produtos){
            System.out.println(produto);
        }
        System.out.println("============================================================");
        //Ordenando Arrays
        Produto[] produtosArray = new Produto[4];
        produtosArray[0] = produto1;
        produtosArray[1] = produto2;
        produtosArray[2] = produto3;
        produtosArray[3] = produto4;
        //Da mesma forma que temos a Classe Collections, temos a Classe Arrays
        //Aqui ele segue o Comparable:
        //Arrays.sort(produtosArray);

        //E aqui segue o Comparator:
        Arrays.sort(produtosArray, new ProdutoNomeComparator());

        //System.out.println(Arrays.toString(produtosArray));
        for(Produto produto : produtosArray){
            System.out.println(produto);
        }


    }
}

package br.com.javacompleto.javacore._116Colecoes.test;

import br.com.javacompleto.javacore._116Colecoes.classes.Produto;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class _126SetTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0, 10);
        Produto produto2 = new Produto("321", "Picanha", 10d, 10);
        Produto produto3 = new Produto("879", "Teclado Razer", 1000.0, 0);
        Produto produto4 = new Produto("012", "Sansung Galaxy S7 64Gb", 3250.5, 0);
        Produto produto5 = new Produto("999", "Sansung Galaxy S6 64Gb", 3250.5, 0);
//        Set<Produto> produtoSet = new HashSet<>(); //Não é ordenado!!!
        Set<Produto> produtoSet = new LinkedHashSet<>(); //Mantém a ordem de Inserção
        //Atenção: Set NÃO permite elementos duplicados!!!
        produtoSet.add(produto1);
        produtoSet.add(produto2);
        produtoSet.add(produto3);
        produtoSet.add(produto4);
        produtoSet.add(produto5);
        //Atenção: Set NÃO é indexado!!!
        for(Produto p : produtoSet){
            System.out.println(p);
        }
    }
}

package br.com.javacompleto.javacore._116Colecoes.test;

import br.com.javacompleto.javacore._116Colecoes.classes.Produto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class _125IteratorTest {
    public static void main(String[] args) {
        //Aula 125: Queremos selecionar produtos da lista com quantidade = 0 e remevê-los

        //Como trabalhamos Orientado à Interface, podemos trocar o ArrayList por LinkesList
        //onde o método revove (SE fosseomos utilizá-lo) é mais rápido
        List<Produto> produtos = new LinkedList<>();
        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0, 10);
        Produto produto2 = new Produto("321", "Picanha", 10d, 10);
        Produto produto3 = new Produto("879", "Teclado Razer", 1000.0, 0);
        Produto produto4 = new Produto("012", "Sansung Galaxy S7 64Gb", 3250.5, 0);
        //Depois falaremos sobre o Padrão de Construção de Objetos (Builder) - Design Patterns
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        //Para remover ítens da lista a melhor forma é cum um Iterator (e mais confiável)
        Iterator<Produto> produtoIterator = produtos.iterator();
        //Métodos:
                //hasNext() = Verifica se tem o próximo elemento na lista
                //next() = Pega o próximo elemento na lista
        while(produtoIterator.hasNext()){
            //Comentados para melhorar o código...
            
            //Produto produto = produtoIterator.next();
            //if(produto.getQuantidade() == 0){

            if(produtoIterator.next().getQuantidade() == 0){
                produtoIterator.remove();
            }
        }
        System.out.println(produtos.size());
    }
}

package br.com.javacompleto.javacore._116Colecoes.test;

import br.com.javacompleto.javacore._116Colecoes.classes.Celular;
import br.com.javacompleto.javacore._116Colecoes.classes.Produto;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

//Comparator para utilizar a Classe Celular que não implementa Comparable
class CelularNomeComparator implements Comparator<Celular> {
    @Override
    public int compare(Celular o1, Celular o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class _127TreeSetTest {
    public static void main(String[] args) {

        //Para se inserir elementos, DEVE-SE ter Objetos que implementem a Interface Comparable!!!
        //Ou passar um Comparator no construtor do TreeSet
        Celular celular =  new Celular("IPhone 7", "1234");
        //NavogableMap - Trabalhando Orientado à Interface
        NavigableSet<Celular> celularNavigableSet =  new TreeSet<>(new CelularNomeComparator());
        celularNavigableSet.add(celular);
        for(Celular celular1 : celularNavigableSet){
            System.out.println(celular1);
        }

        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0, 10);
        Produto produto2 = new Produto("321", "Picanha", 10d, 10);
        Produto produto3 = new Produto("879", "Teclado Razer", 1000.0, 0);
        Produto produto4 = new Produto("012", "Sansung Galaxy S7 64Gb", 3250.5, 0);
        Produto produto5 = new Produto("023", "Sansung Galaxy S6 64Gb", 3250.5, 0);
        //No TreeSet os elementos são Ordenados Automaticamente e NÃO permite elementos Duplicados
        NavigableSet<Produto> produtoNavigableSet =  new TreeSet<>();
        produtoNavigableSet.add(produto1);
        produtoNavigableSet.add(produto2);
        produtoNavigableSet.add(produto3);
        produtoNavigableSet.add(produto4);
        produtoNavigableSet.add(produto5);
        for(Produto produto : produtoNavigableSet.descendingSet()){ //Ordem Descendente
            System.out.println(produto);
        }
        System.out.println("-----------------------------");
        //Alguns Métodos do NavigableSet:
        //ATENçÃO: Aqui estamos comparando o serialNumber
        //lower: retorna o menor (<)
        System.out.println(produtoNavigableSet.lower(produto4));
        //floor: retorna o menor ou igual (<=)
        System.out.println(produtoNavigableSet.floor(produto4));
        //higher: retorna o maior (>)
        System.out.println(produtoNavigableSet.higher(produto2));
        //ceiling: retorna o maior ou igual (>=)
        System.out.println(produtoNavigableSet.ceiling(produto1));
        //pollFirst ou pollLast: retorna e remove um objeto
        System.out.println(produtoNavigableSet.pollFirst());
        System.out.println(produtoNavigableSet.size());
        System.out.println(produtoNavigableSet.pollLast());
        System.out.println(produtoNavigableSet.size());
    }
}

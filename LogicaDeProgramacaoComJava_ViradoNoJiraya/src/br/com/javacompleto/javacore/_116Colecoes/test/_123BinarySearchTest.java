package br.com.javacompleto.javacore._116Colecoes.test;

import br.com.javacompleto.javacore._116Colecoes.classes.Produto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _123BinarySearchTest {
    public static void main(String[] args) {
        //Enquanto o containsAll() retorna se existe determinado elemento na Lista (true ou false)
        //O binarySearch retorna o índice do elemento
        // ou (caso não encontre o elemento) o índice onde este deverá ser inserido, seguindo a seguinte regra:
        // (-(ponto de inserção) - 1)

        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        //Para se utilizar o método Collections.binarySearch() precisa-se passar a Lista JÁ ORDENADA!
        //Para tanto, precisa-se entender como funciona a Ordem de Inserção
        //ou seja, (-(ponto de inserção) - 1)
        //Outro detalhe e que o binarySearch possui um método sobrecarregado para utilizar o Comparator
        Collections.sort(numeros);
        //Índices: 0, 1, 2, 3
        //Valores: 0, 2, 3, 4
        System.out.println("Índice: " + Collections.binarySearch(numeros, 2));
        //System.out.println("Valor: " + numeros.get(Collections.binarySearch(numeros, 2)));
        //Portanto se passássemos o valor 1 (que não existe)
        // ele ordenaria de acordo com a regrinha (-(ponto de inserção) - 1)
        System.out.println("Índice: " + Collections.binarySearch(numeros, 1));

        //Utilizando o Comparator e fazendo o teste com Produtos
        List<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0);
        Produto produto2 = new Produto("321", "Picanha", 26.4);
        Produto produto3 = new Produto("879", "Teclado Razer", 1000.0);
        Produto produto4 = new Produto("012", "Sansung Galaxy S7 64Gb", 3250.5);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        Collections.sort(produtos, new ProdutoNomeComparator());
        Produto produto5 = new Produto("000", "Antena", 50);
        for(Produto produto : produtos){
            System.out.println(produto);
        }
        System.out.println(Collections.binarySearch(produtos, produto5, new ProdutoNomeComparator()));

        //Da mesma forma funciona para Arrays
        Integer[] arrayInteger = new Integer[4];
        arrayInteger[0] = 2;
        arrayInteger[1] = 0;
        arrayInteger[2] = 4;
        arrayInteger[3] = 3;
        Arrays.sort(arrayInteger); //NUNCA esqueça do sort
        System.out.println(Arrays.binarySearch(arrayInteger, 1));
    }
}

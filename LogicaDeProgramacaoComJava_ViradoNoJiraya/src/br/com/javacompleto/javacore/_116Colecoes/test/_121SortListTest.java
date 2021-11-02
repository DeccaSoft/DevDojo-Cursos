package br.com.javacompleto.javacore._116Colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _121SortListTest {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("André");
        nomes.add("Dani");
        nomes.add("Mateus");
        nomes.add("Davi");
        nomes.add("DeccaSoft");
        nomes.add("André"); //ArrayLists podem conter elementos Repetidos
        nomes.add(0, "Maria");
        //Lembre-se: A Lista não é sortida, é ordenada, ou seja, é mantida de acordo com um índice
        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("---------------");
        Collections.sort(nomes);
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}

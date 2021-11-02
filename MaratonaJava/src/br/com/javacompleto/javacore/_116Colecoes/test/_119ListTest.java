package br.com.javacompleto.javacore._116Colecoes.test;

//import br.com.javacompleto.javacore._115Serializacao.classes.Pessoa;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class _119ListTest {
    public static void main(String[] args) {
        /**
        //Utilizando um Conceito da Orietação a Objetos que é Programando para uma Interface
        //Ou seja, vamos (quase sempre) utiliza a Interface como Variável de Referência

        //Até o Java 5 era assim:
        List nomes = new ArrayList();
         //Um ArrayList é como se fosse um array que pode crescer de tamanho!
        nomes.add("André)");
        nomes.add("Mateus");
        //Até a versão 4 poderia fazer isso:
        nomes.add(new Pessoa());
        //Então no foreach tínhamos que utilizar Object no array
        for (Object nome : nomes) {
            System.out.println(nome);
        }
        //Então a partir da versão 5 foi introduzido os Generics e ficou assim:
         List<String> nomes = new ArrayList<String>();
         //E a partir da versão 7 pode ficar assim: */
        List<String> nomes = new ArrayList<>(); //Sintaxe dimaond ou Notação Diamante
        //ATENÇÃO: Não se pode utilizar tipos primitivos em ArraysLists
        nomes.add("André");
        nomes.add("Mateus");
        //Iterando da forma mais antiga...
        for(int i=0; i<nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
        System.out.println("------------------");
        //Para provar que o ArrayList pode crescer de tamanho...
        nomes.add("Davi");
        //Usando foreach...
        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("------------------");
        nomes.add("Daniella");
        //A partir do Java 8 o foreach acima pode ser substituído por:
        nomes.forEach(System.out::println);
        System.out.println("------------------");
        //Removendo um ítem:
        //O método remove() pode receber como parâmetro um Índice
        nomes.remove(0);
        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("------------------");
        //ou um Objeto (testado através do equals)
        nomes.remove("Mateus");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("------------------");

        //Mais Exemplos
        List<Integer> numeros = new ArrayList<>();
        //ATENÇÃO: Não se pode utilizar tipos primitivos em ArraysLists
        numeros.add(10); //Aqui o Java faz o AutoBoxing para Integer
        numeros.add(20);
        //Embre-se: O método remove() pode receber como parâmetro um Índice
        //ou um Objeto (testado através do equals). Portanto para remover um Integer
        //Precisa-se fazer um casting para Object
        numeros.remove((Object)20);
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
        System.out.println("------------------");
        //Removendo TODOS os objetos de uma lista (Limpando esta Lista)
        numeros.clear();
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
        if(numeros.size() == 0){
            System.out.println("Lista Vazia!!!");
        }
        //Aqui não NullPoiterException porque o Objeto ainda existe, apesar de estar vazio.
        System.out.println("------------------");

        //Juntando Coleções
        List<String> nomes2 = new ArrayList<>();
        nomes2.add("André");
        nomes2.add("Mateus");
        nomes.addAll(0, nomes2); //Junta uma coleção com a outra - Inclusive se pode escolher o Índice
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}

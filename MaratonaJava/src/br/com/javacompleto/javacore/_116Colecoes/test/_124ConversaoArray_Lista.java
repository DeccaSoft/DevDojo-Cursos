package br.com.javacompleto.javacore._116Colecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _124ConversaoArray_Lista {
    public static void main(String[] args) {

        //Convertendo Listas em Arrays:
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        //Object[] objects = numeros.toArray();
        Integer[] numerosArray = new Integer[numeros.size()];
        numeros.toArray(numerosArray);
        System.out.println(numeros);
        //ou
        System.out.println(Arrays.toString(numerosArray));
        System.out.println("---------------------------");

        //Convertendo Arrays em Listas:
        Integer[] numerosArray2 = new Integer[4];
        numerosArray2[0] = 10;
        numerosArray2[1] = 9;
        numerosArray2[2] = 8;
        numerosArray2[3] = 7;
        List<Integer> numeros2 = Arrays.asList(numerosArray2);
        System.out.println(Arrays.toString(numerosArray2));
        //ou
        System.out.println(numeros2);
        //Cuidado com o Método asList, pois ele coloca no Rip de Memória,
        //Ou seja, o Araay e A Lista apontam para a mesma Referência,
        //Quer dizer que qualquer alteração em um repercutirá no outro.
        numeros2.set(0, 1); //Alterando a posição Zero para o valor "1"...
        System.out.println("---------------------------");
        //Perceba qoe os dois serão Alterados
        //Inclusive, se você adicionar um elemento à lista,
        //terá um erro pois o array não suporta.
        System.out.println(Arrays.toString(numerosArray2));
        //ou
        System.out.println(numeros2);
        //Caso necessite de mais liberdade, o ideal é criar uma nova lista...
        List<Integer> numeros3 = new ArrayList<>();
        numeros3.addAll(Arrays.asList((numerosArray2))); //e adicionar os numeros do Araay criado
        numeros3.set(0, 5); //Alterando a posição Zero para o valor "5"...
        System.out.println(Arrays.toString(numerosArray2));
        //ou
        System.out.println(numeros2);
        System.out.println(numeros3);
        //Note que agora não está mais vinculado!
        System.out.println("---------------------------");
        //Inclusive podemos até incluir novo item e não interferirá no array...
        numeros3.add(10);
        System.out.println(Arrays.toString(numerosArray2));
        //ou
        System.out.println(numeros2);
        System.out.println(numeros3);
        //Note que agora não está mais vinculado!
    }
}

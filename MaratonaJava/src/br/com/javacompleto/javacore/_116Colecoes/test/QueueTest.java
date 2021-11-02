package br.com.javacompleto.javacore._116Colecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        //Queue é uma FILA
        Queue<String> queue = new PriorityQueue<>(); //Ordena de acordo com uma lista de prioridades
        //definidas através da interface Comparable
        queue.add("C");
        queue.add("D");
        queue.add("A");
        queue.add("B");
        System.out.println(queue);
        //Métodos
        System.out.println(queue.remove()); //Devolve e tira o primeiro objeto da fila
                                            //Lança exceção caso a queue esteja vazia
        System.out.println(queue);
        System.out.println(queue.peek()); //Devolve o objeto mas não tira da fila.
                                        // Retorna null caso vazia
        System.out.println(queue);
        System.out.println(queue.poll()); //Devolve o Objeto e remove da coleção
                                        //Diferença do remove = Não lança Exceção
        System.out.println(queue);
        System.out.println(queue.offer("E")); //Adiciona um objeto em uma fila com tamanho predefinido
                                            //No caso lança uma exceção
        System.out.println(queue);
        System.out.println(queue.remove("D"));
        System.out.println(queue);

    }
}

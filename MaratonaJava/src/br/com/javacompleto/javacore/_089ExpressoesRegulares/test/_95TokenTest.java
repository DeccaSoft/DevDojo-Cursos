package br.com.javacompleto.javacore._089ExpressoesRegulares.test;

import java.util.Scanner;

public class _95TokenTest {
    public static void main(String[] args) {
        String str = "Willian, Paulo André, Joana, Camila, Anna, John, Matheus";
        //Pretende-se quebrar a String separando os nomes. Utilizando a "," como delimitador

        //Primeira Forma: método split da Classe String. Split retorna um Array de String
        String[] tokens = str.split(",");
        //Também poderia usar expressões regulares como Delimitadores.
        // Exemplo: str.split("\\d") caso tivéssemos números como William9 Paulo3 Joana5...
        for(String arr : tokens){
            System.out.println(arr.trim()); //.trim = Elimina os Espaços em Branco do começo e do fim da String
        }
        System.out.println("+++++++++++++++++++++++++");

        //Segunda Forma: Classe Scanner
        Scanner scanner = new Scanner("1 true 100 oi"); //Padrão do Delimitador é o Espaço em Branco
        //O Delimitador pode ser alterado com o método useDelimiter()
        //A Classe Scanner converte um número automaticamente,
        // diferentemente da String onde o número é convertido para uma String Automaticamente
        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }
        System.out.println("+++++++++++++++++++++++++");
        Scanner scanner2 = new Scanner("1 true 100 oi");
        while(scanner2.hasNext()){
            if(scanner2.hasNextInt()){
                int i = scanner2.nextInt();
                System.out.println(i);
            }else if(scanner2.hasNextBoolean()){
                boolean b = scanner2.nextBoolean();
                System.out.println(b);
            }else{
                System.out.println(scanner2.next());
            }
        }
    }
}

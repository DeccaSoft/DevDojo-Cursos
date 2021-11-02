package br.com.javacompleto.javacore._080Strings.test;

import java.sql.SQLOutput;

public class StringTest {
    public static void main(String[] args) {
        //Strings no Java são Imutáveis
        String nome = "André";
        //Aqui o Java criou:
            //1-Uma variável de referência
          //2-Uma String no Pool de String
        String sobrenome = new String(" Morais");
        //Aqui o Java criou:
            //1-Uma variável de referência
            //2-Um objeto do tipo String
           //3-Uma String no Pool de String
        System.out.println(nome + sobrenome);
        nome += sobrenome; //Na realidade, aqui, o Java criou uma nova String!
        System.out.println(nome);
        nome.concat(" de Azevedo"); //Lembre-se: Strings são imutáveis
        System.out.println(nome);
        nome = nome.concat(" de Azevedo"); //Mesmo que: nome += " de Azevedo";
        System.out.println(nome);
        String nome2 = "André";
        System.out.println(nome + " + " + nome2);
        System.out.println("+++++++ Aula2 ++++++++");
        String teste = "Goku";
        System.out.println(teste.charAt(0)); //Atenção: o índice começa em Zero
        System.out.println(teste.charAt(3));
        String teste2 = "gOKU";
        System.out.println(teste.equalsIgnoreCase(teste2));
        System.out.println(nome.length());
        String teste3 = "AaaOoo";
        System.out.println(teste3.replace('a','o'));
        System.out.println(teste2.toLowerCase());
        System.out.println(teste2.toUpperCase());
        System.out.println(teste2);
        String teste4 = "0123456789";
        System.out.println(teste4.substring(0,6)); //Argumento1 = Posição Inicial
        System.out.println(teste4.substring(2,5)); //Argumento2 = É a posição final (n-1)
        String teste5 = "     aaa   bbb   ";
        System.out.println(teste5.trim()); //Retira todos os espaços em branco do começo e do final da String


    }
}

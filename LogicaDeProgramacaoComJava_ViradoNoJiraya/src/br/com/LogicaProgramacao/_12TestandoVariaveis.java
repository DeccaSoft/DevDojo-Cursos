package br.com.LogicaProgramacao;

public class _12TestandoVariaveis {
    public static void main(String[] args) {
        //Tipos Primitivos Java
        /*
        boolean 1 bit (T ou F)(0 ou 1)(true ou false)
        byte    8 bits
        (char   16 bits)
        short   16 bits
        int     32 bits
        float   32 bits
        long    64 bits
         */

        char ascii = 65;
        System.out.println(ascii); //Imprime o caractere da tabela ASCII
        char caractere = 'A';
        System.out.println(caractere);
        char char1 = 'A';
        char char2 = 'A';
        System.out.println(char1+char2);//Imprime a soma dos códigos ASCII
        System.out.println(""+char1+char2);//Temos que iniciar com uma string
                                                    //para ele tratar como String
        String nome = "André Azevedo";
        System.out.println(nome);

        boolean condicao = true; //Ou false
        System.out.println(condicao); //Atenção: aqui ele imprime uma String
    }
}

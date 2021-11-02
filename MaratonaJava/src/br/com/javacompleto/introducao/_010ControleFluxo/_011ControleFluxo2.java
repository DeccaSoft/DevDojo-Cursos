package br.com.javacompleto.introducao._010ControleFluxo;

public class _011ControleFluxo2 {
    public static void main(String[] args) {
        int idade = 20;
        String status;

        //O operador ternário só pode ser usado para atribuir um valor a uma variável obedecendo uma condição Booleana

        status = idade>=18 ? "Adulto" : "Menor";
        System.out.println(status);

        //Você também pode usar o operador ternário encadeado, ou seja, um dentro do outro.
        //Mas não é uma boa prática de programação, pois dificulta o entendimento e facilita o erro.
        // Por Exemplo...

        int idade2 = 15;
        String status2;

        status2 = idade < 15 ? "Ingantil" : idade2>= 15 && idade2 < 18 ? "Juvenil" : "Adulto" ;
        System.out.println(status2);

        //Você também pode usar o operador ternário dentro de um System.out.print...

        int valor = 18;

        System.out.println(valor <18 ? "Menor" : "Maior");

    }
}

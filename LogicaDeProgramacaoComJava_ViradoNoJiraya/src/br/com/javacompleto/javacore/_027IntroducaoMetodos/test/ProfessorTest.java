package br.com.javacompleto.javacore._027IntroducaoMetodos.test;

import br.com.javacompleto.javacore._027IntroducaoMetodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "123.456.789-00";
        prof.matricula = "1212";
        prof.nome = "André";
        prof.rg = "555555-5";

        System.out.println("Professor 1");
        System.out.println(prof.cpf);
        System.out.println(prof.matricula);
        System.out.println(prof.nome);
        System.out.println(prof.rg);
        System.out.println("------------");

        //Se quisermos outro professor... teríamos que copiar todo o código!!!

        Professor prof2 = new Professor();
        prof2.cpf = "000.000.000-12";
        prof2.matricula = "3434";
        prof2.nome = "Dani";
        prof2.rg = "000-00";

        System.out.println("Professor 2");
        System.out.println(prof2.cpf);
        System.out.println(prof2.matricula);
        System.out.println(prof2.nome);
        System.out.println(prof2.rg);
        System.out.println("------------");

        //Ao invés de se repetir este código quantas vezes nexcessário...
        //Foi criado um método para tal.

        System.out.println("Imprimindo pelo método imprime...");
        System.out.println("------------");

        prof.imprime(prof);
        System.out.println("Até aqui é respingo do código... ainda em prof1");
        System.out.println("------------");
        System.out.println("------------");

        //Cuidado...
        System.out.println("Nome antes da alteração... fora de prof2");
        System.out.println(prof2.nome);
        System.out.println("Dados de prof2, antes da alteração lá dentro");
        prof.imprime(prof2); //Poderia ser prof2.imprime(prof2) , pois prof apenas está referenciando o objeto prof2
        System.out.println("Nome de prof2 após a alteração... já estamos fora do objeto, aqui voltamos para o test.");
        System.out.println(prof2.nome);

        System.out.println("------------");
        System.out.println("Imprimindo pelo método imprime2 sem argumentos... utilizando o this");
        System.out.println("------------");

        prof.imprime2();
        prof2.imprime2(); //Aqui se deve utilizr o prof2.imrpime()
        System.out.println("Claro... não se esqueça que o nome está sendo alterado para João dentro do método!!!");

    }
}


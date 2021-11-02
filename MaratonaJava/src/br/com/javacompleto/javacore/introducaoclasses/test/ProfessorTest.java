package br.com.javacompleto.javacore.introducaoclasses.test;

import br.com.javacompleto.javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nome = "André";
        professor.matricula = "2323";
        professor.rg = "3434-5";
        professor.cpf = "012.345.678-90";

        System.out.println(professor.nome);
        System.out.println(professor.matricula);
        System.out.println(professor.rg);
        System.out.println(professor.cpf);

        System.out.println("-------------");

        Professor professor2 = new Professor();
        professor2.nome = "Morais";
        professor2.matricula = "4545";
        professor2.rg = "6767-8";
        professor2.cpf = "999.888.777-66";

        professor2 = professor;

        System.out.println(professor2.nome);
        System.out.println(professor2.matricula);
        System.out.println(professor2.rg);
        System.out.println(professor2.cpf);

    }
}

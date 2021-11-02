package br.com.javacompleto.javacore._027IntroducaoMetodos.test;

import br.com.javacompleto.javacore._027IntroducaoMetodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante e = new Estudante();

        e.setNome("André");
        e.setIdade(44);
        e.setNotas(new double[]{8, 7, 9.5});
        e.print();
        e.tirarMedia();
        System.out.println("Utilizando get e set");
        System.out.println(e.getNome());
        System.out.println(e.getIdade());
        System.out.println(e.getNotas()); //Aqui está mostrando a referencia na memória
        System.out.println("Aprovado? " + e.isAprovado());



    }
}

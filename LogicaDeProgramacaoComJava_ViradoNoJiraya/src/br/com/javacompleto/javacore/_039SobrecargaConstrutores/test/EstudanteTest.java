package br.com.javacompleto.javacore._039SobrecargaConstrutores.test;

import br.com.javacompleto.javacore._039SobrecargaConstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante est = new Estudante("232323", "Carlitos", new double[]{5, 7, 9}, "22/03/20");
        est.imprime();
    }
}

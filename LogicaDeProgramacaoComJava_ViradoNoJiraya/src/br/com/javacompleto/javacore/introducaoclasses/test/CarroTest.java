package br.com.javacompleto.javacore.introducaoclasses.test;

import br.com.javacompleto.javacore.introducaoclasses.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro(); //Caso não se importasse, poderia ser escrito: br.com.javacompleto.javacore.introducaoclasses.classes.Carro carro = new Carro();
        carro.modelo = "Fusca";
        carro.placa = "AMA1000";
        carro.velocidadeMaxima = 120f;

        System.out.println(carro.modelo);
        System.out.println(carro.placa);
        System.out.println(carro.velocidadeMaxima);

    }
}

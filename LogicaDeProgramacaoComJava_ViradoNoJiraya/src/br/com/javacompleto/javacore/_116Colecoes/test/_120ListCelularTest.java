package br.com.javacompleto.javacore._116Colecoes.test;

import br.com.javacompleto.javacore._116Colecoes.classes.Celular;

import java.util.ArrayList;
import java.util.List;

public class _120ListCelularTest {
    public static void main(String[] args) {
        Celular celular1 = new Celular("Galaxy S7", "123456");
        Celular celular2 = new Celular("iPhone 6S", "456789");
        Celular celular3 = new Celular("Sony Xperia", "789123");

        List<Celular> celularList = new ArrayList<>();
        celularList.add(celular1);
        celularList.add(celular2);
        celularList.add(celular3);

        for (Celular celular : celularList) {
            //System.out.println(celular.getNome());
            //ou Imprimindo pelo toString...
            System.out.println(celular);
        }

        Celular celular4 = new Celular("Galaxy S7", "123456");
        System.out.println("Celular1 == Celular4? " + (celular1 == celular4));
        System.out.println("Celular1 equals Celular4? " + celular1.equals(celular4));
        System.out.println(celularList.contains(celular4));

    }
}

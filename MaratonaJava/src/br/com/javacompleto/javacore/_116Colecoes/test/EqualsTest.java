package br.com.javacompleto.javacore._116Colecoes.test;

import br.com.javacompleto.javacore._116Colecoes.classes.Celular;

public class EqualsTest {
    public static void main(String[] args) {
        System.out.println("BRINCANDO COM O == E COM O EQUALS");
        String nome1 = "Andre Morais";
        String nome2 = "Andre Morais";
        String nome3 = new String("Andre Morais");
        String nome4 = new String("Andre Morais");
        System.out.println("nome1==nome2? " + (nome1 == nome2));
        System.out.println("nome2==nome3? " + (nome2 == nome3));
        System.out.println("nome2==nome4? " + (nome2 == nome4));
        System.out.println("nome3==nome4? " + (nome3 == nome4));
        Integer int1 = 5;
        Integer int2 = 5;
        Integer int3 = new Integer(5);
        Integer int4 = new Integer(5);
        System.out.println("int1==int2? " + (int1 == int2));
        System.out.println("int2==int3? " + (int2 == int3));
        System.out.println("int2==int4? " + (int2 == int4));
        System.out.println("int3==int4? " + (int3 == int4));
        System.out.println("nome1 equals nome2? " + nome1.equals(nome2));
        System.out.println("nome2 equals nome3? " + nome2.equals(nome3));
        System.out.println("nome2 equals nome4? " + nome2.equals(nome4));
        System.out.println("nome3 equals nome4? " + nome3.equals(nome4));
        System.out.println("int1 equals int2? " + int1.equals(int2));
        System.out.println("int2 equals int3? " + int2.equals(int3));
        System.out.println("int2 equals int4? " + int2.equals(int4));
        System.out.println("int3 equals int4? " + int3.equals(int4));

        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        Celular c1  = new Celular("ihpone", "1234");
        Celular c2  = new Celular("ihpone", "1234");
        System.out.println("c1 equals c2? " + c1.equals(c2));
        System.out.println("Simetria...");
        System.out.println("c2 equals c1? " + c2.equals(c1));

    }
}

package br.com.javacompleto.javacore._062Interfaces.classes;

public interface Tributavel {
    //Todos os atributos em uma Interface são considerados Constantes
    //Portanto não se usa tais modificadores por se tornar Redundante.

    public static final double IMPOSTO = 0.2; //Mesmo que: double IMPOSTO = 0.2;

    //Todos os métodos de uma Interface já são considerados public e abstract
    //Portanto não se usa tais modificadores por se tornar Redundante.

    public abstract void calculaImposto(); //Mesmo que: void calcularImposto();

}

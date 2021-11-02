package br.com.javacompleto.javacore._062Interfaces.test;

import br.com.javacompleto.javacore._062Interfaces.classes.Produto;

public class TestProduto {
    public static void main(String[] args) {
        Produto p = new Produto("NoteBook", 4, 3000);
        p.calculaImposto();
        p.calculaFrete();
        System.out.println(p);

        //ATENÇÃO: Interfaces não podem ser Instaciadas
        //Pode-se até criar uma variável de Referência como por exemplo:
        //Tributavel t;
        //Mas não se pode instanciar como por exemplo:
        //Tributavel t = new Tributavel();
    }
}

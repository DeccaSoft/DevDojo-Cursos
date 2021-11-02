package br.com.javacompleto.javacore._064Polimorfismo.Test;

import br.com.javacompleto.javacore._064Polimorfismo.classes.Gerente;
import br.com.javacompleto.javacore._064Polimorfismo.classes.RelatorioPagamento;
import br.com.javacompleto.javacore._064Polimorfismo.classes.Vendedor;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Osvaldo", 5000, 2000);
        Vendedor v = new Vendedor("Yure", 2000, 20000);
        RelatorioPagamento relatorio = new RelatorioPagamento();
//        relatorio.relatorioPagamentoGerente(g);
//        System.out.println("----------------------------------------------");
//        relatorio.relatorioPagamentoVendedor(v);
        System.out.println("##############################################");
        //Widening Cast
//        Funcionario f = g;
//        System.out.println(f.getSalario());
        System.out.println("##############################################");
        //Relatório Genérico -> Widening Cast
        System.out.println("----------------------------------------------");
        relatorio.relatorioPagamentoGenerico(g);
        System.out.println("----------------------------------------------");
        relatorio.relatorioPagamentoGenerico(v);


    }
}

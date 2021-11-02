package br.com.javacompleto.javacore._041BlocoDeInicializacao.test;

import br.com.javacompleto.javacore._041BlocoDeInicializacao.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        System.out.println("Criando o Objeto c do tipo Cliente...");
        Cliente c = new Cliente();
        System.out.println("De volta ao (test)");
        System.out.println("Quantidade de parcelas possíveis: ");
        for (int parcela : c.getParcelas()){
            System.out.print(parcela + " ");
        }
    }
}

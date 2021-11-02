package br.com.javacompleto.javacore._042ModificadorEstático.test;


import br.com.javacompleto.javacore._042ModificadorEstático.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        System.out.println("Criando o Objeto c do tipo Cliente...");
        Cliente c = new Cliente();
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        System.out.println("De volta ao (test)");
        System.out.println("Quantidade de parcelas possíveis: ");
//        for (int parcela : c.getParcelas()){
//            System.out.print(parcela + " ");
//        }
        System.out.println("Tamanho: " + Cliente.getParcelas().length);

    }
}

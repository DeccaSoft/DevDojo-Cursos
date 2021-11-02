package br.com.javacompleto.javacore._057Enum.test;

import br.com.javacompleto.javacore._057Enum.classes.Cliente;
import br.com.javacompleto.javacore._057Enum.classes.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Lav-Já", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.A_PRAZO);
        //Note a diferença entre as duas chamadas de Enums... A primeira chama a Classe Enum e o Atributo,
        //enquanto a segunda forma chama a Classe, o Enum e depois o Atributo(Enum).
        //Ainda vou estudar, mas TipoPagamento é como se fosse uma Classe Estática Interna.
        //Enumerações NÃO podem ser ciradas dentro de métodos

        System.out.println("ID: " + TipoCliente.PESSOA_JURIDICA.getId());
        System.out.println(cliente);
    }


}

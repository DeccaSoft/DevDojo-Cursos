package br.com.javacompleto.introducao;

public class _005ImprimindoVariaveis {
    public static void main(String[] args){
        // Comentário de uma linha
        /*
        Comentários
        de várias
        linhas
         */
        /**
         * Comentários do JAVA DOCs = Documentação
         * @author André Morais de Azevedo
         */
        int idadeInt = 44;
        double salarioDouble = 3000;
        float salarioFloat = 3000;
        byte idadeByte = 12;
        short idadeShort = 32767;
        boolean verdadeiro = true;
        boolean falso = false;
        long numeroGrande = 1000L;
        char caractere = 'Z'; // 2 Bytes
        char caractere2 = 95; // ASCII
        char caractere3 = '\u0041'; // Hexadecimal (UNICODE)
        char sexo = 'M';
        String estadoCivil = "Casado";
        String nome = "André Morais de Azevedo";
        String endereco = "Rua Tianguá, 13 - Apto. 106 - Parreão";
        String telefone = "9.8726-1778";

        System.out.println("Dados Impressos");
        System.out.println("Idade da Criança: " + idadeInt);
        System.out.println(caractere);
        System.out.println(caractere2);
        System.out.println(caractere3);
        System.out.println("O cliente " + nome + " domiciliado no endereço " + endereco + " e com telefone " + telefone + " está OK!!!");
        System.out.println("O cliente " + nome + " do Sexo " + sexo + " e com salário de " + salarioFloat + " é " + estadoCivil + " e tem " + idadeInt +  " anos de idade.");
    }
}

package br.com.javacompleto.javacore._089ExpressoesRegulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _89ExpressoesRegulares_RegEx {
    public static void main(String[] args) {
        String regex ="aba"; //Esse será nosso Padrão
        String texto = "abababa"; //Pesquisa SEMPRE da Esquerda para a Direita
        // e Desoncidera o que já encontrou, ou seja, pesquisa no próximo
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 0123456789...");
        System.out.println("Expressão: " + matcher.pattern());
        System.out.println("Posições Encontradas: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }
    }
}

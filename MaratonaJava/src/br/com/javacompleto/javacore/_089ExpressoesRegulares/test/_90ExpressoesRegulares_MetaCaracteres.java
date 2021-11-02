package br.com.javacompleto.javacore._089ExpressoesRegulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _90ExpressoesRegulares_MetaCaracteres {
    public static void main(String[] args) {

        //METACARACTERES:
        // \d - Todos os Dígitos
        // \D - Tudo o que não for Dígito
        // \s - Espaços em Branco e \t \n \f \r
        // \S - Caractere que não é Espaço em Branco
        // \w - Caracteres de Palavras (a..z, A..Z, Dígitos e _ )
        // \W - Tudo o que não for Caractere de Palavra

        //Lembre-se: precisa-se utilizar um caractere de Escape para se utilizar a conta-barra "\"
        //E esse caractere de escape é a contra-barra "\", por isso ficou "\\s".

        //String regex ="\\s"; //Padrão de Pesquisa
        //String texto = "a @AoxD32 0x13 34_d0X c#as_sad34 0XFFab 234 OXFBC cs\t\n\f\r_0x12";

        // [] - Restringe o que se deseja encontrar
                //Exemplo: [abc] = a, b ou c
        //Exemplo: [a-cA-C] = a até c ou Até C

        //Quantificadores: Define se a procura deve ser feita por uma o mais ocorrências
        // ? - Zero ou Uma Ocorrência
        // * - Zero ou Mais Ocorrências
        // + - Uma ou Mais Ocorrências
        // {n,m} - n até m Ocorrências
        // () - Agrupador de Opções
        // | -  OU
        // $ - Fim de Linha
        //Exemplo: o(v|c)o = ovo ou oco
                // maca(rr|c)ao = macarrao ou macacao
        // . - Coringa (Pode ser substituído por qualquer coisa)
            //Exemplo: 1.3 = 123, 1A3, 1 3, 113, 133, 1#3, ...
        // ^ - Negação ... Exemplo: [^abc] = tudo menos abc

        //Formato Hexadecimal: Começa por zero, seguido de x ou X e vai até F Ex: 0x100F
        //String regex ="0[xX]([0-9a-fA-F])+";
        //String texto = "a @AoxD32 0x13 34_d0X c#as_sad34 0XFFab 234 OXFBC cs\t\n\f\r_0x12";

        //String regex ="([a-zA-z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        // ou String regex ="([\\w9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        //String texto = "fulano@gmail.com, abc@abc.com, teste@email.com.br, cde#!aba@bol.com.br, teste@mail";
        //System.out.println("E-Mail Válido? " + "cde#!aba@bol.com.br".matches(regex));

        //String regex ="\\d{2}/\\d{2}/\\d{2,4}";
        //String texto = "05/10/2010 05/5/2015 1/1/01 01/05/95";

        String regex ="proj([^,])*";
        String texto = "proj1.bkp, proj1.java, proj1.class, proj1final.java, proj2.bkp, proj3.java, diagrama, texto.txt, fotos.jpg";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 01234567890123456789012345678901234567890123456789");
        System.out.println("Expressão: " + matcher.pattern());
        System.out.println("Posições Encontradas: ");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}

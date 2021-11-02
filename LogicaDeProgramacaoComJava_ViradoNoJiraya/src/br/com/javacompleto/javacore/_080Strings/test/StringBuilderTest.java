package br.com.javacompleto.javacore._080Strings.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        String s = "Uma frase comum";
        StringBuilder sb = new StringBuilder(10);//Capacidade 10 Caracteres
        StringBuilder sb2 = new StringBuilder();//Capacidade Padrão de 16 Caracteres
        //Atenção: Não estamos mais trabaçlhando com Strings comuns...
        //Por exemplo: não se pode mais usar string1 += satring2; ou .concat
        sb.append("Uma Frase Comum");           //Reaproveitando o objeto
        sb.append(" Aumanteda com mais letras");//Sem criar vários objetos em memória
        System.out.println(sb); //Aqui (para imprimir) ele chama o método toString automaticamente!
        System.out.println(sb.reverse());
        sb2.append("0123456789");
        System.out.println(sb2.delete(3,6));//Inicio e (fim-1)
        System.out.println(sb2.insert(3,"345"));
    }
}

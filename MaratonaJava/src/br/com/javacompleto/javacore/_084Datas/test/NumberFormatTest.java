package br.com.javacompleto.javacore._084Datas.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        float valor = 123.4567f;
        Locale locJp = new Locale("jp");
        //NumberFormat é uma Classe Abstrata, ou seja, não se pode instanciar
        NumberFormat[] nfa = new NumberFormat[4]; //Não instanciei... Criei um Array
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(locJp);
        nfa[2] = NumberFormat.getCurrencyInstance();
        nfa[3] = NumberFormat.getCurrencyInstance(locJp);
        for(NumberFormat nf : nfa){
            System.out.println(nf.format(valor));
        }

        //elembrando Vetores e foreach
        int[] vetor=new int[3];
        vetor[0]=2;
        vetor[1]=1;
        vetor[2]=0;
        for (int i=0; i<vetor.length; i++){
            System.out.println(vetor[i]);
        }
        //Mesma coisa com o foreach
        for (int v : vetor) {
            System.out.println(v);
        }
        //Retornando
        float valor2 = 9876.54321f;
        Locale locFra = new Locale("fr");
        NumberFormat[] nfa2 = new NumberFormat[4];
        nfa2[0] = NumberFormat.getInstance();
        nfa2[1] = NumberFormat.getInstance(locFra);
        nfa2[2] = NumberFormat.getCurrencyInstance();
        nfa2[3] = NumberFormat.getCurrencyInstance(locFra);
        for (NumberFormat nf2: nfa2) {
            System.out.println(nf2.format(valor2));
        }
        //Mais Formatações...
        NumberFormat nf = NumberFormat.getInstance();
        System.out.println(nf.getMaximumFractionDigits());
        //Exibe o número máximo de dígitos no formato, por isso vinha mostrando,
        //no máximo, até 3 dígitos decimais
        nf.setMaximumFractionDigits(9); //Declarei máximo de 9 dígitos
        System.out.println(nf.format(valor2));
        String valorString = "123,4567";
        try {
            nf.setParseIntegerOnly(true);//Essa linha faz desconsiderar valores decimais
            System.out.println(nf.parse(valorString)); //O método parse lança exceção
        } catch (ParseException e) {
            e.printStackTrace();
        }



    }
}

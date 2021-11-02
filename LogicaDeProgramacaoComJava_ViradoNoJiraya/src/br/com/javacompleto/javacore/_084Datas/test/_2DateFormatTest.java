package br.com.javacompleto.javacore._084Datas.test;

import java.text.DateFormat;
import java.util.Calendar;

public class _2DateFormatTest {
    public static void main(String[] args) {
        //DateFormat possui, basicamente, 6 formas de formatar Datas
        Calendar c = Calendar.getInstance();
        //Criando um Array de DateFormat
        DateFormat[] dfa = new DateFormat[6];
        //DateFormat também é uma Classe Abstrata
        dfa[0] = DateFormat.getInstance();
        dfa[1] = DateFormat.getDateInstance();
        dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);
        dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
        dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);
        for(DateFormat df : dfa){ //foreach
            System.out.println(df.format(c.getTime()));
        }

    }
}

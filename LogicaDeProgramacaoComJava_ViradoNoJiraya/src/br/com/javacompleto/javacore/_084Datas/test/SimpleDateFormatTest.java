package br.com.javacompleto.javacore._084Datas.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        String mascara = "yyyy.MM.dd G 'às' HH:mm:ss z";
        String mascara2 = "z HH:mm:ss 'de' dd.MM.yyy G";
        //Essas formatações encontram-se na Documentação
        //O que estiver entre aspas simples ('), como 'às', será considerado como texto
        SimpleDateFormat formatador = new SimpleDateFormat(mascara); //Retorna uma String
        System.out.println(formatador.format(c.getTime()));
        SimpleDateFormat formatador2 = new SimpleDateFormat(mascara2);
        System.out.println(formatador2.format(c.getTime()));

    }
}

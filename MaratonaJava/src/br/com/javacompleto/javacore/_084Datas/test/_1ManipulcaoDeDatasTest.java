package br.com.javacompleto.javacore._084Datas.test;

import java.util.Calendar;
import java.util.Date;

public class _1ManipulcaoDeDatasTest {
    public static void main(String[] args) {
        System.out.println("=== Trabalhando com a Classe Date ===");
        //Praticamente não se usa mais a Classe Date!!!
        Date dataQualquer = new Date(1_000_000_000_000L); //Data armazenada em Milisegundos (Pode separar milhares com _)
        System.out.println(dataQualquer); //Em um sout não precisa usar o .toString, pois isso é automático
        Date dataAtual = new Date();
        System.out.println(dataAtual);
        System.out.println("Data atual em milisegundos: " + dataAtual.getTime());
        //A Classe Date não faciliatava muito o trabalho com datas
        //Por isso se encontra ultrapassada com a maioria de seus métodos depreciados.
        System.out.println(" ");

        System.out.println("=== Trabalhando com a Classe Calendar ===");
        //Claendar é muito mais Completa e mais Simples de trabalhar
        //É uma Classe Abstrata... Portanto NÃO se pode fazer: Calendar c = new Calendar();
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        //Além de poder trabalhar em conjunto com a Classe Date,
        // ou seja, possui suporte para código legado
        c.setTime(dataQualquer);
        System.out.println(c);
        Calendar c2 = Calendar.getInstance();
        if (Calendar.SUNDAY ==c2.getFirstDayOfWeek()){
            System.out.println("Domingo é o primeiro dia da Semana");
        }
        System.out.println(c2.get(Calendar.DAY_OF_WEEK));
        System.out.println(c2.get(Calendar.DAY_OF_MONTH));
        System.out.println(c2.get(Calendar.DAY_OF_YEAR));

        //O getTime do Calendar retorna um Date
        // e coma ainda não aprendemos a formatar datas, podemos fazer assim
        Date data = c2.getTime();
        System.out.println(data);
        System.out.println("Adicionando duas Horas");
        c2.add(Calendar.HOUR, 2);
        System.out.println(c2.getTime());
        //o .add, caso adicione qualquer coisa e vire um dia ou mês, por exemplo,
        // ele fará automaticamente... veja
        c2.add(Calendar.MONTH, 12);
        System.out.println("Adicionando 12 meses ele virou o ano automaticamente");
        System.out.println(c2.getTime());
        //Caso não queira essa alteração automática, utilize o .roll
        c2.roll(Calendar.MONTH, 12);
        System.out.println("Adicionando 12 meses e NÃO virou o ano automaticamente");
        System.out.println(c2.getTime());


    }
}

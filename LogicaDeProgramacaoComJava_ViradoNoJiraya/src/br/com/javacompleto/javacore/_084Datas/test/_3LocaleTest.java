package br.com.javacompleto.javacore._084Datas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class _3LocaleTest {
    public static void main(String[] args) {
        //Construtor: argumentos lingua ou língua e país
        //Padrão ISO 639
        Locale local = new Locale("it");
        System.out.println(local); //Instanciei um Local
        Locale local2 = new Locale("pt", "BR");
        System.out.println(local2); //Instanciei um Local
        Calendar c = Calendar.getInstance();
        System.out.println(c); //Instanciei um Calendario (Data) com o momento atual
        c.set(2015, Calendar.DECEMBER, 23);
        System.out.println(c); //Setei uma data para este calendario
        //Poderia ser 11 no lugar de Calendar.DECEMBER, pois os meses começam em 0 até 11!
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, local); //Instanciei um formato (atrelando a local)
        System.out.println("Italiano: " + df.format(c.getTime())); //Formatei o Calendario (que estava atrelado ao local)
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, local2); //Criei novo formato (atrelado a local2)
        System.out.println("Brasil: " + df2.format(c.getTime())); //Formatei o Calendario
        //Brincando um pouco mais...
        Locale locItalia = new Locale("it", "IT");
        DateFormat dfIt = DateFormat.getDateInstance(DateFormat.FULL, locItalia);
        System.out.println("Itália: " + dfIt.format(c.getTime()));
        Locale locSuica = new Locale("it", "CH");
        DateFormat dfSc = DateFormat.getDateInstance(DateFormat.FULL, locSuica);
        System.out.println("Suiça: " + dfSc.format(c.getTime()));
        Locale locIndia = new Locale("hi", "IN");
        DateFormat dfId = DateFormat.getDateInstance(DateFormat.FULL, locIndia);
        System.out.println("Índia: " + dfId.format(c.getTime()));
        Locale locJapao = new Locale("ja");//Só existe um local que fala Japonês
        DateFormat dfJp = DateFormat.getDateInstance(DateFormat.FULL, locJapao);
        System.out.println("Japonês (Japão): " + dfJp.format(c.getTime()));
        Locale locEUA = new Locale("en", "US");
        DateFormat dfUS = DateFormat.getDateInstance(DateFormat.FULL, locEUA);
        System.out.println("EUA: " + dfUS.format(c.getTime()));
        Locale locPortugal = new Locale("pt", "PT");
        DateFormat dfPt = DateFormat.getDateInstance(DateFormat.FULL, locPortugal);
        System.out.println("Portugal: " + dfPt.format(c.getTime()));
        //Alguns Métodos Úteis
        System.out.println(locJapao.getDisplayLanguage()); //Mostra a Lingua
        System.out.println(locJapao.getDisplayLanguage(locJapao) + " - Japonês em japonês");
        //Localização como Argumento = Lingua falada na própria língua
        System.out.println(locJapao.getDisplayLanguage(locEUA) + " - Japonês em inglês");
        System.out.println(locIndia.getDisplayCountry());
        System.out.println(locIndia.getDisplayCountry(locJapao));

    }
}

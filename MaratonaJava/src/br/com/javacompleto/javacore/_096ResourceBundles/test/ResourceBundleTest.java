package br.com.javacompleto.javacore._096ResourceBundles.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        //Aqui foi só ensinando como pegar o Idioma do Sistema
        ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(rb.getString("ola"));
        System.out.println(rb.getString("bom.dia"));
        System.out.println(rb.getString("show"));
        rb = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(rb.getString("ola"));
        System.out.println(rb.getString("bom.dia"));
        System.out.println(rb.getString("show"));

        //Ordem de procura dos Resources Bundles:

        //Imagine a situação seguinte:
        //Locale lacale = new Locale("fr", "CA");
        //ResourceBundle.getBundle("messages", locale);

        //O Java seguirá a ordem a seguir:
        //messages_fr_CA.properties
        //messages_fr.properties
        //messages_pt_BR.properties (Localização Padrão do Sistema)
        //messages_pt.properties
        //messages.properties
        //Lança uma Exceção (MissingResourceException)
    }
}

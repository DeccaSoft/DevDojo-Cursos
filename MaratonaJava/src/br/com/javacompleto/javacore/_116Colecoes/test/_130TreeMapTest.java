package br.com.javacompleto.javacore._116Colecoes.test;

import br.com.javacompleto.javacore._116Colecoes.classes.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class _130TreeMapTest {
    public static void main(String[] args) {
        //Trabalhando Orientado à Interface (NavigableMap)
        NavigableMap<String, String> map = new TreeMap<>();

        //NavigableMap<String, Consumidor> map = new TreeMap<>();

//        Consumidor consumidor = new Consumidor("André", "123");
//        Consumidor consumidor2 = new Consumidor("DeccaSoft", "321");

//        map.put("D", consumidor);
//        map.put("A", consumidor2);
        map.put("B", "Letra B");
        map.put("C", "Letra C");
        map.put("D", "Letra D");
        map.put("A", "Letra A");

        //LEMBRE-SE: A única Classe que deve implementar a Interface Comparable
        // é a Classe que vai na Chave, caso contrário,
        //vc terá um erro em tempo de Execução (ClassCastException)
        //for(Map.Entry<String, Consumidor> entry : map.entrySet()){

        for(Map.Entry<String, String> entry : map.entrySet()){
        System.out.println(entry.getKey() + " - " + entry.getValue());
        //Será organizado, pois a Classe String (na Chave) implementa a Interface Comparable
        }
        System.out.println(map.headMap("C", true));
        //Retorna um map com as Chaves menores... true inclui a chave passada no paraâmetro
        System.out.println(map.descendingMap()); //Existem vários métodos interessantes
    }
}

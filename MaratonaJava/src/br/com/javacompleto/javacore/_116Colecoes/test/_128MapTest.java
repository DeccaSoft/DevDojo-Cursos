package br.com.javacompleto.javacore._116Colecoes.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class _128MapTest {
    public static void main(String[] args) {
        //Mapas trabalham com Chave-Valor
        // NÃO podem existir chaves duplicadas

        //Map<String, String> map = new HashMap<>(); //NÃO garante a ordem de inserção
        Map<String, String> map = new LinkedHashMap<>(); //Mantem a ordem de inserção
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você"); //NÃO permite valores duplicados, assume a próxima chave
        map.put("vc", "voce2");
        map.put("vc2", "voce2");
        map.put("meza", "mesa");

        //Iterando sobre as Chaves
        for(String key : map.keySet()){ //keySet pois não se pode ter elementos repetidos
            System.out.println(key);
        }
        System.out.println("-------------");
        //Iterando sobre os Valores
        for(String value : map.values()){
            System.out.println(value);
        }
        System.out.println("-------------");
        //Iterando sobre os dois valores:
        //Para isto utiliza-se a Interface Map.Entry
        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

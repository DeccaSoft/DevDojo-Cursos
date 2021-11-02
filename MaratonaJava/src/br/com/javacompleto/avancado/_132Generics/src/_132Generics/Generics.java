package _132Generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

	public static void main(String[] args) {
		
		//Type Erasure
		
		List<String> lista = new ArrayList<>();
		lista.add("String1");
		lista.add("String2");
		lista.add("String3");
		
		for(String item: lista) {
			System.out.println(item);
		}

	}

}

package _132Generics;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenerico {

	public static void main(String[] args) {
		criarArray(new Cachorro());
		System.out.println("----");
		List<Cachorro> cachorroList = criarArrayComRetorno(new Cachorro());
		System.out.println(cachorroList);
	}

	public static <T> void criarArray(T t) { //Poderia ser <T extends Animal>
		List<T> lista = new ArrayList<>();
		lista.add(t);
		System.out.println(lista);
	}
	
	public static <T> List<T> criarArrayComRetorno(T t) {
		List<T> lista = new ArrayList<>();
		lista.add(t);
		return lista;
	}
}

package _132Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Animal {
	public abstract void consultar();
}

class Cachorro extends Animal implements Comparable{
	@Override
	public void consultar() {
		System.out.println("Consultando Cachorro");	
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

class Gato extends Animal{
	@Override
	public void consultar() {
		System.out.println("Consultando Gato");
	}
}

public class Generics_WildCard {
	
	public static void main(String[] args) {
		Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
		Gato[] gatos = {new Gato(), new Gato()};
		consultarAnimais(cachorros);
		consultarAnimais(gatos);
		Animal[] animais = {new Cachorro(), new Gato()};
		consultarAnimais(animais);
		System.out.println("=========================");
		List<Cachorro> cachorroList = new ArrayList<>();
		cachorroList.add(new Cachorro());
		List<Gato> gatoList = new ArrayList<>();
		gatoList.add(new Gato());
		//consutarAnimaisList(cachorroList); => Isso gera um erro em tempo de Compilação,
		// pois precisa-se ser exatamente do tipo especificado lá no método,
		// porém lá no método se pode adicionar Sub-Classes de Animal, o que não podia com os Arrays
		
		/*
		List<Animal> animalList = new ArrayList<>();
		consutarAnimaisList(animalList);
		*/
		
		//Utilizando Coringa...
		consutarAnimaisList(cachorroList);
		consutarAnimaisList(gatoList);
		System.out.println("-------------");
		ordenarLista(cachorroList); //Não dá erro pois Cachorro implementa Comprable
		//ordenarLista(gatoList); => Aqui dá erro, pois Gato não implementa Comparable
	}
	
	public static void consultarAnimais(Animal[] animals) {
		for(Animal animal : animals) {
			animal.consultar();
		}
		//animals[1] = new Gato(); // => Isso gera um erro em tempo de Execução
		
	}
	
	//Type Erasure
	
	//Utilizando o Coringa (?)...
	
	public static void consutarAnimaisList(List<? extends Animal> animals) {
		for(Animal animal : animals) {
			animal.consultar();
		}
		//Aqui se pode adicionar... quando não se está usando o Coringa (?)
		//Caso queira utilizar o coringa, NÃO se pode adicionar nada!!!
		/*
		animals.add(new Cachorro());
		animals.add(new Gato());
		Animal a = new Gato(); //Identico à linha de cima
		System.out.println("Animais"+ animals);
		*/
		
	}
	
	//Caso se queira Adicionar algo...
	public static void consultarCachorrosList(List<? super Cachorro> cachorroList) {
		Cachorro c = new Cachorro();
		Animal a = new Cachorro();
		Object o = new Cachorro();
		cachorroList.add(new Cachorro());
		//cachorroList.add(new Animal()); => Aqui ocorre Erro pois Gato também é Animal
		// e na assinatura do método vc especificou que seria um Cachorro ou super Classe
	}
	
	//Trabalhando com Interfaces... NÃO se utiliza implements, mas, sim, extends!!!
	public static void ordenarLista(List<? extends Comparable> lista) {
		Collections.sort(lista);
	}
}

package _132Generics;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenerica {

	public static void main(String[] args) {
		List<Carro> carrosDisponiveis = new ArrayList<>();
		carrosDisponiveis.add(new Carro("Gol"));
		carrosDisponiveis.add(new Carro("BMW"));
		ObjetoAlugavel<Carro> carroAlugavel = new ObjetoAlugavel<>(carrosDisponiveis);
		Carro carro = carroAlugavel.getObjetoDisponivel();
		System.out.println("Utiliando o Objeto Alugado " + carro);
		carroAlugavel.devolverObjeto(carro);
		
		//Agora, se vc tiver outras classes, pode-se criar uma lista desses objetos e alugar da mesma forma.
	}
}

class ObjetoAlugavel<T>{ // T = Type || em Coleções usa-se E = Element
	private List<T> objetosDisponiveis = new ArrayList<>();
	
	public ObjetoAlugavel(List<T> objetosDisponiveis) {
		this.objetosDisponiveis = objetosDisponiveis;
	}

	public T getObjetoDisponivel() {
		System.out.println("Objeto Disponíveis: " + objetosDisponiveis);
		T t = objetosDisponiveis.remove(0);
		System.out.println("Alugando... " + t);
		return t;
	}
	
	public void devolverObjeto(T t) {
		System.out.println("Devolvendo... " + t);
		objetosDisponiveis.add(t);
		System.out.println("Objeto Disponíveis: " + objetosDisponiveis);
	}
}

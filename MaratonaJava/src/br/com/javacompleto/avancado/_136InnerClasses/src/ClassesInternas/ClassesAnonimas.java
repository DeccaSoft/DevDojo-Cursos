package ClassesInternas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Animal{
	public void andar() {
		System.out.println("Animal Andando...");
	}
}
public class ClassesAnonimas {

	public static void main(String[] args) {
		
		Animal a = new Animal() {
			public void andar() {
				System.out.println("Andando Anonimamente...");
			}
		};
		a.andar();
		
		//Trouxe a Classe Carro do Pacote _132Generics para exemplificar o uso com a Interface Comparable
		List<Carro> carroList = new ArrayList<>();
		carroList.add(new Carro("BMW"));
		carroList.add(new Carro("Audi"));
		
		//Nesse caso criamos uma classe (CarroComparator) s? para utilizar-mos aqui abaixo uma vez...
		Collections.sort(carroList, new CarroComparator());
		System.out.println(carroList);
		
		//Poder?amos fazer diferente... poder?amos fazer assim:
		Collections.sort(carroList, new Comparator<Carro>(){
			@Override
			public int compare(Carro o1, Carro o2) {
				return o1.getNome().compareTo(o2.getNome());
			}
		});
		System.out.println(carroList);
	}
}

class CarroComparator implements Comparator<Carro>{

	@Override
	public int compare(Carro o1, Carro o2) {
		return o1.getNome().compareTo(o2.getNome());
	}
	
}
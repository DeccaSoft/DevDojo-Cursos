package _132Generics;

import java.util.ArrayList;
import java.util.List;

public class ClasseNaoGenerica {

	public static void main(String[] args) {
		CarroAlugavel carro = new CarroAlugavel();
		Carro carroAlugado = carro.getCarroDisponivel();
		System.out.println("Utilizando o Carro..." + carroAlugado);
		carro.devolverCarro(carroAlugado);
		
		//E se precis�ssemos alugar Motos, Barcos, Bicicletas ou outros objetos???
		//Ter�amos que repetir c�digo criando novas classes!!!
		//Por esse motivo criou-se as Classes Generics
		//Mas isso � o assunto da pr�xima aula...
	}
}

class CarroAlugavel{
	private List<Carro> carrosDisponiveis = new ArrayList<>();

	{
		carrosDisponiveis.add(new Carro("Gol"));
		carrosDisponiveis.add(new Carro("BMW"));
	}
	
	public Carro getCarroDisponivel() {
		System.out.println("Carros Dispon�veis: " + carrosDisponiveis);
		Carro c = carrosDisponiveis.remove(0);
		System.out.println("Alugando... " + c);
		return c;
	}
	
	public void devolverCarro(Carro c) {
		System.out.println("Devolvendo... " + c);
		carrosDisponiveis.add(c);
		System.out.println("Carros Dispon�veis: " + carrosDisponiveis);
	}
}
package ClassesInternas;

public class ClassesLocais {

	private String nome = "Andr�";
	
	public void fazAlgumaCoisa() {
		final String sobrenome = "Morais";	//a partir do Java 8, n�o precisa mais declarar com final,
											//por�m, n�o se pode alterar o valor dela,
											//ou seja, � implicitamente/efetivamente considerada como final!
		class Interna{
			public void imprimeNomeExterno() {
				System.out.println(nome);
				System.out.println(sobrenome);
			}
		}
		
		//Neste caso tem-se que criar um objeto da classe aqui, caso contr�rio n�o ter� acesso a este m�todo!
		Interna in = new Interna();
		in.imprimeNomeExterno();
	}
	
	public static void main(String[] args) {
		
		ClassesLocais externa = new ClassesLocais();
		externa.fazAlgumaCoisa();

	}

}

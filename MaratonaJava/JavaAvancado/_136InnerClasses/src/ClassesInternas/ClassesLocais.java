package ClassesInternas;

public class ClassesLocais {

	private String nome = "André";
	
	public void fazAlgumaCoisa() {
		final String sobrenome = "Morais";	//a partir do Java 8, não precisa mais declarar com final,
											//porém, não se pode alterar o valor dela,
											//ou seja, é implicitamente/efetivamente considerada como final!
		class Interna{
			public void imprimeNomeExterno() {
				System.out.println(nome);
				System.out.println(sobrenome);
			}
		}
		
		//Neste caso tem-se que criar um objeto da classe aqui, caso contrário não terá acesso a este método!
		Interna in = new Interna();
		in.imprimeNomeExterno();
	}
	
	public static void main(String[] args) {
		
		ClassesLocais externa = new ClassesLocais();
		externa.fazAlgumaCoisa();

	}

}

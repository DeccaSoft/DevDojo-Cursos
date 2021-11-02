package ClassesInternas;

class Externa{
	private String nomeExterno = "Nome Externo"; 			//N�o � Vis�vel dentro da Classe Interna, pois ela � est�tica
	private static String nomeExternoEstatico = "Nome Externo Est�tico";
	static class Interna{
		public void imprimir() {
			System.out.println("Dentro da Classe Externa.Interna");
			System.out.println(nomeExternoEstatico);		//S� � visualizado por ser um atributo est�tico
		}
	}
}

public class ClassesEstaticas {

	public static void main(String[] args) {
		
		Externa.Interna teste = new Externa.Interna();
		teste.imprimir();
		
		Interna2 teste2 = new Interna2();
		teste2.imprimir();
	}
	
	static class Interna2{
		public void imprimir() {
			System.out.println("Dentro da Classe ClassesEstaticas.Interna2");
		}
	}
}

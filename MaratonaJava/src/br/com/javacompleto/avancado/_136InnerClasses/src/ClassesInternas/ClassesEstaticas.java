package ClassesInternas;

class Externa{
	private String nomeExterno = "Nome Externo"; 			//Não é Visével dentro da Classe Interna, pois ela é estática
	private static String nomeExternoEstatico = "Nome Externo Estático";
	static class Interna{
		public void imprimir() {
			System.out.println("Dentro da Classe Externa.Interna");
			System.out.println(nomeExternoEstatico);		//Só é visualizado por ser um atributo estático
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

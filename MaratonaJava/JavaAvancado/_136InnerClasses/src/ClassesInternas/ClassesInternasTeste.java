package ClassesInternas;

public class ClassesInternasTeste {
	
	private String nome = "Andre Morais";
	
	class InternaOuAninhada{
		public void verClasseExterna() {
			System.out.println(nome);	//Classes internas teem acesso aos atributos(inclusive privados) das OuterClasses
			System.out.println(this);
			System.out.println(ClassesInternasTeste.this);
		}
	}

	public static void main(String[] args) {
		
		//Para se Instanciar uma Classe Interna precisa-se primeiro instanciar a Classe Externa
		//Existem 3 formas de se instanciar uma InnerClass
		
		//Primeira Forma:
		ClassesInternasTeste externa = new ClassesInternasTeste();
		ClassesInternasTeste.InternaOuAninhada in = externa.new InternaOuAninhada();
		in.verClasseExterna();
		
		//Segunda Forma:
		ClassesInternasTeste.InternaOuAninhada in2 = new ClassesInternasTeste().new InternaOuAninhada();
		in2.verClasseExterna();
		
	}

}

//class Externa{
//	
//	private String nome = "Andre Morais";
//	
//	class InternaOuAninhada{
//		public void verClasseExterna() {
//			System.out.println(nome);	//Classes internas teem acesso aos atributos(inclusive privados) das OuterClasses
//		}
//	}
//	
//}
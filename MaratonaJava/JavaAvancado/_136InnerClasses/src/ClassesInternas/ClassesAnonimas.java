package ClassesInternas;

import java.util.ArrayList;
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
	}

}

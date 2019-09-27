//Animal
package Animais;



public class Animal {
	
	public void locomover() {
		System.out.println("O animal se locomoveu");
	}
	public void Fugir(int instancia) {
		
		for(int i = 0; i < instancia; i++ ) {
			locomover();
			
		}
	}
	

}

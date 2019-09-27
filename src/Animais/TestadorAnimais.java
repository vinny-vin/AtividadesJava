//TestadorAnamais
package Animais;

public class TestadorAnimais {
	
	public static void main (String [] args) {
		
		TestadorAnimais testador;
		
		testador = new TestadorAnimais();
		//testador.testeinicial();
		testador.testeDuasInstancias();
		
		
		
	}
	
	
	public void testeDuasInstancias() {
		
		CACHORRO  primeiro, segundo;
		
		primeiro = new CACHORRO ("Rex", 5);
		segundo = new CACHORRO ("Fido", 8);
		
	}
	public void imprimirDados(CACHORRO nomeCachorro) 
	{
	System.out.println(nomeCachorro.geraDescricao());	
	}
	
	public void testaAnimal(Animal umAnimal) {
		System.out.println();
	}
	public void testaFugir(Animal umAnimal)
	{
		System.out.println("Versão com Animal");
		String texto = umAnimal.toString();
		System.out.println(texto);
		
		
	}

}

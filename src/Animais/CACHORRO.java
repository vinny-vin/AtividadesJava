//CACHORRO
package Animais;

public class CACHORRO {

	String nome;
	double peso;
	
	//exemplo de construtor
	
	public CACHORRO() {
		
	}
	
	
	public CACHORRO(String nomeCACHORRO, double pesoCACHORRO)
	{
		this.nome = nomeCACHORRO;
		this.peso = pesoCACHORRO;
	}
	
	//Method that print the dog's attributes
	
	public void imprimeDados()
	{
		System.out.print("Nome:"+this.nome);
//		System.out.println(nome);
		
		System.out.print("Peso:"+this.peso);
//		System.out.println(peso);
		this.testePeso();
	}
	
	public void imprimeDados(String cabecalho) {
		System.out.println(cabecalho);	
		imprimeDados();	
	}
	
	public String geraDescricao() {
		String texto = "nome:" + this.nome;
		texto = "Peso:" + this.peso;
		
		return texto;
	}
	
	private void testePeso() 
	{
		if(this.peso <= 0) 
		{
			System.out.println("peso parece invalido");
		}
		else 
		{
			System.out.println("peso parece valido");
		}

	}
	
	
	public String toString() {
		String texto;
		texto = geraDescricao();
		return texto;
	}
	
	
		
	}
		



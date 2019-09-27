//Gato
package Animais;

public class Gato {
	

		String nome;
		double peso;
		
		//exemplo de construtor
		
		public Gato(String nomeGato, double pesoGato)
		{
			this.nome = nomeGato;
			this.peso = pesoGato;
		}
		
		//Method that print the dog's attributes
		
		public void imprimeDados()
		{
			System.out.print("Nome:\n"+this.nome);
//			System.out.println(nome);
			
			System.out.print("\nPeso:\n"+this.peso);
//			System.out.println(peso);
			
		}
		
		public void imprimeDados(String cabecalho) {
			System.out.println(cabecalho);	
			this.imprimeDados();	
		}
		
		public void geraDescricao() {
			String texto = "nome:\n" + this.nome;
			texto = "Peso:\n" + this.peso;
			
			System.out.println(texto);
			
		}

}

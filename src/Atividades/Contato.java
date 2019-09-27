//contato
package Atividades;
import java.util.Scanner;

public class Contato {
	
	public String nome;
	public String email;
	public String conjunto;
//	Scanner ler = new Scanner(System.in);
	
	public Contato(String nome, String email) {
		this.email = email;
		this.nome = nome;
		this.conjunto = nome + ("\n") + email;
	}

	public void introduzDados() {

	}

	
}
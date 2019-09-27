// agenda
package Atividades;
import java.util.Scanner;
import Atividades.Contato;

public class Agenda {
	
	
	static String[] contatos = new String[100];
	static Scanner ler = new Scanner (System.in);
	static int i = 0;
	static String nome;
	static String email;
	static Agenda teste1 = new Agenda();
	static int resp;
	static String busc;
	
	public static void main(String[] args) {
		teste1.adicionar();
		teste1.listar();
		
	}

	public void adicionar() {
		do {
			System.out.println("Digite o nome:");
		nome = ler.next();
		
		System.out.println("Digite o email:");
		email = ler.next();
		Contato teste = new Contato(nome, email);
		
		System.out.println(teste.conjunto);
		
		teste.introduzDados();
		contatos[i] = teste.conjunto;
		i++;
		System.out.println("Deseja continuar adicionando contatos? \n Digite 1 para sim \n Digite 0 para não");
		resp = ler.nextInt();
		
		
	}while(resp == 1);
		
	}
	
	public void listar() {
		for(int i = 0; i < contatos.length ; i++) {
			if(contatos[i] != null) {
				System.out.println("LIsta por ordem de criação: \n Contato" + (i + 1) +":" + contatos[i]);
			}

		}
	}
		
	public void buscar() {
		System.out.println("digite o nome do contato que deseja buscar");
		busc = ler.next();
	}
}
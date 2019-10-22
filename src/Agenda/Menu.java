package Agenda;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
	
	static Scanner ler = new Scanner(System.in);
	static Pessoa teste1 = new Pessoa();
	
	public static void main(String[] args) throws IOException {
		Menu teste = new Menu();
		System.out.println("Bem vindo a sua agenda pessoal \r\n" );
		teste.menu();
	}
	
	public void menu() throws IOException {
		int resp;
		System.out.println("\n O que deseja fazer? \n 1. Cadatrar    2.Listar   3.Deletar ");
		resp = ler.nextInt();
		switch (resp) {
			case 1:
				teste1.cadastrarPessoa();
				break;
			case 2:
				teste1.Listar();
				break;
			case 3:
				teste1.deletarPessoa();
			default:
				break;
		}
	this.menu();
	}

	@SuppressWarnings("unused")
	private void Switch(int resp) {
		// TODO Auto-generated method stub
		
	}
		
	}



package Atividades;

import java.util.Scanner;

public class Impares {
	
	static Impares teste = new Impares();
	Scanner ler =  new Scanner(System.in);

	public static void main(String[] args) {
		
		teste.identImpares();

	}
	
	public void identImpares() {
		int tamanho;
		System.out.println("\n Digite o numero base abaixo: \n");
		tamanho = ler.nextInt();
		
		for ( int i = 0; i < tamanho; i++) {
			if(i % 2 == 0) {
				
			}else {
				System.out.println(i);
				
			}
			
		}
		System.out.println("------------------------");
	}

}

//NumeroDecrescente
package Atividades;

import  java.util.Scanner; 

public class NumeroDecrescente {
	Scanner ler = new Scanner(System.in);
	static NumeroDecrescente teste = new NumeroDecrescente(); 
	int num;
	public static void main(String[] args) {

		teste.descrescente();

	}
	
	public void descrescente() {
		System.out.println("Digite o numero: \n");
		num = ler.nextInt();
		
		while(num > 0) {
			num--;
			System.out.println(num);
		}
	}

}

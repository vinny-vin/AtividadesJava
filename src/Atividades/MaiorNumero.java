//MaiorNumero
package Atividades;

import java.util.Scanner;

public class MaiorNumero {
	public int num1;
	public int num2;
	Scanner ler = new Scanner(System.in);
	static MaiorNumero teste = new MaiorNumero();
	
	public static void main(String[] args) {
		teste.Maior();

	}
	
	public void Maior() {
		System.out.println("Digite um primeiro numero");
		num1 = ler.nextInt();
		System.out.println("Digite um segundo numero");
		num2 = ler.nextInt();
		
		if(num1 > num2) {
			System.out.println("O maior numero é:" + num1);
		}
		else {
			System.out.println("O maior numero é:" + num2);
		}
	}

}

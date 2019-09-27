//TestadorArray
package Testadores;

import java.util.Scanner;

public class TestadorArray {

	
	static int[] primeiro = new int[100];
	static TestadorArray exemplo = new TestadorArray();
	static int inteiro = 0;
	Scanner Entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		exemplo.testaArrayInt();
		exemplo.testaArrayString(12);
	}
		
		
		
		public void testaArrayInt() {
		for(int i = 0; i < 100; i++ ) {
			primeiro[i] = i;
			
			}
		exemplo.Listar();
	}
			
	public void Listar() {
		for(int i=0; i< 100 ; i++){
			System.out.println("posicao " + (i+1) + " = " + primeiro[i] );
		}
	}
	public void testaArrayString(int tamanho) {
		
		Scanner Entrada = new Scanner(System.in);
		String[] segundo = new String[tamanho];
		for(int i = 0; i < tamanho; i++ ) {
			segundo[i] = Entrada.next();
			
		}
		
	}
	public void testaAnimalArray() {
		
	}
	public void testaArray() {
		
		
	}
}
	



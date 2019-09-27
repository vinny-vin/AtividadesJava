//MediaAluno
package Atividades;
import java.util.Scanner;

public class MediaAluno {
	
	static int num;
	static Scanner ler = new Scanner(System.in);
	static int[] notas;
	static int media;

	public static void main(String[] args) {
		MediaAluno teste = new MediaAluno();
		System.out.println("Digite o numero de notas que irá inserir: \n");
		do {
			num = ler.nextInt();
			notas = new int[num];
			if(num < 0 || num > 100) {
				System.out.println("Numero invalido! \n Digite um numero de notas válido");
			}
		}while(num < 0 || num > 100);
		
		teste.adicionar();
		teste.listar();
		teste.media(num);
	}
	
	public void adicionar() {
	
		for(int i = 0; i < notas.length; i ++) {
			System.out.println("Insira o proximo a proxima nota: \n");
			notas[i] = ler.nextInt();
			
		}
		
	}
	
	public void listar() {
		
		for(int i = 0; i < notas.length ; i++) {
			System.out.println("nota " + (i+1) + "=" + notas[i]);
		}
	}
	
	public void media(int num) {
		
		for(int i = 0; i < notas.length; i++) {
			media += notas[i];
		}
		media = media/num;
		System.out.println("A media das notas é:" + media);
	}
	

}

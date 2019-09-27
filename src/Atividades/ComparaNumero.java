//ComparaNumero
package Atividades;
import java.util.Scanner;;

public class ComparaNumero {
	
	Scanner ler = new Scanner(System.in);
	int num1;
	int num2;
	static ComparaNumero teste = new ComparaNumero();

	public static void main(String[] args) {
		
		teste.compara();


	}
	public void compara() {
		System.out.println("Digite o primeiro numero: \n");
		num1 = ler.nextInt();
		System.out.println("Digite o segundo numero: \n");
		num2= ler.nextInt();
		
		if(num1 == num2) {
			System.out.println("Os numeros São iguais. \n");
		}else {
			System.out.println("Os numeros são Diferentes. \n");
			if(num1 > num2) {
				System.out.println("Maior:" + num1 + "\n Menor:" + num2);
			}else {
				System.out.println("Maior:" + num2 + "\n Menor:" + num1);
			}
			
		}
		
	}

}

package Repeti��es;
import java.util.Scanner;

public class Repeti��es_1 {
	
	Scanner ler = new Scanner(System.in);
	static int num;
	static Repeti��es_1 teste = new Repeti��es_1();

	public static void main(String[] args) {
		
		teste.intDados();
		teste.testaPrimos();

	}

	public void intDados() {
		
		System.out.println("Digite o numero");
		num = ler.nextInt();
	}
	
	public void testaPrimos() {
		int divisores = 0;
		int  i = 1;
		while (i <= num){
			        if (num % i == 0) {
			            divisores = divisores++;
			            i = i++;
			        }
		} 
			if (divisores == 2) {
				System.out.println("O numero � primo");
			}
			else {
				System.out.println("O numero n�o � primo");
			}
		
	}
}

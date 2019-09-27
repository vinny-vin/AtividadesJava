package Atividades;
import java.util.Scanner;

public class TrocaNumero {

	Scanner ler = new Scanner(System.in);
	int NumA;
	int NumB;
	int meioA;
	int meioB;
	static TrocaNumero teste = new TrocaNumero();
	public static void main(String[] args) {
		
		teste.troca();
		

	}
	
	public void troca() {
		System.out.println("Digite o primeiro numero: \n");
		NumA = ler.nextInt();
		System.out.println("Digite o segundo numero: \n");
		NumB = ler.nextInt();
		
		System.out.println(NumA +"\n" + NumB);
		
		
		
		System.out.println(NumB + "\n" + NumB);
		
	}

}

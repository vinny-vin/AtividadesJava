package Repeti��es;
import java.util.Scanner;
import java.lang.Math;

public class Repeti��es_2 {
	
	static int i = 0;
	static int random;
	static int resp;
	Scanner ler = new Scanner(System.in);
	static Repeti��es_2 teste = new Repeti��es_2();
	
	public static void main(String[] args) {
		
		
		teste.gerarNum();
		while(resp != random) {
		teste.palpite();
		i++;
		}
		teste.numTentativas();
		teste.testandoNova();
	}

	public void gerarNum() {
		 
		System.out.println("Bem vindo ao jogo de palpites \n Tente descobrir o numero sorteado por meio de palpites. ");
		random = 1 + (int) (Math.random() * 100);
		
		
	}
	
	
	public void palpite() {
		System.out.println("Digite o seu palpite:");
		resp = ler.nextInt();
		
		if(resp > random) {
			System.out.println("O seu palpite � maior que o numero sorteado!!! ");
		}
		if(resp < random) {
			System.out.println("O seu palpite � menor que o numero sorteado!!! ");
		}
		if(resp == random) {
			System.out.println("O seu palpite est� certo");
		}
	}
	
	public void numTentativas() {
		System.out.println("O seu numero de tentativas foi:" + i);
	}
	
	public void testandoNova() {
		System.out.println("testandooooooooooooo");
	}
}

package Atividades;
import java.util.Scanner;
import java.util.ArrayList;

public class Carros {
	static int num;
	Scanner ler = new Scanner(System.in);
	static ArrayList <String> CarrosVelhos; 
	static ArrayList <String> CarrosNovos; 
	static int cont1 = 0;
	static int cont2 = 0;
	static double valor1;
	static double valor2;
	static int resp;
	public void escolher() {
		System.out.println("Bem vindo ao sistema de compra de carros \n temos opções de carros com ano após ou antes de 2000 \n para comprar um carro velho digite 1 \n para um carro novo, digite 2\n");
		num = ler.nextInt();
		}
	public void adicionar() {
		if(num == 1) {
			CarrosVelhos = new ArrayList<String>();
			System.out.println("Digite o valor do carro:\n");
			valor1 = ler.nextInt();
			cont1++;
			for (int i = 0; i < cont1; i++) {
				CarrosVelhos.add("VALOR: " + valor1);
			}
		}
		else {
			CarrosNovos = new ArrayList<String>();
			System.out.println("Digite o valor do carro:\n");
			valor2 = ler.nextInt();
			cont2++;
			for (int i = 0; i < cont2; i++) {
				CarrosNovos.add("VALOR: " + valor2);
			}
		}
	}
	public void recursao() {
		System.out.println("Deseja comprar mais carros?\n Digite 1 para Sim\n Digite 2 para Não");
		resp = ler.nextInt();
	}

}

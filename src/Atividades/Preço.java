package Atividades;
import Atividades.Carros;
import java.util.ArrayList;

public class Pre�o {
	static Pre�o test = new Pre�o();
	static Carros teste = new Carros(); 
	static double descontoVelho;
	static double descontoNovo;
	static double pre�o;
	static double pre�oFinalVelho; 
	static double pre�oFinalNovo; 
	static ArrayList<String> Pre�oFinal;
	static int cont;
	public static void main(String[] args) {
		do {
			teste.escolher();
			teste.adicionar();
			test.definirPre�o(Carros.num);
			teste.recursao();
		} while(Carros.resp == 1);
			
		test.mostrarArrays();
		
		
		
		
	}
	public void definirPre�o(int num) {
		double Pre�oFinal = 0;
		if(Carros.num ==1) {
			descontoVelho =Carros.valor1 * 0.12;
			System.out.println("Desconto:" + descontoVelho);
			pre�oFinalVelho = Carros.valor1 - descontoVelho;
			System.out.println("O pre�o final do carro �:" + pre�oFinalVelho);
			Pre�oFinal += pre�oFinalVelho;
			cont++;
			for(int i = 0; i < cont;i++) {
				Pre�oFinal += pre�oFinalVelho;
			}

					}
		else {
			descontoNovo =Carros.valor2 * 0.07;
			System.out.println("Desconto:" + descontoNovo);
			pre�oFinalNovo = Carros.valor2 - descontoVelho;
			System.out.println("O pre�o final do carro �:" + pre�oFinalNovo);
			Pre�oFinal += pre�oFinalNovo;
			cont++;
			for(int i = 0; i < cont;i++) {
				Pre�oFinal += pre�oFinalNovo;
			}

		}
	}
	public void mostrarArrays() {
		Pre�oFinal.forEach(System.out::println);
		Carros.CarrosNovos.forEach(System.out::println);
		Carros.CarrosVelhos.forEach(System.out::println);
	}

}

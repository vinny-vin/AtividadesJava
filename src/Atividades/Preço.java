package Atividades;
import Atividades.Carros;
import java.util.ArrayList;

public class Preço {
	static Preço test = new Preço();
	static Carros teste = new Carros(); 
	static double descontoVelho;
	static double descontoNovo;
	static double preço;
	static double preçoFinalVelho; 
	static double preçoFinalNovo; 
	static ArrayList<String> PreçoFinal;
	static int cont;
	public static void main(String[] args) {
		do {
			teste.escolher();
			teste.adicionar();
			test.definirPreço(Carros.num);
			teste.recursao();
		} while(Carros.resp == 1);
			
		test.mostrarArrays();
		
		
		
		
	}
	public void definirPreço(int num) {
		double PreçoFinal = 0;
		if(Carros.num ==1) {
			descontoVelho =Carros.valor1 * 0.12;
			System.out.println("Desconto:" + descontoVelho);
			preçoFinalVelho = Carros.valor1 - descontoVelho;
			System.out.println("O preço final do carro é:" + preçoFinalVelho);
			PreçoFinal += preçoFinalVelho;
			cont++;
			for(int i = 0; i < cont;i++) {
				PreçoFinal += preçoFinalVelho;
			}

					}
		else {
			descontoNovo =Carros.valor2 * 0.07;
			System.out.println("Desconto:" + descontoNovo);
			preçoFinalNovo = Carros.valor2 - descontoVelho;
			System.out.println("O preço final do carro é:" + preçoFinalNovo);
			PreçoFinal += preçoFinalNovo;
			cont++;
			for(int i = 0; i < cont;i++) {
				PreçoFinal += preçoFinalNovo;
			}

		}
	}
	public void mostrarArrays() {
		PreçoFinal.forEach(System.out::println);
		Carros.CarrosNovos.forEach(System.out::println);
		Carros.CarrosVelhos.forEach(System.out::println);
	}

}

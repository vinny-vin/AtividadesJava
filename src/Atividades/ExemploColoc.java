//ExemploColoc
package Atividades;
import java.util.ArrayList;
public class ExemploColoc {
	
	private static ArrayList<String> array;

	public static void main(String[] args) {
		ExemploColoc test = new ExemploColoc();
		
		test.adicionaStrings(100);
		ArrayList<String> valoresRecebidos = new ArrayList<String>();
		valoresRecebidos = geraSubColecao(20);
		valoresRecebidos.forEach(System.out::println);
	}
	
	public void adicionaStrings(int quantidade) {
		array = new ArrayList<String>();
		
		for (int i = 0; i < quantidade; i++) {
			array.add("VALOR: " + i);
			
		}
		array.forEach(System.out::println);
	}


	public static ArrayList<String> geraSubColecao(int quantidade) {
		 ArrayList<String>arrayretorno = new ArrayList<String>();
		
		for (int i = 0; i < quantidade; i++) {
			arrayretorno.add(array.get(i));
			
		}
		return arrayretorno;
		
	}
}
//TestadorGato
package Testadores;

import Animais.Gato;

public class TestadorGato {

	public static void main(String[] args) {
		
		Gato gato = new Gato("fluflu", 4);
		
		gato.imprimeDados("ACHOU QUE N IA TER UM CABEÇALHO? ACHOU ERRADO OTARIO");
		gato.geraDescricao();

	}

}

//TESTADOR
package Testadores;

import Animais.CACHORRO;

public class TESTADOR {

	public static void main(String[] args) {	
//		Cliente money = new Cliente("murial",45,67,"recife","sozinho");
//		
//		money.imprimeDados();
//		money.cidadeDados();
//		System.out.println(money.descricao);
		
		CACHORRO objeto  = new CACHORRO("teste", 30);
		
		objeto.imprimeDados();
		objeto.geraDescricao();
		
		System.out.println(objeto.toString());
		
	}
}

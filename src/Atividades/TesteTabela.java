package Atividades;

import java.util.HashMap;

public class TesteTabela {
	
	private HashMap<String,Object> tabela;

	public static void main(String[] args) {
		TesteTabela  exemplo = new TesteTabela();
	}
	
	private void criaTabela() {
		
		tabela = new HashMap< String, Object>();
	}
	private void preencheTabela() {
		
		tabela.put("A", "VRAAAAU");
		tabela.put("B", "VRUMMM");
		tabela.put("B", "VRIIIMMM");
	}
	private void consultaTabela() {
		
		String teste1, teste2;
		Object test, test2;
		
		teste1 = "A";
		
		test = tabela.get(teste1);
		System.out.println("O dado para " + teste1);
		System.out.println("é" + test);
		
		teste2 = "B";
		test2 = tabela.get(teste2);
		System.out.println("O dado para " + teste2);
		System.out.println("é" + test2);
		
	}
	
	private void substituirEntrada() {
		
		String valorAntigo;
		
		
		
		
		
	}

}

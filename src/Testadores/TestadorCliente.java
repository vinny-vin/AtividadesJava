//TestadorCliente
package Testadores;

import Cliente.Cliente;

public class TestadorCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("VRAU", 45, 112343546, "FFE", "DSFSFD");
		
		cliente.imprimeDados();
		
		cliente.imprimemDados();
	}

}

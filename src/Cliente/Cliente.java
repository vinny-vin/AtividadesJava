//Cliente 
package Cliente;
import java.util.Scanner;

public class Cliente {
	
	String nome;
	double idade;
	double cpf;
	String cidade;
	String descricao;
	int numero = 0;
	Scanner ler = new Scanner(System.in);
	
	public Cliente() {
		
	}
	public Cliente(String nomeCliente,double idadeCliente, double cpfCliente,String cidadeCliente, String descricaoCliente) {
		
		this.nome = nomeCliente;
		this.idade = idadeCliente;
		this.cpf = cpfCliente;
		this.cidade = cidadeCliente;
		this.descricao = descricaoCliente;
		
		}
	
	public void imprimeDados() {
		System.out.print("Nome:");
		System.out.println(nome);
		
		System.out.print("idade:");
		System.out.println(idade);
		
		System.out.print("cpf:");
		System.out.println(cpf);
		
		System.out.print("cidade:");
		System.out.println(cidade);
		
		System.out.print("descricao:");
		System.out.println(descricao);
	}
	
	public void imprimemDados() {
		for (int i = 0;i < 6; i++) {
			numero = numero++;
			System.out.print("Digite o" + i + " numero:");
			numero = ler.nextInt();
			System.out.print("O primeiro numero é:" + numero + "\n");
		}
		
		
			}
	
	public void cidadeDados() {
		
		if(cidade == "recife") {
			System.out.print("A cidade do Recife possui cinco lojas");
		}
			else{
				System.out.print("não temos lojas nessa cidade \n");
			}
		
	}
	
	public String geraDescricao() {
		String texto = "nome:" + nome;
		//texto = texto = "Peso:" + peso;
		
		return texto;
	}
	
}
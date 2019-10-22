package Agenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Pessoa {
	
	private String nome;
	private String dataNas;
	private long numero;
	private String email; 
	
	private List<Pessoa> pessoas = new ArrayList<Pessoa>(); 
	private Scanner ler = new Scanner(System.in);
	private String nomeArq  = "d:\\ contatos.txt";
	private int i;
	private int contador = 0;
	public Pessoa(String nome, String dataNas, long numero, String email) {
		this.nome = nome;
		this.dataNas = dataNas;
		this.numero = numero;
		this.email = email;
	}


	public Pessoa() {}
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDataNas() {
		return dataNas;
	}


	public void setDataNas(String dataNas) {
		this.dataNas = dataNas;
	}


	public long getNumero() {
		return numero;
	}


	public void setNumero(long numero) {
		this.numero = numero;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Pessoa\n nome= " + nome + "\n dataNas= " + dataNas + "\n numero= " + numero + "\n email= " + email + "\n" ;
	}
	
	
	
	public void cadastrarPessoa() throws IOException {
		Pessoa pessoal =  new Pessoa();
		
		System.out.println("Digite respectivamente O nome, a data de nascimento, o numero e o email");
		pessoal.setNome(ler.next());
		pessoal.setDataNas(ler.next());
		pessoal.setNumero(ler.nextLong());
		pessoal.setEmail(ler.next());
		
		pessoas.add(pessoal);
		gravarArquivo();
		contador++;
	}
	
	public void gravarArquivo() throws IOException {
		FileWriter Arq = new FileWriter(nomeArq);
		PrintWriter GravarArq = new PrintWriter(Arq);
		
		pessoas.forEach((pessoa) ->{
			GravarArq.print(pessoa);
		});
		
		Arq.close();
	    
	}
	
	@SuppressWarnings("unused")
	public void Listar() throws IOException {  
		  System.out.printf("\nConteúdo do arquivo texto:\n");
		  
		 
		  FileReader Arq = new FileReader(nomeArq);
		  BufferedReader lerArq = new BufferedReader(Arq);
		  

		 String linha = lerArq.readLine();
		  
		 String str = "";
		 String[] pessoasLista;
		 
		  while(linha != null) {
			  linha = lerArq.readLine();
			  str += linha;
		  }
		 if(contador != 0) {
			  pessoasLista = str.split("Pessoa");
			  for (i = 0; i < pessoasLista.length; i++) {
				  Pessoa valor = new Pessoa();
				  System.out.println("Pessoa " + (i+ 1));
				  System.out.println(pessoasLista[i]);
				  String[] valor1 = pessoasLista[i].substring(6).split(" ");
				  String nomeUser = valor1[1];
				  String dataUser = valor1[3];
				  String numeroUser = valor1[5];
				  String emailUser = valor1[7];
				  valor.setNome(nomeUser);
				  valor.setDataNas(dataUser);
				  valor.setNumero(Long.valueOf(numeroUser));
				  valor.setEmail(emailUser);
				  this.pessoas.add(valor);
			  } 
		 }else {
			 System.out.println("Não existem contatos");
		 }
			  Arq.close();
			   
			  System.out.println();
		   
	  }
	
	public void deletarPessoa() throws IOException {
		
		FileReader Arq = new FileReader(nomeArq);
		@SuppressWarnings("resource")
		BufferedReader lerArq = new BufferedReader(Arq);
		
		String delnome;
		System.out.println("Qual o nome do contato que deseja apagar?");
		delnome = ler.next();
		
		String linha = lerArq.readLine();
		
		String str = "";
		while(linha != null) {
			  linha = lerArq.readLine();
			  str += linha;
		 }
		
		String nomeUser = null;
		String[] pessoasLista;
		pessoasLista = str.split("Pessoa");
		for (i = 0; i < pessoasLista.length; i++) {
		String[] valor1 = pessoasLista[i].substring(6).split(" ");
		   nomeUser = valor1[1];
		}
		while(linha != null) {
			  linha = lerArq.readLine();
			   if(nomeUser != delnome) {
				   FileWriter Arq1 = new FileWriter(nomeArq);
				   PrintWriter GravarArq = new PrintWriter(Arq1);
				   
				   GravarArq.print(str);
			  }
			  
		}
		
		
		Pessoa pessoaExcluida = null;
		for (Pessoa pessoa : pessoas) {
			if(pessoa.getNome().equals(delnome)){
				pessoaExcluida = pessoa;
			}
		}
		if(pessoaExcluida != null) {
			this.pessoas.remove(pessoaExcluida);
		}
		contador--;

	}

}


	
	


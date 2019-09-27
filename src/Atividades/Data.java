//Data
package Atividades;

import java.util.Scanner; 


public class Data {
	
	static int dia, mes, ano;
	
	static String data;

	
	static Scanner leia = new Scanner(System.in);

	public static void digitarDia(){
		System.out.println("digite o dia \n");
		dia = leia.nextInt();}
	
	public static void digitarMes() {
		System.out.println("digite o mes \n ");
		mes = leia.nextInt();
	}
	
	public static void digitarAno() {
		System.out.println("digite o ano \n");
		ano = leia.nextInt();
	}
	
	public static void main(String[] args) {
		
		
		digitarDia();
		while(dia > 31 || dia < 0){
			System.out.println("numero invalido.");
			digitarDia();
		}  
			digitarMes();
			while(mes > 12 || mes < 0) {
				System.out.println("numero invalido");
				digitarMes();
			}
				digitarAno();
				while(ano <= 0 || ano >= 2099) {
					System.out.println("numero invalido");
					digitarAno();
					}
				
			

	

		
		
		
		data = (dia + "/" + mes + "/" + ano);
		
		System.out.println("A data digitada foi: \t" + data);
	}

}

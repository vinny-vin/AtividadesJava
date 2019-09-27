package Atividades;
import java.math.*;

@SuppressWarnings("unused")
public class PreencheArrays {
	
	int [] array1 = new int[10];
	double [] array2 = new double[11];
	int [] array3 = new int [11];
	int [] array4 = new int [10];
	static PreencheArrays teste = new PreencheArrays();

	public static void main(String[] args) {
		teste.preencheArray1();
		teste.preencheArray2();
		teste.preenchearray3();
		teste.preenchearray4();

	}
	public void preencheArray1() {
		int numerador = 10;
		for( int i = 0; i < array1.length; i ++) {
			array1[i] = numerador;
			numerador--;
		}
		for (int y : array1) {
			System.out.println(y);
			
		}
	}
	
	public void preencheArray2() {

		double numerador = 0;
		for (int i = 0; i < array2.length; i++) {
			numerador = Math.pow(i , 2);
			array2[i] = numerador;
		}
		for (double t : array2) {
			System.out.println(t);
		}
	}

	public void preenchearray3() {
		 int r = 1;
		for (int i = 1; i < array3.length; i++) {
			if(i < 6) {
				System.out.println(i);
				
			}
			else {
				int numerador = r * 10;
				System.out.println(numerador);
				r++;
			}
		}
	}
	
	public void preenchearray4() {
		int[] primos = new int[20];
		int numerador = 1;
		for (int i = 0; i < 20; i++) {
			if(i % 2 != 0) {
				primos[i] = i;	
			}else {
				
			}
		}
		for (int i = 0; i < array4.length; i++) {
			array4[i] = numerador + primos[i];
		}
		for (int t : array4) {
			System.out.println(t);
		}
	}
	
	
}

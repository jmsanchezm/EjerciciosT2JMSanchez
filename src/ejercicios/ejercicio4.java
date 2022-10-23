package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		int num;
		String letra = null;
		int cifra1;
		int cifra2;
		int numEspecial=0;
		Scanner read = new Scanner (System.in);
		System.out.println("Introduzca un número: ");
		num =read.nextInt();
		cifra1=num/10;
		cifra2=num%10;
		if (num == cifra1 && num == cifra2) {
		switch (cifra1) {
			case 1:
				System.out.println("Dieci");
				break;
			case 2:
				System.out.println("Venti");
				break;
			case 3 :
				System.out.println("Treinta");
				break;
			case 4:
				System.out.println("Cuarenta");
			case 5:
				System.out.println("Cincuenta");
			case 6:
				System.out.println("Sesenta");
			case 7: 
				System.out.println("Setenta");
				break;
			case 8: 
				System.out.println("Ochenta");
				break;
			case 9:
				System.out.println("Noventa");
			default:
				System.out.println("ERROR");
				
		}
		switch (cifra2) {
			case 1:
				System.out.println("uno");
				break;
			case 2:
				System.out.println("dos");
				break;
			case 3 :
				System.out.println("tres");
				break;
			case 4:
				System.out.println("cuatro");
			case 5:
				System.out.println("cinco");
			case 6:
				System.out.println("seis");
			case 7: 
				System.out.println("siete");
				break;
			case 8: 
				System.out.println("ocho");
				break;
			case 9:
				System.out.println("nueve");
			default:
				System.out.println("ERROR");
		}
		}else if (num==numEspecial) {
		switch (numEspecial) {
			case 11:
				System.out.println("Once");
				break;
			case 12:
				System.out.println("Doce");
				break; 
			case 13:
				System.out.println("Trece");
				break;
			case 14:
				System.out.println("Catorce");
				break;
			case 15:
				System.out.println("Quince");
				break;
			case 20:
				System.out.println("Veinte");
			}
		}
	}
}

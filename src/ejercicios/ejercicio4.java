package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		int num;
		int dec;
		int unid;
		int numEspecial;
		Scanner read = new Scanner (System.in);
		System.out.println("Introduzca un número: ");
		num =read.nextInt();
		dec=num/10;
		unid=num%10;
		switch (dec) {
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
		switch (unid) {
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
		switch (numEspecial) {
		
		}
		if ()
	}

}

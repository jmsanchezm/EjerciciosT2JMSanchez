package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Declaramos variables.
		int dni;//Se guardará el número de dni que introduzca el usuario.
		int letra;//Se guardará el resultado del módulo.
		
		Scanner read= new Scanner (System.in);
		System.out.print("Introduzca su DNI para calcular la letra: ");
		dni = read.nextInt();
		if (dni>=1 && dni<=99999999) {
		letra = dni%23;
		switch (letra) {
		case 0:
			System.out.println("La letra corresponiente es T");
			break;
		case 1:
			System.out.println("La letra corresponiente es R");
			break;
		case 2:
			System.out.println("La letra corresponiente es W");
			break;
		case 3:
			System.out.println("La letra corresponiente es A");
			break;
		case 4:
			System.out.println("La letra corresponiente es G");
			break;
		case 5:
			System.out.println("La letra corresponiente es M");
			break;
		case 6:
			System.out.println("La letra corresponiente es Y");
			break;
		case 7:
			System.out.println("La letra corresponiente es F");
			break;
		case 8:
			System.out.println("La letra corresponiente es P");
			break;
		case 9:
			System.out.println("La letra corresponiente es D");
			break;
		case 10:
			System.out.println("La letra corresponiente es X");
			break;
		case 11:
			System.out.println("La letra corresponiente es B");
			break;
		case 12:
			System.out.println("La letra corresponiente es N");
		case 13:
			System.out.println("La letra corresponiente es J");
			break;
		case 14:
			System.out.println("La letra corresponiente es Z");
			break;
		case 15:
			System.out.println("La letra corresponiente es S");
			break;
		case 16:
			System.out.println("La letra corresponiente es Q");
			break;
			
		case 17:
			System.out.println("La letra corresponiente es V");
			break;
		case 18:
			System.out.println("La letra corresponiente es H");
			break;
		case 19:
			System.out.println("La letra corresponiente es L");
			break;
		case 20:
			System.out.println("La letra corresponiente es C");
			break;
		case 21:
			System.out.println("La letra corresponiente es K");
			break;
		case 22:
			System.out.println("La letra corresponiente es E");
			break;
		default:
			System.out.println("ERROR");
		}
		}else {
			System.out.println("Dato erróneo");
		}
		read.close();




	}

}

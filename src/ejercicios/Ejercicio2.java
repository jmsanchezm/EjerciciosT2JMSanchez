package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*Para garantizar el funcionamiento del programa, se han introducido
		DNIs reales. Como resultado, se ha mostrado sus letras correspondientes. 
		También se han introducido valores al azar y mostraba su correspondiente letra.
		En adición, se le ha probado con números mayores a los que se encuentran en el 
		intervalo (1,99999999) y, como resultado, se nos ha mostrado en pantalla que los
		datos son erróneos. Por tanto , el prgrama cumple con los requisitos del ejercicio.*/
		
		//Declaramos variables.
		int dni;//Se guardará el número de dni que introduzca el usuario.
		int letra;//Se guardará el resultado del módulo.
		
		//Creamos el Scanner.
		Scanner read= new Scanner (System.in);
		//Solicitamos al usuario un DNI, sin letra.
		System.out.print("Introduzca su DNI para calcular la letra: ");
		//Ordenamos al Scanner leer el teclado.
		dni = read.nextInt();
		
		/*Mediante u if, ponemos la condición que sólo se calculará la letra
		de los número comprendidos entre 1 y 99999999.*/
		if (dni>=1 && dni<=99999999) {
		//Para el cálculo de la letra, sólo nos bastará calcular el módulo del número por 23.
		letra = dni%23;
		//Creamos un switch para la asignación de cada resto a una letra.
		switch (letra) {
		//En caso de ser 0, se le mostrará T
		case 0:
			System.out.println("La letra corresponiente es T");
			break;
			
		//En caso de ser 1, se le mostrará R
		case 1:
			System.out.println("La letra corresponiente es R");
			break;
			
		//En caso de ser 2, se le mostrará W
		case 2:
			System.out.println("La letra corresponiente es W");
			break;
		
		//En caso de ser 3, se le mostrará A
		case 3:
			System.out.println("La letra corresponiente es A");
			break;
			
		//En caso de ser 4, se le mostrará G
		case 4:
			System.out.println("La letra corresponiente es G");
			break;
			
		//En caso de ser 5, se le mostrará M
		case 5:
			System.out.println("La letra corresponiente es M");
			break;
			
		//En caso de ser 6, se le mostrará Y
		case 6:
			System.out.println("La letra corresponiente es Y");
			break;
			
		//En caso de ser 7, se le mostrará F
		case 7:
			System.out.println("La letra corresponiente es F");
			break;
			
		//En caso de ser 8, se le mostrará P
		case 8:
			System.out.println("La letra corresponiente es P");
			break;
			
		//En caso de ser 9, se le mostrará D
		case 9:
			System.out.println("La letra corresponiente es D");
			break;
			
		//En caso de ser 10, se le mostrará X
		case 10:
			System.out.println("La letra corresponiente es X");
			break;
			
		//En caso de ser 11, se le mostrará B
		case 11:
			System.out.println("La letra corresponiente es B");
			break;
			
		//En caso de ser 12, se le mostrará N
		case 12:
			System.out.println("La letra corresponiente es N");
			break;
			
		//En caso de ser 13, se le mostrará J
		case 13:
			System.out.println("La letra corresponiente es J");
			break;
			
		//En caso de ser 14, se le mostrará Z
		case 14:
			System.out.println("La letra corresponiente es Z");
			break;
			
		//En caso de ser 15, se le mostrará S
		case 15:
			System.out.println("La letra corresponiente es S");
			break;
			
		//En caso de ser 16, se le mostrará Q
		case 16:
			System.out.println("La letra corresponiente es Q");
			break;
			
		//En caso de ser 17, se le mostrará V
		case 17:
			System.out.println("La letra corresponiente es V");
			break;
			
		//En caso de ser 18, se le mostrará H
		case 18:
			System.out.println("La letra corresponiente es H");
			break;
			
		//En caso de ser 19, se le mostrará L
		case 19:
			System.out.println("La letra corresponiente es L");
			break;
			
		//En caso de ser 20, se le mostrará C
		case 20:
			System.out.println("La letra corresponiente es C");
			break;
			
		//En caso de ser 21, se le mostrará K
		case 21:
			System.out.println("La letra corresponiente es K");
			break;
			
		//En caso de ser 22, se le mostrará E
		case 22:
			System.out.println("La letra corresponiente es E");
			break;
			
		//En caso de ser diferente a lo anterior, se le mostrará ERROR.
		default:
			System.out.println("ERROR");
		}
		
		/*En caso de que el usuario introduzca un número mayor, o menor,
		  a lo acordato, se le mostrará el mensaje siguiente.*/
		}else {
			System.out.println("Dato erróneo");
		}
		//Finalmente, cerramos el Scanner.
		read.close();




	}

}

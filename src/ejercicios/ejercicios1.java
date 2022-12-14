package ejercicios;

import java.util.Scanner;

public class ejercicios1 {

	public static void main(String[] args) {
		/* num = 2002 --> El número es capicúa.
		 * num = 567 -->El número no es capicúa.
		 * num = 69 --> El número no es capicúa.
		 * num = 8 --> El número es capicúa, ya que es de una cifra.
		 * num = 12656 --> El dato introducido es erróneo.*/
		
		//Declaramos variables.
		int num;//Se guardará el número introducido por el usuario.
		int resto;//Se guardará el resultado del módulo.
		int cociente;//Se guardará el resultado de la división.
		
		//Creamos el Scanner
		Scanner read = new Scanner (System.in);
		//Solicitamos al usuario un número que esté dentro de ese intervalo.
		System.out.print("Introduzca un número comprendido entre 0 y 9999: ");
		num = read.nextInt(); //Ordenamos al Scanner a que lea el teclado.
		
		//Utilizamos un if para aquellos números comprendidos entre 0 y 10 (no incluye 10).
		if (num>=0 && num<10) {
			//Como resultado se le mostrará al usuario el siguiente mensaje.
			System.out.println("El número es capicúa, ya que es de una cifra.");
		}
		
		//Utilizamos un if para aquellos números comprendidos entre 10 y 100 (no incluye 100).
		if (num>=10 && num <100) {
			// Dividimos num entre 10, que nos dará cociente.
			cociente= num/10; 
			//Calculamos el módulo del número introducido para que nos dé el resto
			resto=num%10; 
			/*Usamos otro if dentro del anterior para poner la condición 
			de que resto y cociente sean iguales.*/
			if ((int)cociente == resto) {
				//En el caso de que se cumpla esta condición se le mostrará el siguiente mensaje.
				System.out.println("El número es capicúa.");
			}else {
				//En el caso de no cumplirse, se mostrará este otro.
				System.out.println("El número no es capicúa.");
			}
			
		/*En el caso de que no se cumpla lo anterior, por las cifras del número, ponemos la condición
		  en un intervalo de 100 a 1000(no incluye 1000).*/
		}else if (num>=100 && num <1000) {
			// Dividimos num entre 100, que nos dará cociente.
				cociente = num/100; 
				//Calculamos el módulo del número introducido para que nos dé el resto
				resto= num%10;
				/*Usamos otro if dentro del anterior para poner la condición 
				de que resto y cociente sean iguales.*/
				if ((int)cociente == resto) {
					//En el caso de que se cumpla esta condición se le mostrará el siguiente mensaje.
					System.out.println("El número es capicúa.");
					//En el caso de no cumplirse, se mostrará este otro.
				}else {
					System.out.println("El número no es capicúa.");
				}
				
		/*En el caso de que no se cumpla lo anterior, por las cifras del número, ponemos la condición
		  en un intervalo de 1000 a 10000(no incluye 10000).*/
		}else if (num>=1000 && num<10000) {
			// Dividimos num entre 1000, que nos dará cociente.
			cociente = num/1000;
			//Calculamos el módulo del número introducido para que nos dé el resto.
			resto= num%10;
			/*Usamos otro if dentro del anterior para poner la condición 
			de que resto y cociente sean iguales.*/
			if ((int)cociente == resto) {
				//En el caso de que se cumpla esta condición se le mostrará el siguiente mensaje.
				System.out.println("El número es capicúa.");
				//En el caso de no cumplirse, se mostrará este otro.
			}else {
				System.out.println("El número no es capicúa.");
			}
			
		/*En el caso de que el usuario introduzca valores que no estén en ninguno de los intervalos anteriores,
		se mostrará un mensaje de dato erróneo*/
		}else if (num<0 || num>=10000){
			System.out.println("El dato introducido es erróneo.");
		}
		
		//Finalmente, cerramos el Scanner.
		read.close();
	}

}

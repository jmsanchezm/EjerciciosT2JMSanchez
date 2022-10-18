package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Declaramos variables.
		int num;//Se guardará el número introducido por el usuario.
		//Creamos el Scanner 
		Scanner read = new Scanner (System.in);
		//Solicitamos al usuario un número.
		System.out.println("Introduzca un número: ");
		//Ordenamos al Scanner que lea el teclado
		num =read.nextInt();
		/*Utilizamos un operador ternario para que en el caso de que 
		 el número sea menor que cero, se múltiplica por -1, que nos
		 dará el valor positivo.En el caso de que no sea más pequeño
		 que cero, se mostrará el número introducido.*/
		num= num<0 ? num*-1: num;
		//Como resultado, le mostraremos en pantalla el valor absoluto del número introducido.
		System.out.println(num);
		//Finalmente, cerramos el Scanner.
		read.close();
	}

}

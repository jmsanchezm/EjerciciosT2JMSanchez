package ejercicios;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		//Declaramos variables.
		int numAnimales;//Se guardrá el número de animales que el usuario posea.
		int kilosTotal;//Se guardará la cantidad de comida que consuman los animales.
		double comcomprada;//Se guardará la cantidad de comida que haya comprado el usuario.
		
		//Creamos el Scanner
		Scanner read = new Scanner (System.in); 
		
		//Solicitamos al usuario el número de animales de su granja.
		System.out.println("Introduzca el número de animales que hay en la granja: ");
		//Ordenamos al Scanner leer el teclado.
		numAnimales = read.nextInt();
		
		//Solicitamos al usuario la cantidad de kilod que consumen los animales normalmente.
		System.out.println("¿Cuántos kilos de comida consumen los animales en total normalmente? ");
		//Ordenamos al Scanner leer el teclado.
		kilosTotal = read.nextInt();
		
		//Solicitamos al usuario la cantidad de kilos de comida que han sido comprados.
		System.out.println("Introduzca el número de kilos de comida que han sido comprado: ");
		//Ordenamos al Scanner leer el teclado.
		comcomprada = read.nextInt();
		
		//Mediante un if, ponemos la condición de si, el número de animales es igual a 0, le muestre el siguiente mensaje.
		if (numAnimales==0) {
			System.out.println("No tienes animales a los que alimentar.");
			
		/*En caso de que no se cumpla, ponemos la condición de que si el número de kilos
		totales es igual o mayor al número de kilos comprados, se le muestre el siguiente mensaje.*/
		}else if (comcomprada>=kilosTotal) {
			System.out.println("Hay alimento suficiente para cada animal.");
			
		//En caso de que tampoco se cumpla esa condición, se repartirá a partes iguales los kilos de comida comprados.
		}else {
			comcomprada=comcomprada/numAnimales;
			System.out.println("La ración para cada animal es de " + comcomprada + " kg.");
			
		}
		//Finalmente, cerramos el Scanner.
		read.close();
	}

}

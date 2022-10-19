package ejercicios;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		int numAnimales;
		int kilosTotal;
		int comcomprada;
		double racion;
		Scanner read = new Scanner (System.in); 
		System.out.println("Introduzca el número de animales que hay en la granja: ");
		numAnimales = read.nextInt();
		System.out.println("¿Cuántos kilos de comida consumen los animales en total normalmente? ");
		kilosTotal = read.nextInt();
		System.out.println("Introduzca el número de kilos de comida que han sido comprado: ");
		comcomprada = read.nextInt();
		if (numAnimales==0) {
			System.out.println("No tienes animales a los que alimentar.");
		}else if (kilosTotal<=comcomprada) {
			System.out.println("Hay alimento suficiente para cada animal.");
		}else  {
			racion=comcomprada/numAnimales;
			System.out.println("La ración para cada animal es de " + racion + " kg.");
			
		}
		read.close();
	}

}

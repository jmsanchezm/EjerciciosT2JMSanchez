package ejercicios;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		int hora;
		int min;
		int seg;
		int resto;
		int resto1;
		Scanner read = new Scanner (System.in);
		System.out.println("Introduzca una cantidad de horas: ");
		hora = read.nextInt();
		System.out.println("Introduzca una cantidad de minutos: ");
		min= read.nextInt();
		System.out.println("Introduzca una cantidad de segundos: ");
		seg= read.nextInt();
		seg ++;

			resto = seg>=59 ? 00 : min++;
			resto= min>=59 ? 00 : hora++;
		
		System.out.println(hora + " horas, " + min + " minutos, " + seg + " segundos.");
		
	}

}

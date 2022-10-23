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
		seg++;
		if(hora>=00 && hora<=24 && min>=00 && min>60 && seg>=0 && seg<60) {
	
			if (hora ==24 && min==60 && seg==60) {
				System.out.println("00:00:00");
			}

	}

		
		
	}
}

package ejercicios;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		//Declaramos variables.
		int hora; //Se guardará el número de horas que introduzca el usuario
		int min;
		int seg;
		Scanner read = new Scanner (System.in);
		System.out.println("Introduzca una cantidad de horas: ");
		hora = read.nextInt();
		System.out.println("Introduzca una cantidad de minutos: ");
		min= read.nextInt();
		System.out.println("Introduzca una cantidad de segundos: ");
		seg= read.nextInt();
		  if (seg >= 60 || seg < 0 && min >= 60 || min < 0 &&  hora >= 24 || hora < 0) {
			  System.out.println("Dato erróneo.");
		  }
		seg++;
		 if (seg == 60) {
	         seg = 0;
	         min++;
	     }
		 if (min == 60){
			 min = 0;
	         hora++;
		 }
		if (hora == 24){
	            hora = 0;
		}
		System.out.println(hora + ":" + min + ":" + seg);
	}
}


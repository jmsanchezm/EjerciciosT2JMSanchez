package ejercicios;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		double num1;
		double num2;
		int resultado;
		num1 = (Math.random()*99);
		num2= (Math.random()*99);
		Scanner read = new Scanner (System.in);
		System.out.print("¿Cuál es el resultado de la suma de estos dos números? "+ (int)num1 + " + " + (int)num2 + " = ");
		resultado= read.nextInt();
		if (resultado ==(int) num1+(int) num2) {
			System.out.println("RESULTADO CORRECTO");
		}else {
			System.out.println("RESULTADO ERRÓNEO.");
		}
	}

}

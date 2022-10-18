package ejercicios;

import java.util.Scanner;

public class ejercicios1 {

	public static void main(String[] args) {
		int num;
		int resto;
		int cociente;
		Scanner read = new Scanner (System.in);
		System.out.print("Introduzca un número comprendido entre 0 y 9999: ");
		num = read.nextInt();
		
		if (num>=0 && num<10) {
			System.out.println("El número es capicúa, ya que es de una cifra.");
		}
		if (num>=10 && num <100) {
			cociente= num/10;
			resto=num%10;
			if ((int)cociente == resto) {
				System.out.println("El número es capicúa.");
			}else {
				System.out.println("El número no es capicúa.");
			}	
		}else if (num>=100 && num <1000) {
				cociente = num/100;
				resto= num%10;
				if ((int)cociente == resto) {
					System.out.println("El número es capicúa.");
				}else {
					System.out.println("El número no es capicúa.");
				}
	
		}else if (num>=1000 && num<10000) {
			cociente = num/1000;
			resto= num%10;
			if ((int)cociente == resto) {
				System.out.println("El número es capicúa.");
			}else {
				System.out.println("El número no es capicúa.");
			}
		}else {
			System.out.println("El dato introducido es erróneo.");
		}
		read.close();
	}

}

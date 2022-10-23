package ejercicios;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		/*Se ha comprobado de forma en la que se ha introducido el valor correctamente y se ha
		  mostrado como resultado correcto. También se ha introducido intencionalmente un 
		  resultado erróneo  se nos ha mostrado que el resultado es incorrecto. Por tanto, 
		  el programa cumple con los requisitos del ejercicio.*/
		
		//Declaramos las variables.
		double num1;//Se guardará un valor al azar a través de Math.random()
		double num2;//Se guardará otro valor al azar a través de Math.random()
		int resultado; //Se guardará el posible resultado del usuario.
		
		/*Math.random, nos va a mostrar números comprendidos en el intervalo (0,1), por tanto,
		al multiplicalo por 99, disponemos de todos los valores hasta 99.*/
		num1 = (Math.random()*99);
		num2= (Math.random()*99);
		
		//Creamos el Scanner
		Scanner read = new Scanner (System.in);
		//Solicitamos al usuario el posible resultado, de los dos números al azar.
		//Como los números elegidos al azar tendrán decimales, le haremos cast para que se nos muestre sólo el número entero.
		System.out.print("¿Cuál es el resultado de la suma de estos dos números? "+ (int)num1 + " + " + (int)num2 + " = ");
		//Ordenamos al Scanner leer el teclado.
		resultado= read.nextInt();
		
		//Con un if, ponemos la condición de que si el resultado es correcto se le muestre como tal.
		if (resultado ==(int) num1+(int) num2) {
			System.out.println("RESULTADO CORRECTO");
		}else { //De lo contrario, se le muestre que el resultado es erróneo.
			System.out.println("RESULTADO ERRÓNEO.");
		
		//Finalmente, cerramos el Scanner.
		read.close();
		}
	}

}

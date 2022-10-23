package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*Al programas se le han hecho pruebas con números menores a los del descuento para,
		  comprobar si el cálculo del billete es correcto. Después se le han hecho pruebas
		  para los que se les aplica el descuento.En todas las pruebas efectuadas, cumplía
		  con su funmción, dando resultados correctos.*/
		
		//Declaramos variables y constantes.
		final double PRECIO_KM =2.5; //Declaramos esta constante para guardar el precio por km recorrido.
		int dias;//Se guardará los días de estancia.
		int kmViaje;//Se guardará los km de la distancia de un punto a otro.
		double billete;//Se guardará el precio del billete convencional.
		double descuento;//Se guardará el precio del billete con descuento aplicado.
		
		//Creamos el Scanner
		Scanner read = new Scanner (System.in);
		//Solicitamos al usuario la distancia de viaje.
		System.out.print("Introduzca la distancia del viaje: ");
		//Ordenamos al Scanner, leer el dato.
		kmViaje = read.nextInt();
		//Solicitamos al usuario los días de estancia.
		System.out.print("Introduzca los días de estancia: ");
		//Ordenamos al Scanner leer el teclado.
		dias = read.nextInt();
		
		//Para el cálculo del billete multiplicaremos el precio por la distancia entre los días.
		billete = (PRECIO_KM*kmViaje)/dias;
		
		/*Utilizamos un if, para poner la condición de que si los días y la distancia es menor, 
		se quede como el precio calculado anteriormente.*/
		if (kmViaje<800 && dias<7) {
			//Además mostraremos en pantalla el siguiente mensaje.
			System.out.println("El precio del billete será de " + billete + " euros.");
			//En caso de que no se cumpla esa condición.
		}else {
			//Se calculará la cantidad que se le descontará y se le aplicará al precio sin descuento
			descuento = billete*30/100;
			billete = billete-descuento;
			//Como resultado, se le mostrará en pantalla al usuario el siguiente mensaje.
			System.out.println("Al precio del billete se le aplicará un descuento del "
			+"30%, por tanto su billete costará " + billete + " euros.");
		}
		//Finalmente, cerramo el Scanner.
		read.close();
	}
}

package ejersisios;

import java.util.*;

public class Ejercicio04 {
	public static void main(String[] args) {
		Scanner all = new Scanner(System.in); //Abro scanner

		int num[] = new int[30]; //Creo una tabla llamada num con espacio 30, cada espacio tendrá un número al azar del 1 al 10.
		for (int pos=1;pos<=29;pos++) { 
		num[pos] = (int) (Math.random()*10);
		}
		
		Arrays.sort(num); //Esta instrucción ordenará de menor a mayor los números de la tabla.
		System.out.println(Arrays.toString(num)); //Imprimo el resultado.
		all.close(); //cierro scanner
}	
}

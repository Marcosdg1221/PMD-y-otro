package ejersisios;

import java.util.*;

public class Ejercicio07 {
	public static void main(String[] args) {
		Scanner all = new Scanner(System.in); // Abro scanner
		// TODO Auto-generated method stub

		int tabla[] = new int[6]; // Creo la tabla con espacio 6 y numeros aleatorios
		for (int i = 1; i < 6; i++) {
			tabla[i] = (int) (Math.random() * 49);
		}
		int ganador[] = new int[6]; // Creo la tabla con espacio 6 y numeros aleatorios
		for (int i = 0; i < 6; i++) {
			ganador[i] = (int) (Math.random() * 49);
		}
		Arrays.sort(ganador);
		System.out.println("Número ganador" + Arrays.toString(ganador)); //Imprimo el resultado.
		System.out.println("Tu número: " + Arrays.toString(tabla)); //Imprimo el resultado.
		for (int i = 1; i < 6; i++) {
			if(tabla[i] == ganador[i]) { //Digo en qué número a acertado
				System.out.println("Coincidiste en la posición " + i); 
			}
			else {
				System.out.println("No coincidiste en la posición " + i);
			}
			}
		}
		
	}
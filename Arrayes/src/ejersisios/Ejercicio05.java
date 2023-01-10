package ejersisios;

import java.util.*;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner all = new Scanner(System.in); //Abro scanner
		int jugadores[] = new int[8]; //Creo una tabla llamada jugadores, las cuales serán 8
		for (int pos=1;pos<8;pos++) {//Bucle que identifica la posición y la suma en 1 con cada vuelta hasta llegar a 8
		System.out.println("Introduce la puntuación del jugador " + pos);
		jugadores[pos]=all.nextInt();
		
		}
		Arrays.sort(jugadores); //Ordena la tabla
		Collections.reverse(Arrays.asList(jugadores));
		System.out.println("Orden de las puntuaciones de los jugadores: " + Arrays.toString(jugadores)); //Imprimo el resultado.
		all.close(); //cierro scanner

}
}
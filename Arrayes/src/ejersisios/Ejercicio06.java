package ejersisios;

import java.util.Scanner;

public class Ejercicio06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0; // ¿Aparece?
		int veces = 0; // ¿Cuantas veces aparece?
		Scanner all = new Scanner(System.in); // Abro scanner

		int tabla[] = new int[1000]; // Creo la tabla con espacio 1000 y numeros aleatorios
		for (int i = 1; i < 1000; i++) {
			tabla[i] = (int) (Math.random() * 100);
		}
		System.out.println("Introduzca un número para saber cuantas veces aparece");
		numero = all.nextInt(); // Se guarda ese nº

		for (int i = 1; i < 1000; i++) { // Si el nº coincide con el nº de la posición que toca, se suma uno las veces.
			if (tabla[i] == numero) {
				veces++;
			}
		}
		if (veces >= 1) { // Si veces es mayor igual que uno, se imprime que hay "veces"
			System.out.println("El número aparece " + veces + " veces");
		}
		// Si no, aviso de que no está ese nº
		else {
			System.out.println("El número no aparece");
		}
	}
}
package ejersisios;

import java.util.*;

public class Ejercicio03 {
	public static void main(String[] args) {
		Scanner all = new Scanner(System.in); //Abro scanner
		int num[] = new int[10]; //Creo una tabla llamada num con espacio 10.
		int numno[] = new int[10]; //Creo otra tabla llamada numno con espacio 10.
		System.out.println("Escriba un número");
		num[0] = all.nextInt(); //La primera posición de la tabla equivaldrá a lo que ponga el usuario
		for (int pos=1;pos<10;pos++) {
			System.out.println("Escriba otro número");
		num[pos] = all.nextInt(); //La posición que equivale de la tabla equivaldrá a lo que ponga el usuario
		}
		for (int pos=0;pos<10;pos++) {
			System.out.println("Escriba otro número");
		numno[pos] = all.nextInt(); //La posición que equivale de la tabla equivaldrá a lo que ponga el usuario
		}
		System.out.println(Arrays.toString(num)); //Imprime los números que está en la tabla num
		System.out.println(Arrays.toString(numno)); //Imprime los números que está en la tabla numno
		all.close();
}
}

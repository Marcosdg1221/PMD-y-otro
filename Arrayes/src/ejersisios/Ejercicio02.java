package ejersisios;

import java.util.*;

public interface Ejercicio02 {
	public static void main(String[] args) {
	Scanner all = new Scanner(System.in);
	double num[] = {};
	for (int posicion=1; posicion<11; posicion++){ //Bucle con otro bucle dentro para repetir tantas veces como corresponde el número.
		for (int n=posicion;n>0;n--) { //Resta uno cada vuelta ya que la posición es = n
	        Arrays.fill(num, posicion);
	        System.out.println(posicion);
	}	
	}
//Lo que tendrías que hacer
		int tabla[]=new int [55], inicio=0, fin;
		for (int i=1;i<=10;i++){
			fin=inicio+i;
		Arrays.fill(tabla, inicio, inicio+i,i);
		inicio=inicio+i;
		System.out.print(Arrays.toString(tabla));
	}
}
}

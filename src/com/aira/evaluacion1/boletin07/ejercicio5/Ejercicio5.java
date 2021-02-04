package Evaluacion1.boletin07.ejercicio5;

import java.util.Arrays;
import java.util.Collections;

/**
 * Muestra el número de mayor valor de un conjunto dado.
 * 
 * @author Aira
 */
public class Ejercicio5 {
	Integer[] numeros;
	
	public Ejercicio5(Integer[] numeros) {
		this.numeros = numeros;
	}
	
	public String comprobar() {
		Arrays.sort(numeros, Collections.reverseOrder());
		return String.format("%d es el mayor número", numeros[0]);
	}
}
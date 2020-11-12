package boletin7.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Aira
 */
public class Ejercicio1 {
	private int numero;
	
	public Ejercicio1(int numero) {
		this.numero = numero;
	}
	
	public String comprobarNumero() {
		if (numero >= 0) {
			return "El número introducido es positivo.";
		} else {
			return "El número introducido es negativo.";
		}
	}
}

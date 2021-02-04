package Evaluacion1.boletin07.ejercicio1;

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

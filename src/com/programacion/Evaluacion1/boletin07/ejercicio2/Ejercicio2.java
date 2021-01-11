package Evaluacion1.boletin07.ejercicio2;

/**
 *
 * @author Aira
 */
public class Ejercicio2 {
	private short s0;
	private short s1;
	
	public Ejercicio2(short s0, short s1) {
		this.s0 = s0;
		this.s1 = s1;
	}
	
	public String comprobar() {
		String resultado = "";

		if (s0 >= s1) {
			resultado += String.format("Resultado de la resta: %d \n", (s0 - s1));
		}

		resultado += String.format("Resultado de la suma: %d", (s0 + s1));

		return resultado;
	}	
}

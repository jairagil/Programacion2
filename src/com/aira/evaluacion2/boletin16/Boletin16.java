package evaluacion2.boletin16;

public class Boletin16 {
	public static void main(String[] args) {
		// ejercicio 1
		Ejercicio1 e1 = new Ejercicio1();
		e1.addNumeros();

		int[] e1Estadisticas = e1.getEstadisticas();

		System.out.printf("Números pares: %d, números negativos: %d", e1Estadisticas[0], e1Estadisticas[1]);
		System.out.println("");

		// ejercicio 2
		Ejercicio2 e2 = new Ejercicio2();
		e2.addAltura();
		System.out.printf("La altura media es de: %.2f", e2.getAlturaMedia());
		System.out.println("");

		// ejercicio 3
		Ejercicio3 e3 = new Ejercicio3();
		e3.dividirTexto();
		e3.unirTexto();

		// ejercicio 4
		Ejercicio4 e4 = new Ejercicio4("javeros");
		e4.transformarMinuscula();
	}
}

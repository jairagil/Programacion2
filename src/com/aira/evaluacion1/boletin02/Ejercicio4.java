package evaluacion1.boletin02;

public class Ejercicio4 {
	public static void main(String[] args) {
		operar( 10, 3);
	}

	static void operar(int n1, int n2) {
		int suma = n1 + n2;
		int resta = n1 - n2;
		int producto = n1 * n2;
		float cociente = (float)n1/n2;

		System.out.printf("Suma: %d \nResta: %d \nProducto: %d \nCociente: %f \n", suma, resta, producto, cociente);
	}
}

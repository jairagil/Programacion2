package evaluacion1.boletin03;

public class Ejercicio5 {
	public static void main(String[] args) {
		calcularSueldo( 900, 100, 300, 7);
	}

	static void calcularSueldo(float fijo, int ventas, int kilometros, int dias) {
		float result = (fijo + (ventas * 0.05f) + (kilometros * 2.0f) + (dias * 30.0f));
		result -= (result * 0.18f) - 36;

		System.out.printf("El total a percibir es %.2f \n", result);
	}
}

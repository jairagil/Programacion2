package evaluacion1.boletin02;

public class Ejercicio1 {
	public static void main(String[] args) {
		calcularAreaTriangulo(6.0f, 2.5f);
	}

	static void calcularAreaTriangulo(float base, float altura) {
		float area = base * altura / 2;

		System.out.printf("El area es de %.2f \n", area);
	}
}

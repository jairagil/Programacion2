package Evaluacion1.boletin02;

public class Ejercicio5 {
	public static void main(String[] args) {
		convertirMillasMetros(3.141592f);
	}

	static void convertirMillasMetros(float millas) {
		final int FACTOR_CONVERSION = 1852;
		float metros = millas * FACTOR_CONVERSION;

		System.out.printf("%f millas marinas son %f metros \n", millas, metros);
	}
}

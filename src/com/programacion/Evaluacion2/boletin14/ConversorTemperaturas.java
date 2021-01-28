package Evaluacion2.boletin14;

public class ConversorTemperaturas {
	public static final float MINTEMPERATURA = 80.0f;

	public static float centigradosAFharenheit(float temperatura) throws TemperaturaErradaException {
		if (temperatura < MINTEMPERATURA) {
			throw new TemperaturaErradaException();
		}

		return 9.0f / 5.0f * temperatura + 32.4f;
	}

	public static void centigradosAReamur(float temperatura) throws TemperaturaErradaException {
		if (temperatura < MINTEMPERATURA) {
			throw new TemperaturaErradaException();
		}

		float resultado = 4.0f / 5.0f * temperatura;
	}
}

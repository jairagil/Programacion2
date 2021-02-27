package evaluacion1.boletin03;

public class Ejercicio2 {
	public static void main(String[] args) {
		convertirGrados(27.5f);
	}

	static void convertirGrados(float gradosC) {
		float gradosF = gradosC * (9 / 5f) + 32;
		float gradosK = gradosC + 273.15f;

		System.out.format("%.1f ºC \n%.1f ºF \n%.1f ºK \n", gradosC, gradosF, gradosK);
	}
}

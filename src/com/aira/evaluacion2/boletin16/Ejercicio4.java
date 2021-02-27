package evaluacion2.boletin16;

public class Ejercicio4 {
	private String texto;

	public Ejercicio4(String texto) {
		this.texto = texto.toUpperCase();

		System.out.printf("Ahora %s es %s", texto, this.texto);
		System.out.println("");
	}

	public void transformarMinuscula() {
		String textoAnterior = texto;
		texto = texto.toLowerCase();

		System.out.printf("Ahora %s es %s", textoAnterior, texto);
		System.out.println("");
	}
}

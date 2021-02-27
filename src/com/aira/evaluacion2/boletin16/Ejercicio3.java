package evaluacion2.boletin16;

public class Ejercicio3 {
	private String texto = "www.javadesde0.com";
	private String[] textoArray;

	public void dividirTexto() {
		textoArray = new String[] {
				texto.substring(0, 8),
				texto.substring(8, texto.length()),
		};

		texto = "";

		System.out.printf("El texto se ha dividido en %s y %s", textoArray[0], textoArray[1]);
		System.out.println("");
	}

	public void unirTexto() {
		if (texto.length() == 0) {
			for (String linea : textoArray) {
				texto += linea;
			}
		}

		System.out.printf("El texto se ha unido, formando %s", texto);
		System.out.println("");
	}
}

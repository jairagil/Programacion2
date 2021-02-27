package evaluacion2.boletin18;

public class Boletin18 {
	public static void main(String[] args) {
		// creamos el buzón
		Buzon buzon = new Buzon();

		// creamos correos
		for (int i = 0; i < 10; i++) {
			Correo correo = new Correo(String.format("Contenido del correo %d", i));
			buzon.agregar(correo);
		}

		System.out.println(buzon.amosarPrimeroNoLeido());
		System.out.println(buzon.amosarPrimeroNoLeido());
		System.out.println(buzon.amosarPrimeroNoLeido());
		System.out.println(buzon.amosarPrimeroNoLeido());

	}
}
package evaluacion2.boletin17;

public class Boletin17 {
	public static void main(String[] args) {
		/*
		* TODO
		*  - Ver fallo al liberia.mostrarLibros()
		* */

		// creamos la librería
		Libreria libreria = new Libreria();

		// creamos unos cuantos libros
		Libro[] libros = {
				new Libro("J. K. Rowling", "9780747532743", 8.99f, "Harry Potter y la Piedra Filosofal", 10),
				new Libro("Karl Marx, Friedrich Engels", "9780393025354", 8.99f, "Manifiesto del Partido Comunista", 1),
				new Libro("Dmitry Glukhovsky", "9780575086258", 12.99f, "Metro 2033", 3),
				new Libro("Dmitry Glukhovsky", "9781473204300", 12.99f, "Metro 2034", 0),


		};

		// agregamos los libros a la librería
		for (Libro libro: libros) {
			libreria.agregarLibro(libro);
		}


	}
}

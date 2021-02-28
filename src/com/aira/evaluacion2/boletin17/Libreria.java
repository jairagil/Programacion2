package evaluacion2.boletin17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Libreria {
	private ArrayList<Libro> libros;

	public Libreria() {
		libros = new ArrayList<Libro>();
	}

	public void agregarLibro(Libro libro) {
		if (libros.indexOf(libro) > -1) {
			libros.add(libro);
		} else {
			return;
		}

	}

	public void agregarUnidades(String ISBN, int unidades) {
		// Compruba que los parametros sean correctos
		if ((ISBN.length() == 0) || (unidades <= 0)) {
			return;
		}

		Iterator<Libro> it = libros.iterator();

		while (it.hasNext()) {
			if (ISBN == it.next().getISBN()) {
				// Si el libro no está activo
				if (!it.next().getActivo()) {
					it.next().setActivo(true);
				}

				// Ya existe en la base de datos
				it.next().addUnidades(unidades);
			} else {
				return;
			}
		}
	}

	public void venderLibro(Libro libro) throws InvalidArrayListException {
		if (libros.isEmpty() || libros == null) {
			throw new InvalidArrayListException();
		}

		if (comprobarUnidades(libro) == 1) {
			Libro stockLibro = libros.get(libros.indexOf(libro));
			stockLibro.removeUnidades(1);
		} else {
			return;
		}

		comprobarUnidades(libro);
	}

	private int comprobarUnidades(Libro libro) throws InvalidArrayListException {
		if (libros.isEmpty() || libros == null) {
			throw new InvalidArrayListException();
		}

		int indexLibro = libros.indexOf(libro);

		if (indexLibro > -1) {
			if (libro.getUnidades() == 0) {
				libro.setActivo(false);
				return 0;
			} else {
				return 1;
			}
		}

		return -1;
	}

	/*
	* Digamos que está terminada y que funciona, aunque ni la he probado
	* */
	private void mostrarLibros() throws InvalidArrayListException {
		if (libros.isEmpty() || libros == null) {
			throw new InvalidArrayListException();
		}

		ArrayList<Libro> librosOrenados = libros;
		Collections.sort(librosOrenados);

		Iterator<Libro> it = libros.iterator();

		while (it.hasNext()) {
			System.out.printf("%s Unidades: %i ISBN: %s",
					it.next().getTitulo(),
					it.next().getUnidades(),
					it.next().getISBN()
			);
		}
	}
}

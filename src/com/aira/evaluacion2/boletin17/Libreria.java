package evaluacion2.boletin17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Libreria {
	private ArrayList<Libro> libros;

	public Libreria() {
		libros = new ArrayList<Libro>();
	}

	/**
	 * Permite agregar un libro a la lista.
	 *
	 * @param libro libro a añadir.
	 */
	public void agregarLibro(Libro libro) {
		if (libros.indexOf(libro) > -1) {
			libros.add(libro);
		} else {
			return;
		}

	}

	/**
	 * Permite agregar unidades a un libro ya existente.
	 *
	 * @param isbn el ISBN del libro.
	 * @param unidades unidades a agregar.
	 */
	public void agregarUnidades(String isbn, int unidades) {
		// Compruba que los parametros sean correctos
		if ((isbn.length() == 0) || (unidades <= 0)) {
			return;
		}

		Iterator<Libro> it = libros.iterator();

		while (it.hasNext()) {
			if (isbn == it.next().getISBN()) {
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

	/**
	 * Permite vender un libro, una unidad.
	 *
	 * @param libro libro a vender.
	 */
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

	/**
	 * Comprueba si quedan unidades de un libro concreto, de lo contrario lo da de baja.
	 *
	 * @param libro libro a comprobar.
	 */
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

	/**
	 * Muestra los libros activos
	 */
	public void mostrarLibros() throws InvalidArrayListException {
		if (libros.isEmpty() || libros == null) {
			throw new InvalidArrayListException();
		}

		ArrayList<Libro> librosOrenados = libros;
		Collections.sort(librosOrenados);

		Iterator<Libro> it = libros.iterator();

		while (it.hasNext()) {
			if (it.next().getActivo()) {
				System.out.printf("%s Unidades: %i ISBN: %s",
						it.next().getTitulo(),
						it.next().getUnidades(),
						it.next().getISBN()
				);
			}
		}
	}
}

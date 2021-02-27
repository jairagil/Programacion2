package evaluacion2.boletin17;

public class Libro implements Comparable<Libro>{
	private String autor;
	private String ISBN;
	private float precio;
	private String titulo;
	private int unidades;
	private Boolean activo;

	public Libro(String autor, String ISBN, float precio, String titulo, int unidades) {
		this.autor = autor;
		this.ISBN = ISBN;
		this.precio = precio;
		this.titulo = titulo;
		this.unidades = unidades;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public String getAutor() {
		return autor;
	}

	public String getISBN() {
		return ISBN;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void addUnidades(int unidades) {
		this.unidades += unidades;
	}

	public int getUnidades() {
		return unidades;
	}

	public void removeUnidades(int unidades) {
		this.unidades -= unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	@Override
	public int compareTo(Libro libro) {
		return this.titulo.compareTo(libro.titulo);
	}
}

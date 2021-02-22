package evaluacion1.boletin04;

public class Libro {
	private int ano;
	private String autor;
	private short numPaginas;
	private String titulo;
	private float valoracion;

	public Libro() {

	}

	public Libro(int newAno, String newAutor, short newNumPaginas, String newTitulo) {
		ano = newAno;
		autor = newAutor;
		numPaginas = newNumPaginas;
		titulo = newTitulo;
	}

	// get & set ano
	public int getAno()
	{
		return ano;
	}

	public void setAno(int newAno) {
		ano = newAno;
	}

	// get & set autor
	public String getAutor() {
		return autor;
	}

	public void setAutor(String newAutor) {
		autor = newAutor;
	}

	// get & set numPaginas
	public short getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(short newNumPaginas) {
		numPaginas = newNumPaginas;
	}

	// get & set titulo
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String newTitulo) {
		titulo = newTitulo;
	}

	public void amosar() {
		System.out.printf("%s, escrito por %s en %d con un total de %s páginas. \n", titulo, autor, ano, numPaginas);
	}

}

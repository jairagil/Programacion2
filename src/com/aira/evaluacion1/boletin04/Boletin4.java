package Evaluacion1.boletin04;

public class Boletin4 {
	public static void main(String[] args) {
		Libro libroUno = new Libro();

		libroUno.setAno(1872);
		libroUno.setAutor("Karl Marx y Friedrich Engels");
		libroUno.setNumPaginas((short)130);
		libroUno.setTitulo("Manifiesto del Partido Comunista");

		libroUno.amosar();
	}
}

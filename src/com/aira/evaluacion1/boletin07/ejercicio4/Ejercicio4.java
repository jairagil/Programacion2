package evaluacion1.boletin07.ejercicio4;

/**
 *
 * @author Aira
 */
public class Ejercicio4 {
	private String nombre0;
	private float peso0;
	private String nombre1;
	private float peso1;
	
	public Ejercicio4(String nombre0, float peso0, String nombre1, float peso1) {
		this.nombre0 = nombre0;
		this.peso0 = peso0;
		
		this.nombre1 = nombre1;
		this.peso1 = peso1;
	}
	
	public String comprobar() {
		if (peso0 > peso1) {
			return String.format("%s pesa %.2fkg más que %s", nombre0, (peso0 - peso1), nombre1);
		} else if (peso0 == peso1) {
			return "Ambos pesan lo mismo";
		} else {
			return String.format("%s pesa %.2fkg más que %s", nombre1, (peso1 - peso0), nombre0);
			
		}
	}
}
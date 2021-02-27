package evaluacion2.boletin18;

public class Correo {
	private String contenido;
	private Boolean leido;

	public Correo(String contenido) {
		this.leido = false;

		this.contenido = contenido;
	}

	public String getContenido() {
		return contenido;
	}

	public Boolean getLeido() {
		return leido;
	}

	public void setLeido(Boolean leido) {
		this.leido = leido;
	}
}

package evaluacion2.boletin18;

import java.util.ArrayList;
import java.util.Iterator;

public class Buzon {
	ArrayList<Correo> correos;

	public Buzon() {
		correos = new ArrayList<Correo>();
	}

	/*
	* -> DONE
	* */
	public int numeroDeCorreos() {
		return correos.size();
	}

	/*
	* -> DONE
	* */
	public void agregar(Correo correo) {
		correos.add(correo);
	}

	/*
	* -> DONE
	* */
	public Boolean porLeer() {
		Iterator<Correo> it = correos.iterator();

		while (it.hasNext()) {
			if(!it.next().getLeido()) {
				return true;
			}
		}

		return false;
	}

	/*
	* TODO
	*  - Manejar desde donde se llame que al devolver una String vacia diga que todo ha sido leido
	* */
	public String amosarPrimeroNoLeido() {
		Iterator<Correo> it = correos.iterator();

		while (it.hasNext()) {
			Correo correo = it.next();

			if (!correo.getLeido()) {

			}
		}

		return "";
	}

	public String amosar(int indice) {
		if (correos.size() >= indice) {
			return correos.get(indice).getContenido();
		}

		return "";
	}

	public void eliminar(int indice) {
		if (correos.size() >= indice) {
			correos.remove(indice);
		}
	}
}

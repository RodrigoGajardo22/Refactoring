package ar.unrn.eje1;
/*Clase abstacta, para eviatar duplicar codigo.
 * Las instancias solo seran objetos que implementen la clase Libro.
 */

public abstract class Libro {

	protected String nombre;

	public String nombre() {
		return nombre;
	}

	public abstract float calculoDeMiAlquiler(int diasAlquilados);

	public abstract boolean alquilerFrecuente(int diasAlquilados);

}

package ar.unrn.eje1;

public class NuevoLanzamiento extends Libro {

	public NuevoLanzamiento(String nombre) {

		super();
		this.nombre = nombre;

	}

	public float calculoDeMiAlquiler(int diasAlquilados) {

		return diasAlquilados * 3;
	}

	public boolean alquilerFrecuente(int diasAlquilados) {
		return diasAlquilados > 1;
	}

}

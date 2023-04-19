package ar.unrn.eje1;

public class NuevoLanzamiento extends Libro {

	public NuevoLanzamiento(String nombre) {

		super();
		this.nombre = nombre;

	}

	public float calculoDeMiAlquiler(int diasAlquilados) {

		return diasAlquilados * 3;
	}

	public int puntos(int diasAlquilados) {
		if (diasAlquilados > 1) {
			return 1;
		}
		return 0;

	}

}

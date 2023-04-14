package ar.unrn.eje1;

public class Infantiles extends Libro {

	public Infantiles(String nombre) {

		super();
		this.nombre = nombre;

	}

	public float calculoDeMiAlquiler(int diasAlquilados) {

		if (diasAlquilados > 2)
			return (float) (((float) (diasAlquilados - 3)) * 1.5);
		return 1.5f;
	}

	public boolean frecuente(int diasAlquilados) {
		return false;
	}

}
package ar.unrn.eje1;

public class Regulares extends Libro {

	public Regulares(String nombre) {

		super();
		this.nombre = nombre;

	}

	public float calculoDeMiAlquiler(int diasAlquilados) {

		if (diasAlquilados > 2)
			return (float) (((float) (diasAlquilados - 2)) * 1.5) + 2;
		return 2;
	}

	public boolean frecuente(int diasAlquilados) {
		return false;
	}

}

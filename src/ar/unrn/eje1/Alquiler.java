package ar.unrn.eje1;

public class Alquiler {
	private int   diasAlquilados;
	private Libro libro;

	public Alquiler(Libro libro, int diasAlquilados) {
		this.libro          = libro;
		this.diasAlquilados = diasAlquilados;
	}

	public float calcularCostoDealquiler() {
		return this.libro.calculoDeMiAlquiler(diasAlquilados);
	}

	public int puntos() {

		return libro.puntos(diasAlquilados);
	}
}

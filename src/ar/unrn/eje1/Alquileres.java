package ar.unrn.eje1;

import java.util.ArrayList;
import java.util.List;

public class Alquileres {

	private List<Alquiler> listaDeAlquileres;

	public Alquileres() {
		this.listaDeAlquileres = new ArrayList<Alquiler>();
	}

	public void alquilar(Alquiler alquiler) {
		listaDeAlquileres.add(alquiler);

	}

	public float cacularValorDeAlquileres() {
		float valor = 0f;
		for (Alquiler alquiler : listaDeAlquileres) {
			valor += alquiler.calcularCostoDealquiler();
		}
		return valor;
	}

	public int calcularPuntos() {
		int puntos = 0;
		for (Alquiler alquiler : listaDeAlquileres) {
			if (alquiler.libroFrecuente()) {
				puntos++;
			}
		}
		return puntos;
	}

}

package ar.unrn.eje3;

import java.util.List;

public class Gastos {

	private List<TipoDeGasto> lista;

	public Gastos(List<TipoDeGasto> lista) {
		this.lista = lista;
	}

	public String detalles() {
		String detalle = "";

		for (TipoDeGasto tipo : lista) {

			int monto = tipo.monto();

			detalle += "" + tipo.nombre() + "  $" + tipo.monto() + " " + tipo.seExcedio(monto);
		}

		return detalle;
	}

	public int gastoTotal() {

		int total = 0;

		for (TipoDeGasto tipo : lista) {
			total += tipo.monto();
		}

		return total;

	}

	public int gastosDeComida() {

		int total = 0;

		for (TipoDeGasto tipo : lista) {
			total += tipo.valorComida();
		}

		return total;

	}

}

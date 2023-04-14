package ar.unrn.eje3;

public class ReporteDeGastos {

	ProvedorDeFecha fecha;

	public ReporteDeGastos(ProvedorDeFecha fecha) {
		this.fecha = fecha;
	}

	public String datelleDeGastos(Gastos gasto) {

		String detalle = "Fecha: " + fecha.fecha();

		detalle += "\n\nDetalles: \n";
		detalle += gasto.detalles();

		detalle += "\n\nMonto de comida: $";
		detalle += gasto.gastosDeComida();

		detalle += "\n\nMonto total: $";
		detalle += gasto.gastoTotal();

		return detalle;
	}

}

package ar.unrn.eje3;

import java.time.LocalDate;

public class ProvedorDeFecha {

	private LocalDate fecha;

	public ProvedorDeFecha() {
		fecha = LocalDate.now();
	}

	public LocalDate fecha() {
		return fecha;
	}

}

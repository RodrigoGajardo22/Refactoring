package ar.unrn.eje3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		TipoDeGasto c1, c2, c3, a1, a2;

		c1 = new Desayuno(100);
		c2 = new Desayuno(200);
		c3 = new Desayuno(300);

		a1 = new AlquilerDeAuto(1000);
		a2 = new AlquilerDeAuto(2000);

		ProvedorDeFecha   fecha = new ProvedorDeFecha();

		List<TipoDeGasto> lista = new ArrayList();
		lista.add(a1);
		lista.add(a2);
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);

		Gastos          gasto   = new Gastos(lista);

		ReporteDeGastos reporte = new ReporteDeGastos(fecha);

		System.out.println(reporte.datelleDeGastos(gasto));
	}

}

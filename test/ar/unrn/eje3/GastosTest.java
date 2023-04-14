package ar.unrn.eje3;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class GastosTest {

	TipoDeGasto     desayuno1 = new Desayuno(100);
	TipoDeGasto     desayuno2 = new Desayuno(200);

	TipoDeGasto     cena1     = new Cena(300);
	TipoDeGasto     cena2     = new Cena(400);
	TipoDeGasto     cena3     = new Cena(500);

	TipoDeGasto     alquiler1 = new AlquilerDeAuto(1000);
	TipoDeGasto     alquiler2 = new AlquilerDeAuto(2000);

	ProvedorDeFecha fecha     = new ProvedorDeFecha();

	@Test
	public void testDetalle() {
		List<TipoDeGasto> lista = new ArrayList<TipoDeGasto>();

		lista.add(alquiler1);

		Gastos gasto = new Gastos(lista);

		// Testeo

		String str   = "Alquiler de auto  $1000 ";
		// Verificacion

		Assert.assertEquals(str, gasto.detalles());

	}

	@Test
	public void testGastoTotal() {

		List<TipoDeGasto> lista = new ArrayList<TipoDeGasto>();

		lista.add(alquiler1);
		lista.add(alquiler2);
		lista.add(desayuno1);
		lista.add(desayuno2);
		lista.add(cena1);
		lista.add(cena2);
		lista.add(cena3);

		Gastos gasto = new Gastos(lista);

		int    total = 4500;

		Assert.assertEquals(total, gasto.gastoTotal());

	}

	@Test
	public void gastosDeComida() {

		List<TipoDeGasto> lista = new ArrayList<TipoDeGasto>();

		lista.add(alquiler1);
		lista.add(alquiler2);
		lista.add(desayuno1);
		lista.add(desayuno2);
		lista.add(cena1);
		lista.add(cena2);
		lista.add(cena3);

		Gastos gasto = new Gastos(lista);

		int    total = 1500;

		Assert.assertEquals(total, gasto.gastosDeComida());

	}
}

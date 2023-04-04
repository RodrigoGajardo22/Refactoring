package ar.unrn.eje1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AlquilerTest {

	Libro    elTunel             = new Regulares("El Tunel");
	Libro    antesDelFin         = new Regulares("Antes del Fin");
	// Las copias son innecesarias.
	// CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
	// CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
	Alquiler alquilerElTunel     = new Alquiler(elTunel, 5);
	Alquiler alquilerAntesDelFin = new Alquiler(antesDelFin, 3);
	Cliente  yo                  = new Cliente("Javier");

	@Test

	public void testCalculo() {

		yo.alquilar(alquilerElTunel);
		yo.alquilar(alquilerAntesDelFin);

		float[] resultado = yo.calcularDeudaYPuntosObtenidos();

		assertTrue(resultado[0] == 10.0);
		assertTrue(resultado[1] == 0);
	}

}

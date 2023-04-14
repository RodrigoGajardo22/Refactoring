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

	public void testRegulares() {

		yo.alquilar(alquilerElTunel);
		yo.alquilar(alquilerAntesDelFin);

		float[] resultado = yo.calcularDeudaYPuntosObtenidos();

		assertTrue(resultado[0] == 10.0); // Valor
		assertTrue(resultado[1] == 0); // puntos
	}

	@Test

	public void testNuevosLanzamientos() {

		Libro    libro1    = new NuevoLanzamiento("Lo que el viento se llevo");
		Libro    libro2    = new NuevoLanzamiento("Harry Potter");
		Libro    libro3    = new NuevoLanzamiento("Mi pobre Angelito");
		Alquiler alquiler1 = new Alquiler(libro1, 5);
		Alquiler alquiler2 = new Alquiler(libro2, 3);
		Alquiler alquiler3 = new Alquiler(libro3, 1);                          // NO suma puntos.
		Cliente  yo        = new Cliente("Rodrigo");

		yo.alquilar(alquiler1);
		yo.alquilar(alquiler2);
		yo.alquilar(alquiler3);

		float[] resultado = yo.calcularDeudaYPuntosObtenidos();

		assertTrue(resultado[0] == 27.0); // Valor
		assertTrue(resultado[1] == 2); // Puntos

	}

	@Test

	public void testInfantiles() {

		Libro    libro1    = new Infantiles("Matrix");
		Libro    libro2    = new Infantiles("Terminator");
		Alquiler alquiler1 = new Alquiler(libro1, 5);
		Alquiler alquiler2 = new Alquiler(libro2, 3);
		Cliente  yo        = new Cliente("Juan");

		yo.alquilar(alquiler1);
		yo.alquilar(alquiler2);

		float[] resultado = yo.calcularDeudaYPuntosObtenidos();

		assertTrue(resultado[0] == 3.0);// Valor
		assertTrue(resultado[1] == 0); // Puntos

	}

}

package ar.unrn.eje1;

public class Main {
	public static void main(String args[]) {
		Libro    elTunel             = new Regulares("El Túnel");
		Libro    antesDelFin         = new Regulares("Antes del Fin");
		// CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
		// CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
		Alquiler alquilerElTunel     = new Alquiler(elTunel, 5);
		Alquiler alquilerAntesDelFin = new Alquiler(antesDelFin, 3);
		Cliente  yo                  = new Cliente("Javier");
		yo.alquilar(alquilerElTunel);
		yo.alquilar(alquilerAntesDelFin);
		float[] resultado = yo.calcularDeudaYPuntosObtenidos();
		System.out.println(resultado[0]);
		System.out.println(resultado[1]);
	}
}
package ar.unrn.eje3;

public class AlquilerDeAuto extends TipoDeGasto {

	public AlquilerDeAuto(int gasto) {
		super(gasto);
	}

	@Override
	public String nombre() {
		return "Alquiler de auto";
	}

	@Override
	public String seExcedio(int monto) {
		return "";
	}

	@Override
	public int valorComida() {
		return 0;
	}

}

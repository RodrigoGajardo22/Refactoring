package ar.unrn.eje3;

public class Cena extends TipoDeGasto {

	public Cena(int monto) {
		super(monto);
	}

	@Override
	public String nombre() {
		return "Cena";
	}

	@Override
	public String seExcedio(int monto) {
		return monto > 5000 ? "X" : " ";
	}

	@Override
	public int valorComida() {
		return this.monto;
	}

}

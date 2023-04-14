package ar.unrn.eje3;

public abstract class TipoDeGasto {

	protected int monto;

	public TipoDeGasto(int monto) {

		this.monto = monto;
	}

	public int monto() {
		return this.monto;
	}

	public abstract String nombre();

	public abstract String seExcedio(int monto);

	public abstract int valorComida();

}

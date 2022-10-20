package model;

public abstract class InmuebleLocal extends Inmueble {
	private boolean isDentro;

	public InmuebleLocal(int id, int area, String direccion, int valorMetroCuadrado, boolean isDentro) {
		super(id, area, direccion, valorMetroCuadrado);
		this.isDentro = isDentro;
	}
}


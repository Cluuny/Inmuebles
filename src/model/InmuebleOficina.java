package model;

public class InmuebleOficina extends InmuebleLocal {
	private boolean isGobierno;

	public InmuebleOficina(int id, int area, String direccion, int valorMetroCuadrado, boolean isDentro,
			boolean isGobierno) {
		super(id, area, direccion, valorMetroCuadrado, isDentro);
		this.isGobierno = isGobierno;
	}

	@Override
	public int compareTo(Inmueble inmueble) {
		// decendente
		if(this.valorCompra() > inmueble.valorCompra()) {
			return -1;
		} else if(this.valorCompra() < inmueble.valorCompra()) {
			return 1;
		} else {
			return 0;
		}
	}
}

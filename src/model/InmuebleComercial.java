package model;

public class InmuebleComercial extends InmuebleLocal {
	private String establecido;

	public InmuebleComercial(int id, int area, String direccion, int valorMetroCuadrado, boolean isDentro,
			String establecido) {
		super(id, area, direccion, valorMetroCuadrado, isDentro);
		this.establecido = establecido;
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

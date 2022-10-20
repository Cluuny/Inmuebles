package model;

public class ApartamentoEstudio extends Apartamento {
	private final static int NUM_HABITACIONES = 1;

	public ApartamentoEstudio(int id, int area, String direccion, int valorMetroCuadrado, int numeroBanos) {
		super(id, area, direccion, valorMetroCuadrado, NUM_HABITACIONES, numeroBanos);
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

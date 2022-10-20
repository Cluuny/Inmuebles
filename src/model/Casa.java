package model;

public class Casa extends InmuebleVivienda {
	public Casa(int id, int area, String direccion, int valorMetroCuadrado, int numeroHabitaciones, int numeroBanos) {
		super(id, area, direccion, valorMetroCuadrado, numeroHabitaciones, numeroBanos);
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


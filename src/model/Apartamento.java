package model;

public abstract class Apartamento extends InmuebleVivienda {

	public Apartamento (int id, int area, String direccion, int valorMetroCuadrado, int numeroHabitaciones, int numeroBanos) {
		super(id, area, direccion, valorMetroCuadrado, numeroHabitaciones, numeroBanos);
	}

}

package model;

public abstract class InmuebleVivienda extends Inmueble {
	private int numeroHabitaciones;
	private int numeroBanos;

	public InmuebleVivienda(int id, int area, String direccion, int valorMetroCuadrado, int numeroHabitaciones, int numeroBanos) {
		super(id, area, direccion, valorMetroCuadrado);
		this.numeroHabitaciones = numeroHabitaciones;
		this.numeroBanos = numeroBanos;
	}

	public int getNumeroHabitaciones() {
		return numeroHabitaciones;
	}

	public void setNumeroHabitaciones(int numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}

	public int getNumeroBanos() {
		return numeroBanos;
	}

	public void setNumeroBanos(int numeroBanos) {
		this.numeroBanos = numeroBanos;
	}

	//public int valorCompra() {
		//return super.valorCompra() + (numeroHabitaciones * 100000) + (numeroBanos * 50000);
	//}
}

package model;

public class ApartamentoFamiliar extends Apartamento {
	private int cuotaAdministracion;

	public ApartamentoFamiliar(int id, int area, String direccion, int valorMetroCuadrado, int numeroHabitaciones, int numeroBanos, int cuotaAdministracion) {
		super(id, area, direccion, valorMetroCuadrado, numeroHabitaciones, numeroBanos);
		this.cuotaAdministracion = cuotaAdministracion;
	}

	public int getCuotaAdministracion() {
		return cuotaAdministracion;
	}

	public String pagarCuotaAdministracioin() {
		return "Se ha pagado la cuota de administración";
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

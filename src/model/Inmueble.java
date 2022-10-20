package model;

import java.lang.Comparable;

public abstract class Inmueble implements Comparable<Inmueble> {
	private int id;
	private int area;
	private String direccion;
	private int valorMetroCuadrado;

	public Inmueble(int id, int area, String direccion, int valorMetroCuadrado) {
		this.id = id;
		this.area = area;
		this.direccion = direccion;
		this.valorMetroCuadrado = valorMetroCuadrado;
	}

	public int getId() {
		return this.id;
	}
	public int getArea() {
		return this.area;
	}
	public String getDireccion() {
		return this.direccion;
	}
	public int getValorMetroCuadrado() {
		return this.valorMetroCuadrado;
	}

	public int valorCompra() {
		return area * valorMetroCuadrado;
	}

	public String toString() {
		return "Id: " + id + ", Area: " + area + ", Direccion: " + direccion + ", Valor Metro Cuadrado: " + valorMetroCuadrado + "\n Valor Total: " + area*valorMetroCuadrado + "\n______________________________________________________\n";
	}

}


package com.maquinaVending.TW004_Vending;

public class Venta {
	private int id;
	private int cant;
	private double precio;
	private double cambios;
	private Refresco refresco;
	
	public Venta(int id, int cant, double precio, double cambios, Refresco refresco) {
		super();
		this.id = id;
		this.cant = cant;
		this.precio = precio*cant;
		this.cambios = cambios;
		this.refresco = refresco;
	}
	public int getId() {
		return id;
	}
	public int getCant() {
		return cant;
	}
	public double getPrecio() {
		return precio;
	}
	public double getCambios() {
		return cambios;
	}
	public Refresco getRefresco() {
		return refresco;
	}
	@Override
	public String toString() {
		return "Venta [cant=" + cant + ", precio=" + precio + ", cambios=" + cambios + ", refresco="
				+ refresco + "]";
	}
	
	
}

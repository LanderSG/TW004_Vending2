package com.maquinaVending.TW004_Vending;

public class Refresco {
	private int id;
	private String nombre;
	private double precio;
	private int cantidad;
	
	public Refresco(int id, String nombre, double precio, int cantidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}	
	
	public boolean ComprobarActualizarCantidad(int cant) {
		boolean confirmar=true;
		
		if(this.cantidad < cant || cant==0) {
			confirmar=false;
		}else {
			this.cantidad-=cant;
		}
		
		return confirmar;
	}

	@Override
	public String toString() {
		return "Refresco [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}

}

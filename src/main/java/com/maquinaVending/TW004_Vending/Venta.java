package com.maquinaVending.TW004_Vending;

import java.util.ArrayList;

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
	
	public static void generarInformes(ArrayList<Venta> informeVentas) {
		System.out.println("Has escogido: Generar Informes");
		if(informeVentas.size()>0) {
			for (int i = 0; i < informeVentas.size(); i++) {
				System.out.println("\tInforme " + i + ": \t" + informeVentas.get(i));
			}
		}else {
			System.out.println("Actualmente no hay informes");
		}
	}

	
}

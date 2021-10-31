package com.maquinaVending.TW004_Vending;

import java.util.ArrayList;

public class Maquina {
	private int id;
	private double dinero;
	private boolean estado;
	private ArrayList<Refresco> listaRefrescos;
	
	public Maquina(int id, double dinero, boolean estado, ArrayList<Refresco> listaRefrescos) {
		super();
		this.id = id;
		this.dinero = dinero;
		this.estado = estado;
		this.listaRefrescos = listaRefrescos;
	}
	
	public double getDinero() {
		return dinero;
	}
	
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}


	public Venta hacerCompra(Cliente client, Refresco refresco, ArrayList<Venta> listaVentas) {
		double vueltas;
		Venta venta = null;
		System.out.println("Has escogido " + refresco.getNombre() + "\n");
		System.out.println("\t¿Cantidad de refrescos? " + client.getCantUsu());
		if(refresco.ComprobarActualizarCantidad(client.getCantUsu())) {
			System.out.println("\tDebes ingresar: " + (refresco.getPrecio()*client.getCantUsu()));
			
			System.out.println("\tHas ingresado: " + client.getDineroUsu());
			vueltas = client.getDineroUsu() - (refresco.getPrecio()*client.getCantUsu());
			
			System.out.println("\tSus vueltas: " + vueltas + "\n");
			this.setDinero(this.getDinero()-vueltas);
			
			venta = new Venta(1, client.getCantUsu(), (refresco.getPrecio()*client.getCantUsu()), vueltas, refresco);
		}else {
			System.out.println("No hay cantidad suficiente de este producto");
		}
		
		return venta;
		
	}
	
	
	

}

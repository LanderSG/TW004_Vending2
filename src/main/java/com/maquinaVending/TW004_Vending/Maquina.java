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
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public int getId() {
		return id;
	}
	public ArrayList<Refresco> getListaRefrescos() {
		return listaRefrescos;
	}

	public double hacerCompra(int cantidad, double dineroUsuario, Refresco refresco) {
		/*
		double vueltas;
		System.out.println("Has escogido " + refresco.getNombre());
		System.out.println("¿Cantidad de refrescos? " + cantUsu);
		if(refresco.ComprobarActualizarCantidad(cantUsu)) {
			System.out.println("Debes ingresar: " + (refresco.getPrecio()*cantUsu));
			
			System.out.println("Has ingresado: " + dineroUsu);
			vueltas = dineroUsu - (refresco.getPrecio()*cantUsu);
			
			System.out.println("Sus vueltas: " + vueltas);
			this.setDinero(this.getDinero()-vueltas);
			
			Venta venta = new Venta(1, cantUsu, (refresco.getPrecio()*cantUsu), vueltas, refresco);
			//listaVentas.add(venta);
		}else {
			System.out.println("No hay cantidad suficiente de este producto");
		}*/
		return 3;
		
	}
	
	
	

}

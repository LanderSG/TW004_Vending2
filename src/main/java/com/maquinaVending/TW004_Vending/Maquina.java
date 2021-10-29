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

	public double venderRefresco(double dineroUsuario) {
		return 3;
	}
	
	
	

}

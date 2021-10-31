package com.maquinaVending.TW004_Vending;

public class Cliente {
	private String nombre;
	private int cantUsu;
	private double dineroUsu;
	
	public Cliente(String nombre, int cantUsu, double dineroUsu) {
		super();
		this.nombre = nombre;
		this.cantUsu = cantUsu;
		this.dineroUsu = dineroUsu;
	}
	public String getNombre() {
		return nombre;
	}

	public int getCantUsu() {
		return cantUsu;
	}

	public double getDineroUsu() {
		return dineroUsu;
	}

	
	
}

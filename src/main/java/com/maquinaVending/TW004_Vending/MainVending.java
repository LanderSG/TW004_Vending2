package com.maquinaVending.TW004_Vending;

import java.util.ArrayList;

public class MainVending {

	public static void main(String[] args) {
		boolean salir=false;
		int cantUsu=2;
		double vueltas=0;
		double dineroUsu=10;
		System.out.println("Heyyyyy");
		ArrayList<Venta> informeVentas= new ArrayList<Venta>();
		
		ArrayList<Refresco> listaRefrescos= new ArrayList<Refresco>();
		Refresco cocaCola = new Refresco(1, "Coca-Cola", 2.00, 8);
		Refresco agua = new Refresco(2, "Agua", 1.80, 3);
		Refresco te = new Refresco(3, "Te", 2.50, 5);
		
		listaRefrescos.add(cocaCola);
		listaRefrescos.add(agua);
		listaRefrescos.add(te);
		
		Maquina expendedora = new Maquina(1, 500, true, listaRefrescos);
		
		while (!salir) {
			textoPantallaInicio(cocaCola, agua, te);
			
			salir = funcionalidadMaquinaExpendedora(salir, cantUsu, vueltas, dineroUsu, cocaCola);
			
			salir=true;
		}

	}

	private static boolean funcionalidadMaquinaExpendedora(boolean salir, int cantUsu, double vueltas, double dineroUsu,
			Refresco cocaCola) {
		int condicion = 3;
		switch (condicion) {
		case 1:
			System.out.println("Has escogido Coca cola");
			System.out.println("Cantidad? " + cantUsu);
			if(cocaCola.ComprobarActualizarCantidad(cantUsu)) {
				System.out.println("Debes ingresar: " + (cocaCola.getPrecio()*cantUsu));
				
				System.out.println("Has ingresado: " + dineroUsu);
				
				System.out.println("Sus vueltas: " + vueltas);
			}else {
				System.out.println("No hay cantidad suficiente de este producto");
			}			
			
			break;
		case 2:
			break;
		case 3:
			salir=true;
			break;
		}
		return salir;
	}

	private static void textoPantallaInicio(Refresco cocaCola, Refresco agua, Refresco te) {
		System.out.println("-------------MAQUINA VENDING---------------\n");
		System.out.println("Cod. \t Cant. \t Refresco \t Precio");
		System.out.println("\n " + cocaCola.getId() + "\t " + cocaCola.getCantidad() + "\t   " + cocaCola.getNombre() + "\t" + cocaCola.getPrecio());
		System.out.println("\n " + agua.getId() +"\t " + agua.getCantidad() + "\t   " + agua.getNombre() + "\t \t" + agua.getPrecio());
		System.out.println("\n " + te.getId() +"\t " + te.getCantidad() + "\t   " + te.getNombre() + "\t \t" + te.getPrecio());
	}


}

package com.maquinaVending.TW004_Vending;

import java.util.ArrayList;

public class MainVending {

	public static void main(String[] args) {
		boolean salir=false;
		
		Cliente cliente = new Cliente("Juan", 2, 10);
		
		ArrayList<Venta> informeVentas= new ArrayList<Venta>();		
				
		ArrayList<Refresco> listaRefrescos= new ArrayList<Refresco>();
		Refresco cocaCola = new Refresco(1, "Cola", 2.00, 8);
		Refresco agua = new Refresco(2, "Agua", 1.80, 3);
		Refresco te = new Refresco(3, "Te", 2.50, 5);
		
		listaRefrescos.add(cocaCola);
		listaRefrescos.add(agua);
		listaRefrescos.add(te);
		
		Maquina expendedora = new Maquina(1, 500, true, listaRefrescos);
		
		/*Dependiendo la condicion escogera una bebida u otra.
		 * Para no escribir por pantalla cada vez, la condicion 
		 * ira cambiando hasta probar todos los case del switch.
		 */
		int condicion = 1;		
		
		while (!salir) {
			//Display de opciones a elegir
			textoPantallaInicio(listaRefrescos);	
			
			//Ejecuta la compra desde el metodo hacerCompra() dependiendo el refresco
			switch (condicion) {
			case 1:				
				informeVentas.add(expendedora.hacerCompra(cliente, listaRefrescos.get(condicion-1), informeVentas));			
				condicion = 2;
				break;
			case 2:
				informeVentas.add(expendedora.hacerCompra(cliente, listaRefrescos.get(condicion-1), informeVentas));
				condicion = 3;
				break;
			case 3:
				informeVentas.add(expendedora.hacerCompra(cliente, listaRefrescos.get(condicion-1), informeVentas));
				condicion = 4;				
				break;
			case 4:
				//Muestra informes de compras pasadas en caso de tener alguno
				Venta.generarInformes(informeVentas);
				salir=true;
				break;
			default:
				salir=true;
				System.out.println("Escoge una opcion valida.");
			}
			
		}
		System.out.println("\n A la maquina expendedora le quedan " + expendedora.getDinero() + " euros para cambios");
	}

	private static void textoPantallaInicio( ArrayList<Refresco> listaRefrescos) {
		System.out.println("-------------MAQUINA VENDING---------------\n");
		System.out.println("Cod."+"\t"+" Cant."+"\t"+"Refresco "+"\t"+"Precio");
		for (int i = 0; i < listaRefrescos.size(); i++) {
			System.out.println("\n " + listaRefrescos.get(i).getId() + "\t " 
					+ listaRefrescos.get(i).getCantidad() + "\t " + listaRefrescos.get(i).getNombre() 
					+ "\t \t" + listaRefrescos.get(i).getPrecio());

		}
		System.out.println("\n 4 \t" + " GENERAR INFORMES \n");
	}

}

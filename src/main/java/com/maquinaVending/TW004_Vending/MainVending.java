package com.maquinaVending.TW004_Vending;

import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class MainVending {

	public static void main(String[] args) {
		boolean salir=false;
		int cantUsu=2;
		double vueltas=0;
		double dineroUsu=10;
		
		Cliente cliente = new Cliente("Juan", 2, 10);
		
		ArrayList<Venta> informeVentas= new ArrayList<Venta>();		
		
		ArrayList<Refresco> listaRefrescos= new ArrayList<Refresco>();
		Refresco cocaCola = new Refresco(1, "Coca-Cola", 2.00, 8);
		Refresco agua = new Refresco(2, "Agua", 1.80, 3);
		Refresco te = new Refresco(3, "Te", 2.50, 5);
		
		listaRefrescos.add(cocaCola);
		listaRefrescos.add(agua);
		listaRefrescos.add(te);
		
		Maquina expendedora = new Maquina(1, 500, true, listaRefrescos);
		
		int condicion = 1;
		
		while (!salir) {
			textoPantallaInicio(cocaCola, agua, te);					
			
			switch (condicion) {
			case 1:
				hacerCompra(cantUsu, dineroUsu, cocaCola, informeVentas);	
				condicion = 2;
				break;
			case 2:
				hacerCompra(cantUsu, dineroUsu, agua, informeVentas);
				condicion = 3;
				break;
			case 3:
				hacerCompra(cantUsu, dineroUsu, te, informeVentas);
				condicion = 4;				
				break;
			case 4:
				if(informeVentas.size()>0) {
					for (int i = 0; i < informeVentas.size(); i++) {
						System.out.println("Cambios " + informeVentas.get(i).getCambios());
					}
				}else {
					System.out.println("Actualmente no hay informes");
				}
				salir=true;
				break;
			default:
				salir=true;
				System.out.println("Escoge una opcion valida.");
			}
			
			System.out.println(salir);
		}

	}


	private static void hacerCompra(int cantUsu, double dineroUsu, Refresco refresco, ArrayList<Venta> listaVentas) {
		double vueltas;
		System.out.println("Has escogido " + refresco.getNombre());
		System.out.println("Cantidad? " + cantUsu);
		if(refresco.ComprobarActualizarCantidad(cantUsu)) {
			System.out.println("Debes ingresar: " + (refresco.getPrecio()*cantUsu));
			
			System.out.println("Has ingresado: " + dineroUsu);
			vueltas = dineroUsu - refresco.getPrecio();
			System.out.println("Sus vueltas: " + vueltas);
			
			Venta venta = new Venta(1, cantUsu, (refresco.getPrecio()*cantUsu), vueltas, refresco);
			listaVentas.add(venta);
		}else {
			System.out.println("No hay cantidad suficiente de este producto");
		}
	}

	private static void textoPantallaInicio(Refresco cocaCola, Refresco agua, Refresco te) {
		System.out.println("-------------MAQUINA VENDING---------------\n");
		System.out.println("Cod. \t Cant. \t Refresco \t Precio");
		System.out.println("\n " + cocaCola.getId() + "\t " + cocaCola.getCantidad() + "\t   " + cocaCola.getNombre() + "\t" + cocaCola.getPrecio());
		System.out.println("\n " + agua.getId() +"\t " + agua.getCantidad() + "\t   " + agua.getNombre() + "\t \t" + agua.getPrecio());
		System.out.println("\n " + te.getId() +"\t " + te.getCantidad() + "\t   " + te.getNombre() + "\t \t" + te.getPrecio() + "\n 4 GENERAR LISTA INFORMES");
	}


}

package com.maquinaVending.TW004_Vending;

import org.junit.Assert.*;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;

public class MainVendingTest {

	@Test
	public void testHacerCompra() {
		
		Cliente cliente = new Cliente("Juan", 2, 10);
		
		ArrayList<Venta> informeVentas= new ArrayList<Venta>();		
		
		ArrayList<Refresco> listaRefrescos= new ArrayList<Refresco>();
		Refresco cocaCola = new Refresco(1, "Cola", 2.00, 8);
		
		Refresco cocaColaTest = new Refresco(1, "Cola", 2.00, 6);
		Venta venta = new Venta(1, 2, 4.0, 6.0, cocaColaTest);
		
		Maquina expendedora = new Maquina(1, 500, true, listaRefrescos);
		Venta v=expendedora.hacerCompra(cliente, cocaCola, informeVentas);

		System.out.println(venta);
		System.out.println(v);
		
		assertTrue(venta.equals(v));

		
	}
	
	@Test
	public void testHacerInformes() {
		Refresco cocaColaTest = new Refresco(1, "Cola", 2.00, 6);
		Venta venta = new Venta(1, 2, 16.0, 6.0, cocaColaTest);
		
		ArrayList<Venta> informeVentas= new ArrayList<Venta>();	
		informeVentas.add(venta);
		
		System.out.println("Has escogido: Generar Informes");
		if(informeVentas.size()>0) {
			for (int i = 0; i < informeVentas.size(); i++) {
				System.out.println("\tInforme " + i + ": \t" + informeVentas.get(i));
			}
			assertTrue(true);
		}else {
			fail("Actualmente no hay informes");
		}
		

	}

}

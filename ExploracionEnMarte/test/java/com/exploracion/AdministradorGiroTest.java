package com.exploracion;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdministradorGiroTest {
	
	@Test
	public void debeRecibirGiroALaDerechaYEjecuralo(){
		
		Carro carro = new Carro();
		carro.setDireccion(PuntosCardinales.N);
		
		Derecha giroAderecha = new Derecha();	
		
		AdministradorGiro administradorGiro= new AdministradorGiro();
		administradorGiro.girar(giroAderecha, carro);
		
		
		PuntosCardinales direccionActualDelCarro= carro.getDireccion();
		assertEquals(PuntosCardinales.E, direccionActualDelCarro);
	}
	
	@Test
	public void debeRecibirGiroALaIzquierdaYEjecuralo(){
		
		Carro carro = new Carro();
		carro.setDireccion(PuntosCardinales.N);
		
		Izquierda giroAIzquierda = new Izquierda();	
		
		AdministradorGiro administradorGiro= new AdministradorGiro();
		administradorGiro.girar(giroAIzquierda, carro);
		
		
		PuntosCardinales direccionActualDelCarro= carro.getDireccion();
		assertEquals(PuntosCardinales.O, direccionActualDelCarro);
	}

}

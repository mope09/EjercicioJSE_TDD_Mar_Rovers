package com.exploracion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IzquierdaTest {
	
	@Test
	public void carroDebeCambiarLaDireccionDeNorteAOeste(){
		Carro carro = new Carro();
		carro.setDireccion(PuntosCardinales.N);
		Izquierda giroAizquierda = new Izquierda();
		giroAizquierda.girarCarrito(carro);		
		PuntosCardinales direccionActualDelCarro= carro.getDireccion();
		assertEquals(PuntosCardinales.O, direccionActualDelCarro);
	}
	
	@Test
	public void carroDebeCambiarLaDireccionDeSurAEste(){
		Carro carro = new Carro();
		carro.setDireccion(PuntosCardinales.S);
		Izquierda giroAizquierda = new Izquierda();
		giroAizquierda.girarCarrito(carro);		
		PuntosCardinales direccionActualDelCarro= carro.getDireccion();
		assertEquals(PuntosCardinales.E, direccionActualDelCarro);
	}
	
	@Test
	public void carroDebeCambiarLaDireccionDeEsteANorte(){
		Carro carro = new Carro();
		carro.setDireccion(PuntosCardinales.E);
		Izquierda giroAizquierda = new Izquierda();
		giroAizquierda.girarCarrito(carro);		
		PuntosCardinales direccionActualDelCarro= carro.getDireccion();
		assertEquals(PuntosCardinales.N, direccionActualDelCarro);
	}
	
	@Test
	public void carroDebeCambiarLaDireccionDeOesteASur(){
		Carro carro = new Carro();
		carro.setDireccion(PuntosCardinales.O);
		Izquierda giroAizquierda = new Izquierda();
		giroAizquierda.girarCarrito(carro);		
		PuntosCardinales direccionActualDelCarro= carro.getDireccion();
		assertEquals(PuntosCardinales.S, direccionActualDelCarro);
	}

}

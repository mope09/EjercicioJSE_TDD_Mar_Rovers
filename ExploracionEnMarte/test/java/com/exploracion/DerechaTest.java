package com.exploracion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DerechaTest {

	@Test
	public void carroDebeCambiarLaDireccionDeNorteAEste(){
		Carro carro = new Carro();
		carro.setDireccion(PuntosCardinales.N);
		Derecha giroAderecha = new Derecha();
		giroAderecha.girarCarrito(carro);		
		PuntosCardinales direccionActualDelCarro= carro.getDireccion();
		assertEquals(PuntosCardinales.E, direccionActualDelCarro);
	}
	
	@Test
	public void carroDebeCambiarLaDireccionDeSurAOeste(){
		Carro carro = new Carro();
		carro.setDireccion(PuntosCardinales.S);
		Derecha giroAderecha = new Derecha();
		giroAderecha.girarCarrito(carro);		
		PuntosCardinales direccionActualDelCarro= carro.getDireccion();
		assertEquals(PuntosCardinales.O, direccionActualDelCarro);
	}
	
	@Test
	public void carroDebeCambiarLaDireccionDeEsteASur(){
		Carro carro = new Carro();
		carro.setDireccion(PuntosCardinales.E);
		Derecha giroAderecha = new Derecha();
		giroAderecha.girarCarrito(carro);		
		PuntosCardinales direccionActualDelCarro= carro.getDireccion();
		assertEquals(PuntosCardinales.S, direccionActualDelCarro);
	}
	
	@Test
	public void carroDebeCambiarLaDireccionDeOesteANorte(){
		Carro carro = new Carro();
		carro.setDireccion(PuntosCardinales.O);
		Derecha giroAderecha = new Derecha();
		giroAderecha.girarCarrito(carro);		
		PuntosCardinales direccionActualDelCarro= carro.getDireccion();
		assertEquals(PuntosCardinales.N, direccionActualDelCarro);
	}
}

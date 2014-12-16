package com.exploracion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AdministradorMovimientoTest {
	
	@Test
	public void debeRecibirUnMovimientoYEjecutarlo(){
		
		Carro carro = new Carro();
		carro.setDireccion(PuntosCardinales.N);
		int [] posicionInicialDelCarro={1,2};
		carro.setPosicion(posicionInicialDelCarro);
		
		AvanzarUnaPosicion avanzarUnaPosicion= new AvanzarUnaPosicion();
		
		AdministradorMovimiento administradorMovimiento = new AdministradorMovimiento();
		administradorMovimiento.mover(avanzarUnaPosicion, carro);

		int[] posicionActualDelCarro = carro.getPosicion();
		
		assertEquals(3,posicionActualDelCarro[1]);
		
	}
	
}

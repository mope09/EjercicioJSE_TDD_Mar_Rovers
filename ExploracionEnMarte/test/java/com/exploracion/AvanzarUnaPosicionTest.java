package com.exploracion;

import static org.junit.Assert.*;

import org.junit.Test;

public class AvanzarUnaPosicionTest {
	
	@Test
	public void debeSumarUnoEnLaCordenadaYcuandoLaDireccionEsNorte(){
		Carro carro = new Carro();
		carro.setDireccion(PuntosCardinales.N);
		int [] posicionInicialDelCarro={1,3};
		carro.setPosicion(posicionInicialDelCarro);
		
		AvanzarUnaPosicion avanzarUnaPosicion= new AvanzarUnaPosicion();
		avanzarUnaPosicion.moverCarrito(carro);
		
		int[] posicionActualDelCarro = carro.getPosicion();
		
		assertEquals(4,posicionActualDelCarro[1]);
	}
	
	@Test
	public void debeRestarUnoEnLaCordenadaYcuandoLaDireccionEsSur(){
		Carro carro = new Carro();
		carro.setDireccion(PuntosCardinales.S);
		int [] posicionInicialDelCarro={1,2};
		carro.setPosicion(posicionInicialDelCarro);
		
		AvanzarUnaPosicion avanzarUnaPosicion= new AvanzarUnaPosicion();
		avanzarUnaPosicion.moverCarrito(carro);
		
		int[] posicionActualDelCarro = carro.getPosicion();
		assertEquals(1,posicionActualDelCarro[1]);
	}
	
	@Test
	public void debeSumarUnoEnLaCordenadaXcuandoLaDireccionEsEste(){
		Carro carro = new Carro();
		carro.setDireccion(PuntosCardinales.E);
		int [] posicionInicialDelCarro={1,2};
		carro.setPosicion(posicionInicialDelCarro);
		
		AvanzarUnaPosicion avanzarUnaPosicion= new AvanzarUnaPosicion();
		avanzarUnaPosicion.moverCarrito(carro);
		
		int[] posicionActualDelCarro = carro.getPosicion();
		assertEquals(2,posicionActualDelCarro[0]);
	}
	
	@Test
	public void debeRestarUnoEnLaCordenadaXcuandoLaDireccionEsOeste(){
		Carro carro = new Carro();
		carro.setDireccion(PuntosCardinales.O);
		int [] posicionInicialDelCarro={1,2};
		carro.setPosicion(posicionInicialDelCarro);
		
		AvanzarUnaPosicion avanzarUnaPosicion= new AvanzarUnaPosicion();
		avanzarUnaPosicion.moverCarrito(carro);
		
		int[] posicionActualDelCarro = carro.getPosicion();
		assertEquals(0,posicionActualDelCarro[0]);
	}

}

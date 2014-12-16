package com.exploracion;

import static org.junit.Assert.*;

import org.junit.Test;

public class ControladorMisionTest {

	
	
	@Test
	public void debeMostrarResultadosDeLaPosicionYDireccionDelCarroDespuesDeEjecutarMision(){
		
		PuntosCardinales direccion=PuntosCardinales.N;
		int[] limitesDeMarte = {5,5};
		int[] coordenadaDeLaPosicion = {1,2};
		String ruta= "LMLMLMLMM";
		ControladorMision controladorMision = new ControladorMision(direccion, coordenadaDeLaPosicion,limitesDeMarte);
		
		controladorMision.ejecutarMision(ruta);
		
		String resultados = controladorMision.mostrarResultados();
		assertEquals("Posicion y Direccion Actual: 1 3 N",resultados);
		
	}
	
	@Test(expected=RuntimeException.class)
	public void debeLanzarUnaExcepcionCuandoSeVayaALaTierra(){
		PuntosCardinales direccion=PuntosCardinales.N;
		int[] limitesDeMarte = {3,3};
		int[] coordenadaDeLaPosicion = {1,2};
		String ruta= "MMMM";
		ControladorMision controladorMision = new ControladorMision(direccion, coordenadaDeLaPosicion, limitesDeMarte);
		
		controladorMision.ejecutarMision(ruta);
	}
}

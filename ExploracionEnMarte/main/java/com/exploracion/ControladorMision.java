package com.exploracion;
// Iniciliza el carrto, ejecuta la mision 
public class ControladorMision {
	
	private Carro carro;
	private int[] limitesDePlaneta;

	public ControladorMision(PuntosCardinales direccion, int[] coordenadaDeLaPosicion, int[] limitesDePlaneta) {
		carro = new Carro();
		carro.setDireccion(direccion);
		carro.setPosicion(coordenadaDeLaPosicion);
		this.limitesDePlaneta = limitesDePlaneta;
	}


	public void ejecutarMision(String ruta) {
		char[] caracteresDeRuta = ruta.toCharArray();
		
		AdministradorGiro adminGiro = new AdministradorGiro();
		AdministradorMovimiento adminMovimiento = new AdministradorMovimiento();
		
		for (int x = 0; x < caracteresDeRuta.length; x++) {
			ejecutarAccion(caracteresDeRuta, adminGiro, adminMovimiento, x);
		}
	}


	private void ejecutarAccion(char[] caracteresDeRuta,
			AdministradorGiro adminGiro,
			AdministradorMovimiento adminMovimiento, int x) {
		if (caracteresDeRuta[x] == 'L') {
			Izquierda izquierda = new Izquierda();
			adminGiro.girar(izquierda, carro);
		}
		if (caracteresDeRuta[x] == 'R') {
			Derecha derecha = new Derecha();
			adminGiro.girar(derecha, carro);
		}
		if (caracteresDeRuta[x] == 'M') {
			
			AvanzarUnaPosicion avanzarUnaPosicion = new AvanzarUnaPosicion();
			adminMovimiento.mover(avanzarUnaPosicion, carro);
			if (carro.getPosicion()[0]>limitesDePlaneta[0] ||carro.getPosicion()[1]>limitesDePlaneta[1])
			{
				throw new RuntimeException();
			}
		}
	}
	
	
	public String mostrarResultados(){
		int[] posicionActual = carro.getPosicion();
		return "Posicion y Direccion Actual: " + posicionActual[0]
				+ " " + posicionActual[1] + " " + carro.getDireccion();
	}
}

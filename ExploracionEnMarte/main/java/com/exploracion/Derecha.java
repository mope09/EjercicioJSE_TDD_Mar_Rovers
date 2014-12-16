package com.exploracion;
//Gira el carrito 90 grados en sentido de las agujas del reloj
public class Derecha extends Giro {
	

	@Override
	public void girarCarrito(Carro carro) {
		PuntosCardinales direccionActual = null;
		
		if (carro.getDireccion().equals(PuntosCardinales.N)) {
			direccionActual = PuntosCardinales.E;
		}
		if (carro.getDireccion().equals(PuntosCardinales.S) ) {
			direccionActual = PuntosCardinales.O;
		}
		if (carro.getDireccion().equals(PuntosCardinales.E) ) {
			direccionActual = PuntosCardinales.S;
		}
		if (carro.getDireccion().equals(PuntosCardinales.O)) {
			direccionActual = PuntosCardinales.N;
		}
		carro.setDireccion(direccionActual);
	}

	
}

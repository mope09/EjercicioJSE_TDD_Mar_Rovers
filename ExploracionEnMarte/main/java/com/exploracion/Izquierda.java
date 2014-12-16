package com.exploracion;
//Gira el carrito 90 grados en contra las agujas del reloj
public class Izquierda extends Giro {

	@Override
	public void girarCarrito(Carro carro) {

		PuntosCardinales nuevaDireccion = null;

		if (carro.getDireccion().equals(PuntosCardinales.N)) {
			nuevaDireccion = PuntosCardinales.O;
		}
		if (carro.getDireccion().equals(PuntosCardinales.S)) {
			nuevaDireccion = PuntosCardinales.E;
		}
		if (carro.getDireccion().equals(PuntosCardinales.E)) {
			nuevaDireccion = PuntosCardinales.N;
		}
		if (carro.getDireccion().equals(PuntosCardinales.O)) {
			nuevaDireccion = PuntosCardinales.S;

		}
		carro.setDireccion(nuevaDireccion);
	}

}

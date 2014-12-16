package com.exploracion;
//El carrito avanza una coordenada en el grid
public class AvanzarUnaPosicion extends Movimiento {

	@Override
	public void moverCarrito(Carro carro) {
		int[] posicion = carro.getPosicion();
		
		if (carro.getDireccion().equals(PuntosCardinales.N)) {
			posicion[1]=posicion[1]+1;	
		}
		if (carro.getDireccion().equals(PuntosCardinales.S) ) {
			posicion[1]=posicion[1]-1;
		}
		if (carro.getDireccion().equals(PuntosCardinales.E)) {
			posicion[0]=posicion[0]+1;
		}
		if (carro.getDireccion().equals(PuntosCardinales.O) ) {
			posicion[0]=posicion[0]-1;
		}
		carro.setPosicion(posicion);
	}

}

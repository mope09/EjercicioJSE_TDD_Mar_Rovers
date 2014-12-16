package com.exploracion;
//se encrga de enviar un movimiento al metodo mover()
public class AdministradorMovimiento {
	

	public void mover(Movimiento movimiento, Carro carro) {
		movimiento.moverCarrito(carro);
	}
}

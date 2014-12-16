package com.exploracion;
//Se define la clase Carro y sus tributos
public class Carro {
	private int[] posicion = new int [2];
	private PuntosCardinales direccion;	

	/* Getters & Setters */

	public int[] getPosicion() {
		return posicion;
	}

	public void setPosicion(int[] posicion) {
		this.posicion = posicion;
	}

	public PuntosCardinales getDireccion() {
		return direccion;
	}

	public void setDireccion(PuntosCardinales direccion) {
		this.direccion = direccion;
	}


}

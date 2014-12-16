package com.exploracion;
//Define los puntos cardinales
public enum PuntosCardinales {
	N ("N"),
	S ("S"),
	E("E"),
	O("O");
	
	private String nombre;
	private PuntosCardinales(String equivalencia) {
		nombre = equivalencia;
	}
	public String getNombre() {
		return nombre;
	} 
	

}

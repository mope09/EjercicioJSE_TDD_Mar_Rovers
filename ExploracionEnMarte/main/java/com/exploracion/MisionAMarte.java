package com.exploracion;

import java.util.Scanner;
// Ingresa por teclado las coordenadas superiores, posicion X, Y, Direccion y ruta a seguir del carrito
// Muestra los resultados
public class MisionAMarte {
	
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
				
		System.out.println("Ingrese las coordenadas superiores derechas");
		String coordenadasSuperiores=entrada.nextLine();
		
		String[]separacionCoordenadasSuperiores=coordenadasSuperiores.split("(\\s)");
		
		int posicionSuperiorX=Integer.parseInt(separacionCoordenadasSuperiores[0]);
		int posicionSuperiorY=Integer.parseInt(separacionCoordenadasSuperiores[1]);

		int [] limitesDeMarte={posicionSuperiorX,posicionSuperiorY};
		
		System.out.println("Ingrese la posicion X Y y Direccion de su carrito: ");
		String posicionYDireccion = entrada.nextLine();
		
		String [] separacionDePosicionYDireccion = posicionYDireccion.split("(\\s)");
		
		System.out.println("Ingrese la ruta que desea recorrer: ");
		String ruta = entrada.nextLine(); 
		
		int posicionX = Integer.parseInt(separacionDePosicionYDireccion[0]);
		int posicionY = Integer.parseInt(separacionDePosicionYDireccion[1]);
		PuntosCardinales direccion = PuntosCardinales.valueOf(separacionDePosicionYDireccion[2]) ;
				
		int [] coordenadaDeLaPosicion  = {posicionX,posicionY}; 
		
		ControladorMision controladorMision = new ControladorMision(direccion, coordenadaDeLaPosicion, limitesDeMarte);
		controladorMision.ejecutarMision(ruta);
		System.out.println(controladorMision.mostrarResultados());
	}

}

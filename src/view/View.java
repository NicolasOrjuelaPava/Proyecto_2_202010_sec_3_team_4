package view;

import controller.Controller;

public class View {

	Controller controller;
	public View(){
		
		controller = new Controller();
		System.out.println("Bienvenido");
		System.out.println("A continuaci�n se mostrar� informaci�n del Archivo de Datos:");
		//Carga el archivo y muestra informaci�n
		controller.cargar();
		
		//Informaci�n del Comparendo con mayor OBJECTID
		
		//Zona minimax
		
		
		
		
		
		
	}
	
	
}

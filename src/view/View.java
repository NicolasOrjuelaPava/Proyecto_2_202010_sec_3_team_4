package view;

import controller.Controller;

public class View {

	Controller controller;
	public View(){
		
		controller = new Controller();
		System.out.println("Bienvenido");
		System.out.println("A continuación se mostrará información del Archivo de Datos:");
		//Carga el archivo y muestra información
		controller.cargar();
		
		//Información del Comparendo con mayor OBJECTID
		
		//Zona minimax
		
		
		
		
		
		
	}
	
	
}

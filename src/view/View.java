package view;

import controller.Controller;

public class View {

	Controller controller;
	
	public View(){
		
		controller = new Controller();
		System.out.println("Bienvenido al Proyecto 2 - Estructuras de Datos - Universidad de Los Andes");
		System.out.println("A continuación se mostrará información del archivo de datos Comparendos en Bogotá 2018:");
		//Carga el archivo y muestra información
		controller.cargar();
		
		//Información del Comparendo con mayor OBJECTID
		
		//Zona minimax
		
		
		
		
		
		
	}
	
	
}

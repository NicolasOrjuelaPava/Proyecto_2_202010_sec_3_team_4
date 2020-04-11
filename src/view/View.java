package view;

import java.util.Scanner;

import controller.Controller;
import model.logic.Modelo;;


public class View {

	//------------------------ATRIBUTOS-----------------------------------------------
	Controller controller;

	int seleccion;
	Scanner sc;
	
	
	//------------------------CONSTRUCTOR-----------------------------------------------
	public View(){
		
		controller = new Controller();
		
		System.out.println("Bienvenido al Proyecto 2 - Estructuras de Datos - Universidad de Los Andes");
		System.out.println("A continuaci�n se mostrar� informaci�n del archivo de datos Comparendos en Bogot� 2018:");
		//Carga el archivo y muestra informaci�n
		controller.cargar();
		System.out.println("");
		mostrarMenu();
		
	}
	
	
	//------------------------M�TODOS-----------------------------------------------
	public void mostrarMenu(){
		System.out.println("Seleccione el requerimiento que desea ejecutar (escriba un n�mero y presione la tecla Enter): ");
		System.out.println("1. 1A- Obtener los M comparendos con mayor gravedad ");
		System.out.println("2. 2A- Buscar los comparendos por mes y d�a de la semana");
		System.out.println("3. 3A- Buscar los comparendos que tienen una fecha-hora en un rango y que son de una localidad dada");
		//Agregar los otros requerimientos de esta forma
		
		sc = new Scanner(System.in);
		seleccion = Integer.parseInt(sc.nextLine());
		ejecutarSeleccion(seleccion);
	}
	
	
	
	//Agregar los otros requerimientos de esta forma
	public void ejecutarSeleccion(int e){
		
		switch (e){
			case 1:
				controller.req1A();
				mostrarMenu();
			case 2:
				controller.req2A();
				mostrarMenu();
			case 3:
				controller.req3A();
				mostrarMenu();
				
		}
			
	}

	
	
}

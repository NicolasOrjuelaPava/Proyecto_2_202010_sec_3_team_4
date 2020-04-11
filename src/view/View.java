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
		System.out.println("A continuación se mostrará información del archivo de datos Comparendos en Bogotá 2018:");
		//Carga el archivo y muestra información
		controller.cargar();
		System.out.println("");
		mostrarMenu();
		
	}
	
	
	//------------------------MÉTODOS-----------------------------------------------
	public void mostrarMenu(){
		System.out.println("Seleccione el requerimiento que desea ejecutar (escriba un número y presione la tecla Enter): ");
		System.out.println("1. 1A- Obtener los M comparendos con mayor gravedad ");
		System.out.println("2. 2A- Buscar los comparendos por mes y día de la semana");
		System.out.println("3. 3A- Buscar los comparendos que tienen una fecha-hora en un rango y que son de una localidad dada");
		System.out.println("4. 1B- Buscar los M comparendos más cercanos a la estación de policía.");
		System.out.println("5. 2B- Buscar los comparendos por medio de detección, clase de vehículo, tipo de servicio ylocalidad. ");
		System.out.println("6. 3B- Buscar los comparendos que tienen una latitud en un rango dado y que involucraronun tipo de vehículo particular");
		System.out.println("7. 1C- Visualizar Datos en una Tabla ASCII");
		System.out.println("8. 2C- El costo de los tiempos de espera hoy en día (cola)");
		System.out.println("9. 3C- El costo de los tiempos de espera usando el nuevo sistema ");
		
		
		sc = new Scanner(System.in);
		seleccion = Integer.parseInt(sc.nextLine());
		ejecutarSeleccion(seleccion);
	}
	
	
	
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
			case 4:
				controller.req1B();
				mostrarMenu();
			case 5:
				controller.req2B();
				mostrarMenu();
			case 6:
				controller.req3B();
				mostrarMenu();
				
			case 7:
				controller.req1C();
				mostrarMenu();
			case 8:
				controller.req2C();
				mostrarMenu();
			case 9:
				controller.req3C();
				mostrarMenu();
				
		}
			
	}

	
	
}

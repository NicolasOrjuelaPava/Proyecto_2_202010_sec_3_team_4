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
		System.out.println("4. 1B- Buscar los M comparendos m�s cercanos a la estaci�n de polic�a.");
		System.out.println("5. 2B- Buscar los comparendos por medio de detecci�n, clase de veh�culo, tipo de servicio ylocalidad. ");
		System.out.println("6. 3B- Buscar los comparendos que tienen una latitud en un rango dado y que involucraronun tipo de veh�culo particular");
		System.out.println("7. 1C- Visualizar Datos en una Tabla ASCII");
		System.out.println("8. 2C- El costo de los tiempos de espera hoy en d�a (cola)");
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

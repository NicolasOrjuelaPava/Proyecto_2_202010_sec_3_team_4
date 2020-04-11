package controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.LineNumberInputStream;

import com.google.gson.Gson;

import model.data_structures.Comparendo;
import model.logic.Modelo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.Scanner;

import com.google.gson.Gson;


public class Controller {
	
	//------------------------ATRIBUTOS-----------------------------------------------
	Scanner sc;
	Modelo modelo;
	
	
	//------------------------CONSTRUCTOR-----------------------------------------------
	public Controller(){
		sc = new Scanner(System.in);
		modelo = new Modelo();
		
	}
	
	
	
	//------------------------M�TODOS-----------------------------------------------
	public void cargar(){
		modelo.cargar();
	}
	
	//----PARTE A----
	//Agregar cada requerimiento de esta forma
	public  void req0(){

		modelo.req0();
		
	}
	

	public  void req1A(){
		
		System.out.println("Ingrese la el OBJECTID del comparendo que desea consultar: ");
		int idBuscado = sc.nextInt();
		modelo.req2(idBuscado);
		
	}
	
	
	public  void req2A(){

		System.out.println("Ingrese el OBJECTID INFERIOR: ");
		int id_inferior = sc.nextInt();
		System.out.println("Ingrese el OBJECTID SUPERIOR: ");
		int id_superior = sc.nextInt();
		modelo.req3(id_inferior, id_superior);
		
	}
	
	public void req3A(){
		
	}
	
	
	
	
}

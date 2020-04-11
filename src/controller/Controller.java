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
	
	
	
	//------------------------MÉTODOS-----------------------------------------------
	public void cargar(){
		modelo.cargar();
	}
	
	//----PARTE A----
	//Agregar cada requerimiento de esta forma
	public  void req0(){

		modelo.req0();
		
	}
	

	public  void req1A(){
		

	}
	
	
	public  void req2A(){

	}
	
	public void req3A(){
		
	}
	
	
	//----- PARTE B----
	
	public void req1B(){
		
	}
	
	public void req2B(){
		
	}
	
	public void req3B(){
		
	}
	
	//----PARTE C---
	
	public void req1C(){
		
	}
	
	public void req2C(){
		
	}
	
	public void req3C(){
		
	}
	
	//NO OLVIDAR LA CONCLUSION
	
}

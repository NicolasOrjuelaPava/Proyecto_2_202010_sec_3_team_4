package model.logic;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.google.gson.Gson;

import controller.Controller;
import model.data_structures.Comparendo;
import model.data_structures.Node;
import model.data_structures.RedBlackTree;
import model.data_structures.keyComparendo;
import model.data_structures.Comparendo;



public class Modelo {


	//------------------------CONSTRUCTOR-----------------------------------------------
	public Modelo(){
		tiempoCarga=0;
		tiempoInicio=0;
		tiempoFin=0;
		valMax=0;
		valMin=0;
	}
	
	

	//------------------------ATRIBUTOS-----------------------------------------------	
		private static Modelo modelo;
		Controller controller;
		
		private static final String ARCHIVO_PEQUENO = "./data/Comparendos_DEI_2018_Bogot�_D.C_small.geojson";
		private static final String ARCHIVO_MEDIANO = "./data/Comparendos_DEI_2018_Bogot�_D.C_50000_.geojson";
		private static final String ARCHIVO_GRANDE = "./data/Comparendos_DEI_2018_Bogot�_D.C.geojson";
		public static double tiempoCarga;
		public static double tiempoInicio;
		public static double tiempoFin;
		Scanner sc;
		//CREAR ATRIBUTO DE LA ESTRUCTURA
		static RedBlackTree arbol;
		
		static int valMin;
		static int valMax;
		static String mayorComparendo;

		//------------------------CLASES INTERNAS-----------------------------------------------
		//modelamiento del JSon
		static class Json{
			String type;
			Features[] features;
		}
		
		static class Features{
			String type;
			Properties properties;
			Geometry geometry;
		}

		static class Properties{
			int OBJECTID;
			String FECHA_HORA;
			String MEDIO_DETECCION;
			String CLASE_VEHICULO;
			String TIPO_SERVICIO;
			String INFRACCION;
			String DES_INFRACCION;
			String LOCALIDAD;
			String MUNICIPIO;
		}
		
		static class Geometry{
			String type;
			double[] coordinates;
		}
		
		
		
		//------------------------M�TODOS-----------------------------------------------
		
		//Metodo que carga los datos en la estructura
		@SuppressWarnings("unchecked")
		public static void cargar(){
			
	
			String fecha = "";
			String infraccion ="";
			String clase_vehiculo = "";
			String tipo_servicio ="";
			String localidad ="";
			
			//INICIALIZAR LA ESTRUCTURA
			arbol = new RedBlackTree();


			try {
				FileInputStream inputStream;
				inputStream = new FileInputStream(ARCHIVO_PEQUENO);
				InputStreamReader inputStreamreader = new InputStreamReader(inputStream);
				BufferedReader bufferedReader = new BufferedReader(inputStreamreader);

				Json coleccionComparendos =  new Gson().fromJson(bufferedReader, Json.class);

				tiempoInicio = System.currentTimeMillis();
				
				valMin = coleccionComparendos.features[0].properties.OBJECTID;
				
				for (int i=0; i<coleccionComparendos.features.length;i++){
					
					//CARGAR EN LA ESTRUCTURA
					Comparendo comp = new Comparendo(
							coleccionComparendos.features[i].properties.OBJECTID, 
		        			coleccionComparendos.features[i].properties.FECHA_HORA, 
		        			coleccionComparendos.features[i].properties.MEDIO_DETECCION,
		        			coleccionComparendos.features[i].properties.CLASE_VEHICULO,
		        			coleccionComparendos.features[i].properties.TIPO_SERVICIO, 
		        			coleccionComparendos.features[i].properties.INFRACCION, 
		        			coleccionComparendos.features[i].properties.DES_INFRACCION, 
		        			coleccionComparendos.features[i].properties.LOCALIDAD, 
		        			coleccionComparendos.features[i].properties.MUNICIPIO, 
		        			coleccionComparendos.features[i].geometry.coordinates[0], 
		        			coleccionComparendos.features[i].geometry.coordinates[1]) ;
					arbol.put(comp.getKey(), comp);
					
					
	

					//coger el mayor de una vez y cogerme la info
					int temp = coleccionComparendos.features[i].properties.OBJECTID;;
					if (temp > valMax){
						valMax = temp;
						mayorComparendo = coleccionComparendos.features[i].properties.OBJECTID + " "+ 
								coleccionComparendos.features[i].properties.FECHA_HORA + " " +
								coleccionComparendos.features[i].properties.INFRACCION + " " +
			        			coleccionComparendos.features[i].properties.CLASE_VEHICULO + " " +
			        			coleccionComparendos.features[i].properties.TIPO_SERVICIO +  " "+
			        			coleccionComparendos.features[i].properties.LOCALIDAD;
					}
					
		
					
					/*
					fecha = coleccionComparendos.features[i].properties.FECHA_HORA;
					infraccion = coleccionComparendos.features[i].properties.INFRACCION;
					clase_vehiculo = coleccionComparendos.features[i].properties.CLASE_VEHICULO;
					tipo_servicio = coleccionComparendos.features[i].properties.TIPO_SERVICIO;
					localidad = coleccionComparendos.features[i].properties.LOCALIDAD;
					*/
					
					
					//Coger el menor ID
					
					/*
					int temp2 = coleccionComparendos.features[i].properties.OBJECTID;
					if (temp2<valMin){
						valMin = temp2;
					}
					*/
				
				}
				

				
				
				tiempoFin = System.currentTimeMillis();
				tiempoCarga = (tiempoFin-tiempoInicio)/1000;
				
			
			}catch (Exception e){
				//System.out.println("No se encontr� el archivo de datos");
				e.getStackTrace();
			}
			
			//OUTPUT en consola con informaci�n de la carga
			System.out.println("");
			req0();

		}
	
	
	
	//------------------------REQUERIMIENTOS-----------------------------------------------
	// 1 carga, dejar este as�
	public static void req0(){

			//System.out.println(arbol.height());
			System.out.println("El tamanio es: " +arbol.size());
			System.out.println(mayorComparendo);
	}
	
	
	
	//---PARTE A---
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
	
	
	
	
	
	
	
	
}

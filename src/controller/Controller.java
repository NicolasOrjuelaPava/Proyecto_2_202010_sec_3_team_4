package controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.LineNumberInputStream;

import com.google.gson.Gson;

import model.Comparendo;
import model.LinkedList;
import model.Modelo;
import model.Queue;
import model.Stack;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;

import com.google.gson.Gson;


public class Controller {
	
	//Atributos
	private static LinkedList<Comparendo> lista;
	private static Stack<Comparendo> stack;
	private static Queue<Comparendo> queue;
	
	private static Modelo modelo;
	
	private static final String ARCHIVO_PEQUENO = "./data/Comparendos_DEI_2018_Bogotá_D.C_small.geojson";
	private static final String ARCHIVO_MEDIANO = "./data/Comparendos_DEI_2018_Bogotá_D.C_50000_.geojson";
	private static final String ARCHIVO_GRANDE = "./data/Comparendos_DEI_2018_Bogotá_D.C.geojson";
	public static double tiempoCarga;
	public static double tiempoInicio;
	public static double tiempoFin;

	
	//Constructor
	public Controller(){
		tiempoInicio= 0;
		tiempoFin =0;
		tiempoCarga =0;
		modelo = new Modelo();
	}

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
	
	
	
//es necesario configurar el buildpath del proyecto y agregar el gson.jar
	public static void cargar(){
		
		lista = new LinkedList<Comparendo>();
		stack = new Stack<Comparendo>();
		queue = new Queue<Comparendo>();
		
		try {
			FileInputStream inputStream;
			inputStream = new FileInputStream(ARCHIVO_MEDIANO);
			InputStreamReader inputStreamreader = new InputStreamReader(inputStream);
			BufferedReader bufferedReader = new BufferedReader(inputStreamreader);

			Json coleccionComparendos =  new Gson().fromJson(bufferedReader, Json.class);

			tiempoInicio = System.currentTimeMillis();
			for (int i=0; i<coleccionComparendos.features.length;i++){
				
				//Carga en LinkedList
				lista.addFirst(new Comparendo(
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
	        			coleccionComparendos.features[i].geometry.coordinates[1])) ;
				
				//Carga en Stack
				stack.push(new Comparendo(
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
	        			coleccionComparendos.features[i].geometry.coordinates[1]));
				
				
				//Carga en Queue
				queue.enqueue(new Comparendo(
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
	        			coleccionComparendos.features[i].geometry.coordinates[1]));
				
				//Carga en Priority Queue - Binary Heap
				
				
				
				//Carga en Hash Table
				
				
				//Carga en Balanced Tree
				
				
			}
			
			
			
			tiempoFin = System.currentTimeMillis();
			tiempoCarga = (tiempoFin-tiempoInicio)/1000;
			
		}catch (Exception e){
			e.getStackTrace();
		}
		
		//PRUEBA
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("Total comparendos en el archivo: "+ lista.getSize());
		System.out.println("El comparendo con mayor OBJECTID es: "+ modelo.comparendoMayorObjectID().toString());
		System.out.println("El primer Comparendo es: "+ lista.getFirst().toString());
		System.out.println("El tamaño de la lista es: "+ lista.getSize());
		System.out.println("El tiempo de carga de los datos fue: "+ tiempoCarga + " segundos");
		
		
	}
	
	
	
}

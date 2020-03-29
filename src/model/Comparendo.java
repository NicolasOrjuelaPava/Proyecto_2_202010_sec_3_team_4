package model;

public class Comparendo implements Comparable<Comparendo> {
	
	public int OBJECTID;
	public String FECHA_HORA;
	public String MEDIO_DETECCION;
	public String CLASE_VEHICULO;
	public String TIPO_SERVICIO;
	public String INFRACCION;
	public String DES_INFRACCION;
	public String LOCALIDAD;
	public String MUNICIPIO;

	public double longitud;
	public double latitud;
	
	public Comparendo(int objectID, String fechaHora, String medioDeteccion, String claseVehiculo, String tipoServicio, String infraccion, String desInfraccion, String localidad, String municipio, double latitud, double longitud){
		this.OBJECTID = objectID;
		this.FECHA_HORA = fechaHora;
		this.MEDIO_DETECCION = medioDeteccion;
		this.CLASE_VEHICULO = claseVehiculo;
		this.TIPO_SERVICIO = tipoServicio;
		this.INFRACCION = infraccion;
		this.DES_INFRACCION = desInfraccion;
		this.LOCALIDAD = localidad;
		this.MUNICIPIO = municipio;
	
		this.longitud = longitud;
		this.latitud = latitud;
	}
	
	public String toString(){
		return "(" + OBJECTID + ") (" + FECHA_HORA + ") (" + INFRACCION + ") (" + CLASE_VEHICULO + ") (" + TIPO_SERVICIO + ") (" + LOCALIDAD + ")";
	}

	//COMPARABLE
	@Override
	public int compareTo(Comparendo o) {
		
		return 0;
	}
	
	


}

package ejercicio2Map;

import java.util.HashMap;
import java.util.Map;

//Vamos a suponer que lo que identifica al vehículo es su matrícula.

public class Aparcamiento {
private	int capacidad=10;
private	Map<String,Vehiculos> vehiculosAparcados=new HashMap<String,Vehiculos>();
public int getCapacidad() {
	return capacidad;
}
public void setCapacidad(int capacidad) {
	this.capacidad = capacidad;
}

	
	public void introducirVehiculo(Vehiculos v)  {
		if(capacidad<100) {
		
		
		
		if(!vehiculosAparcados.containsKey(v.getMatricula())) {
			vehiculosAparcados.put(v.getMatricula(), v);
			capacidad=capacidad-1;
			
		}
	}
	}
	public void sacarVehiculo(String matricula)  {
		
		
		if(vehiculosAparcados.containsKey(matricula)) {
			vehiculosAparcados.remove(matricula);
			capacidad=capacidad+1;
		}
		
	
		
	}
	public Map<String, Vehiculos> getVehiculosAparcados() {
		return vehiculosAparcados;
	}
	public void setVehiculosAparcados(Map<String, Vehiculos> vehiculosAparcados) {
		this.vehiculosAparcados = vehiculosAparcados;
	}
	
}

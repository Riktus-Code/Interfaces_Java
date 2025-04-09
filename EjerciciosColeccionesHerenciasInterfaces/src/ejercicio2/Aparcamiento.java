package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;



public class Aparcamiento {
private	int capacidad=10;
private	ArrayList<Vehiculos> vehiculosAparcados=new ArrayList<Vehiculos>();
public int getCapacidad() {
	return capacidad;
}
public void setCapacidad(int capacidad) {
	this.capacidad = capacidad;
}

	
	public void introducirVehiculo(Vehiculos v)  {
		if(capacidad<100) {
		
		
		
		if(!vehiculosAparcados.contains(v)) {
			vehiculosAparcados.add(v);
			capacidad=capacidad-1;
			
		}
	}
	}
	public void sacarVehiculo(String matricula)  {
		
		boolean existe=false;
		
		int i=0;
		Iterator<Vehiculos> iter= vehiculosAparcados.iterator();
		while(iter.hasNext() && !existe) {
			Vehiculos v=iter.next();
			if(v.getMatricula().equals(matricula)) {
				v.calcularImporte();
				if(v instanceof Automoviles) {
					System.out.println(((Automoviles)v).getImporte());
						
				}else if(v instanceof Camiones) {
					System.out.println(((Camiones)v).getImporte());
				}
				iter.remove();
				capacidad=capacidad+1;
			}
		}
		
	}
	public ArrayList<Vehiculos> getVehiculosAparcados() {
		return vehiculosAparcados;
	}
	public void setVehiculosAparcados(ArrayList<Vehiculos> vehiculosAparcados) {
		this.vehiculosAparcados = vehiculosAparcados;
	}
}

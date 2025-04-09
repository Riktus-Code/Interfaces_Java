package ejercicio2MapyList;

import java.util.ArrayList;
import java.util.Iterator;

//Vamos a suponer que lo que identifica al vehículo es su matrícula.

public class Aparcamiento {
	private int capacidad = 10;
	private String idAparcamiento;

	public Aparcamiento(String idAparcamiento) {
		super();
		this.idAparcamiento = idAparcamiento;
	}

	private ArrayList<Vehiculos> vehiculosAparcados = new ArrayList<Vehiculos>();

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public void introducirVehiculo(Vehiculos v) {
		if (capacidad < 100) {

			if (!vehiculosAparcados.contains(v)) {
				vehiculosAparcados.add(v);
				capacidad = capacidad - 1;

			}
		}
	}

	public void sacarVehiculo(String matricula) {

		boolean existe = false;

		
		Iterator<Vehiculos> iter = vehiculosAparcados.iterator();
		while (iter.hasNext() && !existe) {
			Vehiculos v = iter.next();
			if (v.getMatricula().equals(matricula)) {
				v.calcularImporte();
				if (v instanceof Automoviles) {
					System.out.println(((Automoviles) v).getImporte());

				} else if (v instanceof Camiones) {
					System.out.println(((Camiones) v).getImporte());
				}
				iter.remove();
				capacidad = capacidad + 1;
			}
		}

	}

	public ArrayList<Vehiculos> getVehiculosAparcados() {
		return vehiculosAparcados;
	}

	public void setVehiculosAparcados(ArrayList<Vehiculos> vehiculosAparcados) {
		this.vehiculosAparcados = vehiculosAparcados;
	}

	public String getIdAparcamiento() {
		return idAparcamiento;
	}

	public void setIdAparcamiento(String idAparcamiento) {
		this.idAparcamiento = idAparcamiento;
	}
}

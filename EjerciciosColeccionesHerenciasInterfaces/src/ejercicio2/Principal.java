package ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Principal {

	public static void main(String[] args) {
		Automoviles a = new Automoviles();
		a.setMatricula("HZN3444");
		a.setEsAbonado(true);
		a.setTipo("turismo");
		a.setMin(10);
		Automoviles a1 = new Automoviles();
		a1.setMatricula("AAN3554");
		a1.setEsAbonado(false);
		a1.setTipo("todoterreno");
		a1.setMin(30);
		Camiones c = new Camiones();
		c.setMatricula("BGF6733");
		c.setNumEjes(4);
		c.setMin(80);
		Camiones c1 = new Camiones();
		c1.setMatricula("RR6733");
		c1.setNumEjes(2);
		c1.setMin(40);
		Aparcamiento	aparcamiento = new Aparcamiento();
		ArrayList<Vehiculos> v = new ArrayList<Vehiculos>();
		v.add(a);
		v.add(a1);
		v.add(c);
		v.add(c1);
		aparcamiento.setVehiculosAparcados(v);
		//Ordenados por matrícula
		Collections.sort(aparcamiento.getVehiculosAparcados());
		Automoviles a2 = new Automoviles();
		a2.setMatricula("ATT5465");
		a2.setEsAbonado(false);
		a2.setTipo("furgoneta");
		a2.setMin(45);
	
		System.out.println("Capacidad antes:"+aparcamiento.getCapacidad());
		
			aparcamiento.introducirVehiculo(a2);
			//aparcamiento.introducirVehiculo(a2);
			Collections.sort(aparcamiento.getVehiculosAparcados());
			System.out.println((aparcamiento.getVehiculosAparcados()));
			System.out.println("Capacidad despues introducir:"+aparcamiento.getCapacidad());
			aparcamiento.sacarVehiculo("RR6733");
			System.out.println((aparcamiento.getVehiculosAparcados()));
			System.out.println("Capacidad despues sacar:"+aparcamiento.getCapacidad());
			aparcamiento.sacarVehiculo("RR6733");
			System.out.println((aparcamiento.getVehiculosAparcados()));
		
	}

}

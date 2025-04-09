package ejercicio2Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Principal {

	public static void main(String[] args) {
		Automoviles a = new Automoviles("HZN3444");
		
		a.setEsAbonado(true);
		a.setTipo("turismo");
		a.setMin(10);
		Automoviles a1 = new Automoviles("BAN3554");
		
		a1.setEsAbonado(false);
		a1.setTipo("todoterreno");
		a1.setMin(30);
		Camiones c = new Camiones("BGF6733");
		
		c.setNumEjes(4);
		c.setMin(80);
		Camiones c1 = new Camiones("RRR6733");
		
		c1.setNumEjes(2);
		c1.setMin(40);
		Aparcamiento	aparcamiento = new Aparcamiento();
		Map<String,Vehiculos> v = new HashMap();
		v.put(a.getMatricula(),a);
		v.put(a1.getMatricula(),a1);
		v.put(c.getMatricula(),c);
		v.put(c1.getMatricula(),c1);
		aparcamiento.setVehiculosAparcados(v);
		//Ordenado por matricula
		System.out.println(v.values());
		TreeMap<String,Vehiculos> vOrd=new TreeMap();
		vOrd.putAll(v);
		v=vOrd;
		System.out.println("Ordenados por matricula:"+v.values());
		Automoviles a2 = new Automoviles("ATT5465");
		
		a2.setEsAbonado(false);
		a2.setTipo("furgoneta");
		a2.setMin(45);
	
		System.out.println("Capacidad antes:"+aparcamiento.getCapacidad());
		
			aparcamiento.introducirVehiculo(a2);
			//aparcamiento.introducirVehiculo(a2);
			
			vOrd.putAll(aparcamiento.getVehiculosAparcados());
			v=vOrd;
			System.out.println("Después introducir datos:"+v.values());
			System.out.println((aparcamiento.getVehiculosAparcados()));
			System.out.println("Capacidad despues introducir:"+aparcamiento.getCapacidad());
			aparcamiento.sacarVehiculo("RRR6733");
			System.out.println((aparcamiento.getVehiculosAparcados()));
			System.out.println("Capacidad despues sacar:"+aparcamiento.getCapacidad());
			aparcamiento.sacarVehiculo("RRR6733");
			System.out.println((aparcamiento.getVehiculosAparcados()));
		
	}

}

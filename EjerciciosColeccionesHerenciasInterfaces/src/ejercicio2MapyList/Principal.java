package ejercicio2MapyList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Principal {

	public static void main(String[] args) {
		// Aparcamiento 1
		Automoviles a = new Automoviles("HZN3444");

		a.setEsAbonado(true);
		a.setTipo("turismo");
		a.setMin(10);
		Automoviles a1 = new Automoviles("AAN3554");

		a1.setEsAbonado(false);
		a1.setTipo("todoterreno");
		a1.setMin(30);
		Camiones c = new Camiones("BGF6733");

		c.setNumEjes(4);
		c.setMin(80);
		Camiones c1 = new Camiones("RR6733");

		c1.setNumEjes(2);
		c1.setMin(40);
		Aparcamiento aparcamiento = new Aparcamiento("1");
		ArrayList<Vehiculos> vehiculosAparcados=new ArrayList<Vehiculos>();
		vehiculosAparcados.add( a);
		vehiculosAparcados.add(a1);
		vehiculosAparcados.add( c);
		vehiculosAparcados.add( c1);
		aparcamiento.setVehiculosAparcados(vehiculosAparcados);
		// Aparcamiento 2
		Automoviles ap2 = new Automoviles("LFG9000");

		ap2.setEsAbonado(true);
		ap2.setTipo("turismo");
		ap2.setMin(10);
		Automoviles ap21 = new Automoviles("BBY8912");

		ap21.setEsAbonado(false);
		ap21.setTipo("todoterreno");
		ap21.setMin(30);
		Camiones c2 = new Camiones("PRQ3311");

		c2.setNumEjes(4);
		c2.setMin(80);
		Camiones c21 = new Camiones("SPX9089");

		c21.setNumEjes(2);
		c21.setMin(40);
		Aparcamiento aparcamiento2 = new Aparcamiento("2");
		ArrayList<Vehiculos> vehiculosAparcados2=new ArrayList<Vehiculos>();
		vehiculosAparcados2.add( ap2);
		vehiculosAparcados2.add( ap21);
		vehiculosAparcados2.add( c2);
		vehiculosAparcados2.add( c21);
		aparcamiento2.setVehiculosAparcados(vehiculosAparcados2);
		// Aparcamiento 3
		Automoviles ap3 = new Automoviles("AFD2244");

		ap3.setEsAbonado(true);
		ap3.setTipo("turismo");
		ap3.setMin(10);
		Automoviles ap31 = new Automoviles("CFG0954");

		ap31.setEsAbonado(false);
		ap31.setTipo("todoterreno");
		ap31.setMin(30);
		Camiones c3 = new Camiones("AVG7867");

		c3.setNumEjes(4);
		c3.setMin(80);
		Camiones c31 = new Camiones("PLU8979");

		c31.setNumEjes(2);
		c31.setMin(40);
		Aparcamiento aparcamiento3 = new Aparcamiento("3");
		ArrayList<Vehiculos> vehiculosAparcados3=new ArrayList<Vehiculos>();
		vehiculosAparcados3.add( ap3);
		vehiculosAparcados3.add( ap31);
		vehiculosAparcados3.add(c3);
		vehiculosAparcados3.add(c31);
		aparcamiento3.setVehiculosAparcados(vehiculosAparcados3);
		
		
		GestionAparcarmiento ga = new GestionAparcarmiento();
		Map<String, ArrayList<Vehiculos>> gestion = new HashMap<String,ArrayList<Vehiculos>>();
		gestion.put(aparcamiento.getIdAparcamiento(), aparcamiento.getVehiculosAparcados());
		gestion.put(aparcamiento2.getIdAparcamiento(), aparcamiento2.getVehiculosAparcados());
		gestion.put(aparcamiento3.getIdAparcamiento(), aparcamiento3.getVehiculosAparcados());
		ga.setGestion(gestion);
		
		
		/**
		 * void vaciarAparcamiento(String id);
		 *  void añadirAparcamiento(String id, Map<String, Vehiculos> p) ; 
		 * Collection eliminarCamiones();
		 */
		System.out.println("Antes de vaciar p3:"+ga.getGestion().get("3"));
		System.out.println("Antes de vaciar p2:"+ga.getGestion().get("2"));
		ga.vaciarAparcamiento("2");
		System.out.println("Después de vaciar p3:"+ga.getGestion().get("3"));
		System.out.println("Después de vaciar p2:"+ga.getGestion().get("2"));
		System.out.println("Eliminar camiones");
		Collection eliminarCamiones = ga.eliminarCamiones();
		System.out.println("Eliminados:"+eliminarCamiones);
		System.out.println("Despues de eliminar:");
		System.out.println("p1:"+ga.getGestion().get("1"));
		System.out.println("p2:"+ga.getGestion().get("2"));
		System.out.println("p3:"+ga.getGestion().get("3"));

	}

}

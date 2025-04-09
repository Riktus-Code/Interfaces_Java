package ejercicio2MapyList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class GestionAparcarmiento implements AspectosAparcamiento{
	Map<String, ArrayList<Vehiculos>> gestion = new HashMap<String,  ArrayList<Vehiculos>>();

	/**
	 * Eliminará todos los vehículos de la colección. Estos vehículos se añadirán al
	 * siguiente aparcamiento.
	 */
	@Override
	public void vaciarAparcamiento(String id) {
		TreeMap<String,  ArrayList<Vehiculos>> vOrd=new TreeMap();
		//Ordeno el mapa por id de aparcamientos
		vOrd.putAll(gestion);
		gestion=vOrd;
		if(gestion.containsKey(id)) {
			
			ArrayList<Vehiculos> vehiculosAVaciar = gestion.get(id);
			Set<String> keySet = gestion.keySet(); //Itero para guardar los vehiculos de un aparcamiento en otro
			Iterator<String> iterator = keySet.iterator();
			boolean found=false;
			while(!found && iterator.hasNext()) {
				String idIter=iterator.next();
				if(idIter.equals(id)) {
					found=true;
				}
			}
			//Si lo encuentra cogemos el siguiente iterador
			if(found && iterator.hasNext()) {
				String idSiguiente=iterator.next();
				gestion.get(idSiguiente).addAll(vehiculosAVaciar);
			}
			
			gestion.remove(id);
		}
		

	}



	@Override
	public Collection eliminarCamiones() {
		ArrayList<Camiones> listaEliminados=new ArrayList<Camiones>();
		Set<String> keyAparcamientos = gestion.keySet();//Claves de los aparcamientos
		Iterator<String> iterAparcamientos=keyAparcamientos.iterator();
		while(iterAparcamientos.hasNext()) {
			String idAparcamientos=iterAparcamientos.next();
			ArrayList<Vehiculos> map = gestion.get(idAparcamientos); //Con las claves consigo los vehiculos
			//Recorro el mapa para eliminar los vehículos que son camiones
			
			Iterator<?> iterVehiculos=map.iterator();
			while(iterVehiculos.hasNext()) {
				Object v = iterVehiculos.next();
				if(v instanceof Camiones) {
					listaEliminados.add((Camiones) v);
					iterVehiculos.remove();
				}
			}
		}
		Collections.sort(listaEliminados, new ComparadorCamiones());
		return listaEliminados;
	}

	

	@Override
	public String toString() {
		return "GestionAparcarmiento [gestion=" + gestion + "]";
	}



	@Override
	public void añadirAparcamiento(String id,  ArrayList<Vehiculos> p) {
		gestion.put(id, p);
		
	}



	public Map<String, ArrayList<Vehiculos>> getGestion() {
		return gestion;
	}



	public void setGestion(Map<String, ArrayList<Vehiculos>> gestion) {
		this.gestion = gestion;
	}





	

	

}

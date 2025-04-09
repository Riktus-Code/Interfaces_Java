package ejercicio2MapyList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;


public interface AspectosAparcamiento {

	/**
	 * vaciarAparcamiento(String id): Eliminará todos los vehículos de la colección. Estos vehículos se añadirán al siguiente aparcamiento.
añadirAparcamiento(String id, Aparcamiento p): Si el id no existe, se introducirá el aparcamiento
Collections eliminarCamiones(): eliminará de todos los parkings los camiones existentes y devuelve una colección con los camiones eliminados. Los camiones se devolverán ordenados por matrícula inversa, si tienen la misma matrícula por ejes.

	 */
	void vaciarAparcamiento(String id);
	void  añadirAparcamiento(String id,  ArrayList<Vehiculos> p) ;
	 Collection eliminarCamiones();
}

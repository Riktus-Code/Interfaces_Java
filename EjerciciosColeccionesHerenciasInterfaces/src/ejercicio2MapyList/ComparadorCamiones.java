package ejercicio2MapyList;

import java.util.Comparator;

public class ComparadorCamiones implements Comparator<Camiones>{

	

	@Override
	public int compare(Camiones o1, Camiones o2) {
		if(o1.getMatricula().equals(o2.getMatricula())) {
			return (o1.getNumEjes()-o2.getNumEjes());
		}
		return (o1.getMatricula().compareTo(o2.getMatricula()))*-1;
	}

}

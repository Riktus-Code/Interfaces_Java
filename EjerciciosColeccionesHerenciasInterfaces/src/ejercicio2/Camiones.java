package ejercicio2;

public class Camiones extends Vehiculos{
private int numEjes;
private double importe;

public int getNumEjes() {
	return numEjes;
}

public void setNumEjes(int numEjes) {
	this.numEjes = numEjes;
}

@Override
public void calcularImporte() {
/**	Camión: 
		Ejes ≤ 3 → minutos * 4.5 € / 60 
		Ejes > 3 → minutos * 6.5 € / 60*/
	if(numEjes<=3) {
 importe=(this.getMin()*4.5)/60;
	}else {
		importe=(this.getMin()*6.5)/60;
	}
	
}

public double getImporte() {
	return importe;
}

@Override
public int compareTo(Vehiculos o) {
	// TODO Auto-generated method stub
			return this.getMatricula().compareTo(o.getMatricula());
}


}

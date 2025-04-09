package ejercicio2Map;

public abstract class Vehiculos implements Comparable<Vehiculos>{
 private String matricula;

 private int min;

 private boolean esAbonado;
public String getMatricula() {
	return matricula;
}


public Vehiculos(String matricula) {
	super();
	this.matricula = matricula;
}


public int getMin() {
	return min;
}
public void setMin(int min) {
	this.min = min;
}

public boolean isEsAbonado() {
	return esAbonado;
}
public void setEsAbonado(boolean esAbonado) {
	this.esAbonado = esAbonado;
}
public abstract void calcularImporte();
@Override
public String toString() {
	return "Vehiculos [matricula=" + matricula + ", min=" + min + ", esAbonado=" + esAbonado + "]";
}
}

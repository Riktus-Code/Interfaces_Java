package ejercicio2MapyList;

public class Automoviles extends Vehiculos{

	public Automoviles(String matricula) {
		super(matricula);
		
	}



	private String tipo;
	private double importe;

	public double getImporte() {
		return importe;
	}

	

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void calcularImporte() {
	/**
	 * turismo → minutos * 1.5 € / 60 
todoterreno → minutos * 2.5 € / 60
furgoneta → minutos * 3.5 € / 60

	 * */
		if(tipo.equalsIgnoreCase("turismo")) {
			importe=(this.getMin()*1.5)/60;
		}else if(tipo.equalsIgnoreCase("todoterreno")) {
			importe=(this.getMin()*2.5)/60;
		}else if(tipo.equalsIgnoreCase("furgoneta")) {
			importe=(this.getMin()*3.5)/60;
		}
		if(this.isEsAbonado()) {
			importe=importe-(importe*0.4);
		}
		
	}



	@Override
	public int compareTo(Vehiculos o) {
		// TODO Auto-generated method stub
		return this.getMatricula().compareTo(o.getMatricula());
	}



	
}

package EscobarJoel44107580;

public abstract class Vehiculo {

	private String Patente;

	public Vehiculo(String patente) {
		Patente = patente;
	}

	public abstract String getTipo();

	public String getPatente() {
		return Patente;
	}

	public void setPatente(String patente) {
		Patente = patente;
	}


	
	
}

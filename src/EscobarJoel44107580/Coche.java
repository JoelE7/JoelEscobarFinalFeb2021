package EscobarJoel44107580;

public class Coche extends Vehiculo {

	public Coche(String patente) {
		super(patente);
	}

	@Override
	public String getTipo() {
		return "Coche";
	}

}

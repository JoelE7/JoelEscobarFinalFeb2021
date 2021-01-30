package EscobarJoel44107580;

public class AutoBus extends Vehiculo{

	private Tag tag;

	public AutoBus(String patente, Tag tag) {
		super(patente);
		
	}

	@Override
	public String getTipo() {
		return "AutoBus";
	}

	public void recargarTag(Double montoAAgregar) {
		tag.setSaldo(montoAAgregar);
	}

}

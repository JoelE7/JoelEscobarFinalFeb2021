package EscobarJoel44107580;

public class Orden {

	private Integer ascdes;
	
	public Orden(Integer orden) {
		this.ascdes=orden;
	}
	
	public String getOrden() {
		if(ascdes==1) {
			return "ascendente";
		}else {
			return "descendente";
		}
	}
	
	
	
	
}

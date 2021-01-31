package EscobarJoel44107580;

public class VehiculoNoPermitidoExceptions extends Exception{

	public VehiculoNoPermitidoExceptions(String mensaje) {
		super(mensaje);
	}
	
	public VehiculoNoPermitidoExceptions() {
		super("Vehiculo no permitido");
	}
	 
}

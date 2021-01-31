package EscobarJoel44107580;

public class SaldoInsuficienteError extends Exception{

	public SaldoInsuficienteError(String mensaje) {
		super(mensaje);
	}
	
	public SaldoInsuficienteError() {
		super("Saldo insuficiente, error");
	}
	
}

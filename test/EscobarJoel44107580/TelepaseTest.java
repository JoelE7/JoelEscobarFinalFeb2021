package EscobarJoel44107580;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TelepaseTest {
	
	
	@Test
	public void queVerificaQueSeEncuentreElTagConIdUno () throws TagNoEncontradoException {
		Telepase t1 = new Telepase(1);
		Tag t = new Tag(1);
		assertTrue(t1.verifcarExiste(t));
		
	}
	

	@Test(expected = SaldoInsuficienteError.class)
	public void queAlPasarAutobusconSaldoInsuficienteLanceUnaExcepcion () throws VehiculoNoPermitidoExceptions, TagNoEncontradoException, SaldoInsuficienteError {
		Tag t1 = new Tag(2);
		AutoBus b1 = new AutoBus("23",t1);
		Telepase te = new Telepase(1);
		te.cargarTag(t1);
		te.pagarAutomatico(b1);
		
	}
	
	@Test (expected = VehiculoNoPermitidoExceptions.class)
	public void queAlPasarUnAutobusconUnTagInvalidoLanceUnaExcepcion () throws VehiculoNoPermitidoExceptions, TagNoEncontradoException, SaldoInsuficienteError {
		Tag t1 = new Tag(2);
		Coche c1 = new Coche("s");
		Telepase te = new Telepase(1);
		te.cargarTag(t1);
		te.pagarAutomatico(c1);
	}
	
	

}

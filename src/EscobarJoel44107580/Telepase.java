package EscobarJoel44107580;

import java.util.HashSet;
import java.util.Set;

public class Telepase extends Cabina {

	/*
	 * Atribito donde se almacentodos los tags habilitados para el telepase No se
	 * permiten tags duplicados ( 2 tags son iguales cuando tienen el mismo id)
	 */
	private Set<Tag> tags;

	public Telepase(Integer numero) {
		// siempre al momento de crear un telepase se crea el tag 1 con 200 pesos,carga
		super(numero);
		this.tags = new HashSet<Tag>();
		Tag tagInicial = new Tag(1);
		tagInicial.setSaldo(200.0);
		this.cargarTag(tagInicial);
		
	}

	public Boolean cargarTag(Tag tag) {
		return tags.add(tag);
	}

	/*
	 * Este metodo es pago automatico y en estas cabinas solamente estan habilitados
	 * los autobuses Al momento de pasar un autobus se descuenta el importe del tag
	 * asociado al autobus y se incrementa la recaudacion de la cabina y tambien se
	 * tiene que incrementar el contador de AutoBus
	 * 
	 * Validaciones 1) en caso que el tag no este registrado lanza una
	 * TagNoEncontradoException 2) en caso que el vehiculo que ingreso al telepase
	 * no es un AutoBus lanza una VehiculoNoPermitidoExceptions 3) en caso que el
	 * importe que tiene el tag no alcanza para pagar el peaje laza una
	 * SaldoInsuficienteError
	 * 
	 */
	public void pagarAutomatico(Vehiculo vehiculo) throws VehiculoNoPermitidoExceptions, TagNoEncontradoException, SaldoInsuficienteError{
		AutoBus c = null;
		if(!(vehiculo instanceof AccesoATags)) {
			throw new VehiculoNoPermitidoExceptions();
		}else {
			 c = (AutoBus) vehiculo;
			 if(verifcarExiste(c.getTag())) {
				 throw new TagNoEncontradoException();
			 }else {
				 if(c.getTag().getSaldo()<200.0) {
					 throw new SaldoInsuficienteError();
				 }else {
					 c.getTag().setSaldo(c.getTag().getSaldo()-200.0);
				 }
			 }
		}
		
		
	}

	// Metodo no obligatorio
	private void pagarConTelePase(Vehiculo vehiculo) throws SaldoInsuficienteError, TagNoEncontradoException {

	}

//Verifica que si existe el tag
	public Boolean verifcarExiste(Tag tag) throws TagNoEncontradoException {
		// No Se Puede modificar el comportamiento de este metodo
		// Los tags son iguales cuando tiene el mismo id

		for (Tag tagLeido : tags) {
			if (tagLeido.equals(tag))
				return Boolean.TRUE;
		}

		throw new TagNoEncontradoException();
	}

}

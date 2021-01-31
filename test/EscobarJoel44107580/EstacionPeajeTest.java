package EscobarJoel44107580;

import org.junit.Test;

public class EstacionPeajeTest {


	@Test
	public void queQueObtieneListaDeCabinasOrdenaPorImporteDescendente () {
		
		EstacionDePeaje e1 = new EstacionDePeaje();
		Cabina c1 = new Cabina(2);
		Cabina c2 = new Cabina(3);
		Cabina c3 = new Cabina(7);
		Cabina c4 = new Cabina(19);
		Cabina c5 = new Cabina(10);
		e1.agregarCabinas(c1);
		e1.agregarCabinas(c2);
		e1.agregarCabinas(c3);
		e1.agregarCabinas(c4);
		e1.agregarCabinas(c5);

		Orden o1 = new Orden(3);
		System.out.println(e1.obtenerCabinasOrdenadaImporteDescendente(o1));
		
		
	}
	
	
	
	
	
}

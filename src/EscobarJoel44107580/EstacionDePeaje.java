package EscobarJoel44107580;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EstacionDePeaje {

	private List<Cabina> cabinas;

	public EstacionDePeaje() {
		this.cabinas= new ArrayList<Cabina>();		
	}

	// Metodo que agrega todas las cabinas (No Obligatorio)
	public void agregarCabinas(Cabina cabina) {
		if(!cabinas.contains(cabina)) {
			cabinas.add(cabina);
		}
	}

	/*
	 * obtiene todas un listado de cabinas ordenas por importe recaudado en forma
	 * descendete
	 */
	public Set<Cabina> obtenerCabinasOrdenadaImporteDescendente(Orden orden) {
		TreeSet<Cabina>ordenar = new TreeSet<Cabina>();
		ordenar.addAll(cabinas);
		if(orden.getOrden().equals("ascendente")) {
			return ordenar;
		}else {
			return ordenar.descendingSet();
		}
	}
	
}

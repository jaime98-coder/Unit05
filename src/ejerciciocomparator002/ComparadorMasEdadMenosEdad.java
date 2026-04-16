package ejerciciocomparator002;

import java.util.Comparator;

public class ComparadorMasEdadMenosEdad implements Comparator<Socio> {

	@Override
	public int compare(Socio socio1, Socio socio2) {
		return socio2.getEdad().compareTo(socio1.getEdad());
	}
}

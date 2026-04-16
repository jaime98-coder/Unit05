package ejerciciocomparator003;

import java.util.Comparator;

public class ComparadorEdadAscendente implements Comparator<Futbolista> {

	@Override
	public int compare(Futbolista futb1, Futbolista futb2) {
		return futb1.getEdad().compareTo(futb2.getEdad());
	}
}

package ejerciciocomparator003;

import java.util.Comparator;

public class ComparadorMasAMenosGoles implements Comparator<Futbolista> {

	@Override
	public int compare(Futbolista futb1, Futbolista futb2) {
		return futb2.getGoles().compareTo(futb1.getGoles());
	}
}

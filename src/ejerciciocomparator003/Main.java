package ejerciciocomparator003;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Futbolista[] equipo = new Futbolista[4];
		equipo[0] = new Futbolista("Messi", 18, 4);
		equipo[1] = new Futbolista("Cristiano", 23, 7);
		equipo[2] = new Futbolista("Mbappe", 27, 15);
		equipo[3] = new Futbolista("Lamine", 16, 7);
		ComparadorEdadAscendente juezEdad = new ComparadorEdadAscendente();
		ComparadorMasAMenosGoles juezGoles = new ComparadorMasAMenosGoles();
		mostrarEquipo(equipo);
		Arrays.sort(equipo, juezEdad);
		Arrays.sort(equipo, juezGoles);
		mostrarEquipo(equipo);
	}

	public static void mostrarEquipo(Futbolista[] equipo) {
		for (Futbolista futbolista : equipo) {
			System.out.println(futbolista.toString());
		}
	}
}

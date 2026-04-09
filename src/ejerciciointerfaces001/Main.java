package ejerciciointerfaces001;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Socio socio1 = new Socio(12887773, "Jaime", 27);
		Socio socio2 = new Socio(77356553, "Pepe", 21);
		Socio socio3 = new Socio(42225790, "Laura", 33);
		Socio socio4 = new Socio(52561717, "Miercoles", 16);
		Socio[] arraySocios = { socio1, socio2, socio3, socio4 };
		System.out.println("----ESTADO INICIAL DEL ARRAY----");
		for (Socio socioActual : arraySocios) {
			System.out.println(socioActual.toString());
		}
		Arrays.sort(arraySocios);
		System.out.println("\n----ARRAY ORDENADO POR ID (CRECIENTE)----");
		for (Socio socioActual : arraySocios) {
			System.out.println(socioActual.toString());
		}

	}

}

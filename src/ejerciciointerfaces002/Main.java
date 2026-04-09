package ejerciciointerfaces002;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Futbolista futbolista1 = new Futbolista(15, "Samuel", 31, 2);
		Futbolista futbolista2 = new Futbolista(10, "Sara", 21, 7);
		Futbolista futbolista3 = new Futbolista(23, "Cristobal", 23, 0);
		Futbolista futbolista4 = new Futbolista(2, "Kummo", 18, 8);
		// Objeto repetido a propósito para verificar que funcione el metodo equals
		Futbolista futbolista5 = new Futbolista(2, "Ana", 17, 3);

		Futbolista[] arrayFutbolistas = { futbolista1, futbolista2, futbolista3, futbolista4, futbolista5 };

		System.out.println("------SIN ORDENAR------");
		imprimirArray(arrayFutbolistas);

		Arrays.sort(arrayFutbolistas);

		System.out.println("------ORDENADO------");
		imprimirArray(arrayFutbolistas);

		System.out.println("------COMPROBACIÓN DE IDENTIDAD------ ");
		comprobarIdentidad(futbolista4, futbolista5);

	}

	public static void comprobarIdentidad(Futbolista futbolistaA, Futbolista futbolistaB) {
		if (futbolistaA.equals(futbolistaB)) {
			System.out.println("Alerta: Futbolista duplicado");
		} else {
			System.out.println("El futbolista " + futbolistaA.getNombre() + " y el futbolista " + futbolistaB.getNombre()
					+ " comparten número");
		}
	}

	private static void imprimirArray(Futbolista[] arrayFutbolistas) {
		for (Futbolista futbolista : arrayFutbolistas) {
			System.out.println(futbolista.toString());
		}
	}

}

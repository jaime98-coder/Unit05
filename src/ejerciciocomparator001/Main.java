package ejerciciocomparator001;

import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Integer[] listaNumeros = new Integer[20];
		Random rd = new Random();
		ComparadorNumerosDecreciente juezOrdena = new ComparadorNumerosDecreciente();
		for (int i = 0; i < listaNumeros.length; i++) {
			listaNumeros[i] = rd.nextInt(1, 101);
		}
		System.out.println("--------------Sin ordenar--------------");
		for (int numero : listaNumeros) {
			System.out.print(numero + "\t");
		}
		System.out.println();
		System.out.println("--------------Ordenado--------------");
		Arrays.sort(listaNumeros, juezOrdena);
		for (int numero : listaNumeros) {
			System.out.print(numero + "\t");
		}
	}
}

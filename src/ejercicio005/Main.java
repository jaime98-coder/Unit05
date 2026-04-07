package ejercicio005;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opcionMenu;
		ArrayList<Poligono> listaPoligonos = new ArrayList<>();
		do {
			System.out.println("--------------------------");
			System.out.println("1. Introducir triángulo");
			System.out.println("2. Introducir rectángulo");
			System.out.println("3. Mostrar polígonos");
			System.out.println("4. Salir");
			System.out.println("--------------------------");
			System.out.println("Elige una opción: ");
			opcionMenu = sc.nextInt();
			sc.nextLine();
			switch (opcionMenu) {
			case 1: {
				introducirTriangulo(listaPoligonos);
				break;
			}
			case 2: {
				introducirRectangulo(listaPoligonos);
				break;
			}
			case 3: {
				System.out.println("Mostrar polígonos seleccionado");
				mostrarPoligonos(listaPoligonos);
				break;
			}
			case 4: {
				System.out.println("Saliendo del programa...");
				break;
			}
			}
		} while (opcionMenu != 4);
		sc.close();
	}

	// SOBRECARGA DE MÉTODO PARA CREAR POLÍGONO DE TIPO RECTÁNGULO
	static Poligono crearPoligono(double lado1, double lado2) {
		Poligono poligono = new Rectangulo(lado1, lado2);
		return poligono;
	}

	// SOBRECARGA DE MÉTODO PARA CREAR POLÍGONO DE TIPO TRIÁNGULO
	static Poligono crearPoligono(double lado1, double lado2, double lado3) {
		Poligono poligono = new Triangulo(lado1, lado2, lado3);
		return poligono;
	}

	public static void introducirRectangulo(ArrayList<Poligono> listaPoligonos) {
		double lado1;
		double lado2;
		System.out.println("Introducir rectángulo seleccionado");
		System.out.println("Introduzca el lado 1: ");
		lado1 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Introduzca el lado 2: ");
		lado2 = sc.nextDouble();
		sc.nextLine();
		listaPoligonos.add(crearPoligono(lado1, lado2));
		System.out.println("Rectángulo añadido con éxito");
	}

	public static void introducirTriangulo(ArrayList<Poligono> listaPoligonos) {
		double lado1;
		double lado2;
		double lado3;
		System.out.println("Introducir triángulo seleccionado");
		System.out.println("Introduzca el lado 1: ");
		lado1 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Introduzca el lado 2: ");
		lado2 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Introduzca el lado 3: ");
		lado3 = sc.nextDouble();
		sc.nextLine();
		listaPoligonos.add(crearPoligono(lado1, lado2, lado3));
		System.out.println("Triángulo añadido con éxito");
	}

	static void mostrarPoligonos(ArrayList<Poligono> listaPoligonos) {
		if (listaPoligonos.isEmpty()) {
			System.out.println("La lista está vacía");
		} else {
			System.out.println("Listado de polígonos: ");
			for (Poligono poligono : listaPoligonos) {
				System.out.println(poligono);
				System.out.println("Area del polígono: " + poligono.area()+"\n");
			}
		}
	}

}

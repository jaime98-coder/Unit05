package ejercicio005;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcionMenu;
		int lado1;
		int lado2;
		int lado3;

		ArrayList<Poligono> listaPoligonos = new ArrayList<>();
		System.out.println("1. Introducir triángulo");
		System.out.println("2. Introducir rectángulo");
		System.out.println("3. Mostrar polígonos");
		System.out.println("4. Salir");
		System.out.println("--------------------------");
		System.out.println("Elige una opción: ");
		opcionMenu = sc.nextInt();
		switch (opcionMenu) {
		case 1: {
			System.out.println("Introducir triángulo seleccionado");
			System.out.println("Introduzca el lado 1: ");
			lado1 = sc.nextInt();
			sc.nextLine();
			System.out.println("Introduzca el lado 2: ");
			lado2 = sc.nextInt();
			sc.nextLine();
			System.out.println("Introduzca el lado 3: ");
			lado3 = sc.nextInt();
			sc.nextLine();
			listaPoligonos.add(crearPoligono(lado1, lado2, lado3));
			break;
		}
		case 2: {
			System.out.println("Introducir rectángulo seleccionado");
			System.out.println("Introduzca el lado 1: ");
			lado1 = sc.nextInt();
			sc.nextLine();
			System.out.println("Introduzca el lado 2: ");
			lado2 = sc.nextInt();
			sc.nextLine();
			sc.nextLine();
			listaPoligonos.add(crearPoligono(lado1, lado2));
			break;
		}
		case 3: {
			System.out.println("Mostrar polígonos seleccionado");
			listaPoligonos.toString();
			break;
		}
		case 4: {
			System.out.println("Saliendo del programa...");
			break;
		}
		}

		sc.close();
	}

	// SOBRECARGA DE MÉTODO PARA CREAR POLÍGONO DE TIPO RECTÁNGULO
	static Poligono crearPoligono(int lado1, int lado2) {
		Poligono poligono = new Rectangulo(lado1, lado2);
		return poligono;
	}

	// SOBRECARGA DE MÉTODO PARA CREAR POLÍGONO DE TIPO TRIÁNGULO
	static Poligono crearPoligono(int lado1, int lado2, int lado3) {
		Poligono poligono = new Triangulo(lado1, lado2, lado3);
		return poligono;
	}
	
// ANTES HICE ESTO, PERO HICE AHORA SOBRECARGA DE METODOS MEJOR
//	static Triangulo crearTriangulo(int lado1, int lado2, int lado3) {
//		Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
//		return triangulo;
//	}

//	static Rectangulo crearRectangulo(int lado1, int lado2) {
//		Rectangulo rectangulo = new Rectangulo(lado1, lado2);
//		return rectangulo;
//	}

}

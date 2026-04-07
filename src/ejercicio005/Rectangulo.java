package ejercicio005;

public class Rectangulo extends Poligono {
	private double lado1;
	private double lado2;

	public Rectangulo(double lado1, double lado2) {
		super(4);
		if (!setLado1(lado1)) {
			this.lado1 = 1;
		}
		if (!setLado2(lado2)) {
			this.lado2 = 1;
		}

	}

	// Constructor SIN parámetros (vacío) que exige el enunciado
	public Rectangulo() {
		super(4);
		this.lado1 = 1;
		this.lado2 = 1;
	}

	public double getLado1() {
		return lado1;
	}

	public boolean setLado1(double lado1) {
		boolean esCorrecto = false;
		if (lado1 > 0) {
			this.lado1 = lado1;
			esCorrecto = true;
		}
		return esCorrecto;

	}

	public double getLado2() {
		return lado2;
	}

	public boolean setLado2(double lado2) {
		boolean esCorrecto = false;
		if (lado2 > 0) {
			this.lado2 = lado2;
			esCorrecto = true;
		}
		return esCorrecto;

	}

	@Override
	public String toString() {
		return "Rectangulo - Lado 1: " + lado1 + ", Lado 2: " + lado2;
	}

	@Override
	public double area() {
		double area;
		area = lado1 * lado2;
		return area;
	}

}

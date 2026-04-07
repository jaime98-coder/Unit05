package ejercicio005;

public class Triangulo extends Poligono {
	private double lado1;
	private double lado2;
	private double lado3;

	public Triangulo(double lado1, double lado2, double lado3) {
		super(3);
		if (!setLado1(lado1)) {
			this.lado1 = 1;
		}
		if (!setLado2(lado2)) {
			this.lado2 = 1;
		}
		if (!setLado3(lado3)) {
			this.lado3 = 1;
		}

	}

	// Constructor SIN parámetros (vacío) que exige el enunciado 
    public Triangulo() {
        super(3); // Un triángulo siempre tiene 3 lados, aunque esté vacío
        // Por defecto el tamaño de los lados es 1 
        this.lado1 = 1;
        this.lado2 = 1;
        this.lado3 = 1;
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

	public double getLado3() {
		return lado3;
	}

	public boolean setLado2(double lado2) {
		boolean esCorrecto = false;
		if (lado2 > 0) {
			this.lado2 = lado2;
			esCorrecto = true;
		}
		return esCorrecto;

	}

	public boolean setLado3(double lado3) {
		boolean esCorrecto = false;
		if (lado3 > 0) {
			this.lado3 = lado3;
			esCorrecto = true;
		}
		return esCorrecto;

	}

	@Override
	public String toString() {
		return "Triángulo - Lado 1: " + lado1 + ", Lado 2:" + lado2 + ", Lado 3: " + lado3 ;
	}

	/*
	 * Método para cálcular el área del triángulo sin saber su altura. Con la
	 * fórmula de Herón
	 */
	@Override
	public double area() {
		double area;
		double semiPerimetro = (lado1 + lado2 + lado3) / 2;
		area = Math.sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));
		return area;
	}

}

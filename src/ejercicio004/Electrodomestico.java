package ejercicio004;

public class Electrodomestico {
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;

	/**
	 * Constructor con todos los atributos
	 * 
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 */
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		if (!setPrecioBase(precioBase)) {
			this.precioBase = 100;
		}
		// Comprobación para valor por defecto
		if (!setColor(color)) {
			this.color = "blanco";
		}
		if (!setConsumoEnergetico(consumoEnergetico)) {
			this.consumoEnergetico = 'F';
		}
		if (!setPeso(peso)) {
			this.peso = 5;
		}
	}

	/**
	 * Constructor con los atributos precioBase y peso
	 * 
	 * @param precioBase
	 * @param peso
	 */
	public Electrodomestico(double precioBase, double peso) {
		if (!setPrecioBase(precioBase)) {
			this.precioBase = 100;
		}
		if (!setPeso(peso)) {
			this.peso = 5;
		}
		setColor("blanco");
		setConsumoEnergetico('F');
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public boolean setPrecioBase(double precioBase) {
		boolean esValido = false;
		if (precioBase >= 0) {
			this.precioBase = precioBase;
			esValido = true;
		}
		return esValido;
	}

	public String getColor() {
		return color;
	}

	public boolean setColor(String color) {
		boolean esValido = false;
		if (comprobarColor(color)) {
			this.color = color;
			esValido = true;
		}
		return esValido;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public boolean setConsumoEnergetico(char consumoEnergetico) {
		boolean esValido = false;
		if (comprobarConsumoEnergetico(consumoEnergetico)) {
			this.consumoEnergetico = consumoEnergetico;
			esValido = true;
		}
		return esValido;
	}

	public double getPeso() {
		return peso;
	}

	public boolean setPeso(double peso) {
		boolean esValido = false;
		if (peso >= 0) {
			this.peso = peso;
			esValido = true;
		}
		return esValido;
	}

	/**
	 * Método para comprobar si la letra es
	 * 
	 * @param letra
	 * @return
	 */
	private boolean comprobarConsumoEnergetico(char letra) {
		boolean esCorrecta = false;
		if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
			esCorrecta = true;
		}
		return esCorrecta;
	}

	/**
	 * Método para comprobar color
	 * 
	 * @param color
	 * @return
	 */
	private boolean comprobarColor(String color) {
		boolean esCorrecto = false;
		if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo")
				|| color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
			esCorrecto = true;
		}
		return esCorrecto;
	}

	/**
	 * Método para calcular el precioFinal teniendo en cuenta el consumo energetico
	 * y el peso
	 * 
	 * @return double de precio base + precio según consumo energetico + precio
	 *         segun peso
	 */
	public double precioFinal() {
		double precioFinal = this.precioBase;
		switch (this.consumoEnergetico) {
		case 'A': {
			precioFinal += 100;
			break;
		}
		case 'B': {
			precioFinal += 80;
			break;
		}
		case 'C': {
			precioFinal += 60;
			break;
		}
		case 'D': {
			precioFinal += 50;
			break;
		}
		case 'E': {
			precioFinal += 30;
			break;
		}
		case 'F': {
			precioFinal += 10;
			break;
		}
		}

		if (this.peso >= 0 && this.peso <20) {
			precioFinal += 10;
		} else if (this.peso >= 20 && this.peso < 50) {
			precioFinal += 50;

		} else if (this.peso >= 50 && this.peso < 80) {
			precioFinal += 80;
		} else if (this.peso >= 80) {
			precioFinal += 100;
		}

		return precioFinal;

	}

}

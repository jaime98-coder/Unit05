package ejercicio004;

class Lavadora extends Electrodomestico {
	private double carga;

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = 5;
	}

	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
		super(precioBase, color, consumoEnergetico, peso);
		if (!setCarga(carga)) {
			this.carga = 5;
		}
	}

	public double getCarga() {
		return carga;
	}

	public boolean setCarga(double carga) {
		boolean esCorrecta = false;
		if (carga >= 0) {
			this.carga = carga;
			esCorrecta = true;
		}
		return esCorrecta;
	}

	/**
	 * Método para calcular el precio final, teniendo en cuenta los kg de carga y
	 * los datos de la clase padre
	 * 
	 * @return double con el precio final, teniendo el cuenta el método precioFinal
	 *         de la clase electrodomestico (padre)
	 */
	@Override
	public double precioFinal() {
		double precioFinal = super.precioFinal();
		if (this.carga > 30) {
			precioFinal += 50;
		}
		return precioFinal;
	}

}

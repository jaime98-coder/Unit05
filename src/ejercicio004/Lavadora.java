package ejercicio004;

class Lavadora extends Electrodomestico {
	private double carga;

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		if (!setCarga(peso)) {
			this.carga = 5;
		}
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

}

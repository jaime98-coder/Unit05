package ejercicio004;

class Television extends Electrodomestico {
	private int resolucion;
	private boolean sintonizadorTDT;

	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		this.resolucion = 20;
		this.sintonizadorTDT = false;
	}

	public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion,
			boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		if (!setResolucion(resolucion)) {
			this.resolucion = 20;
		}
		if (!setSintonizadorTDT(sintonizadorTDT)) {
			this.sintonizadorTDT = false;
		}
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean setResolucion(int resolucion) {
		boolean esCorrecta = false;
		if (resolucion > 0) {
			this.resolucion = resolucion;
			esCorrecta = true;
		}
		return esCorrecta;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public boolean setSintonizadorTDT(boolean sintonizadorTDT) {
		boolean sintonizaTDT = false;
		if (sintonizadorTDT) {
			this.sintonizadorTDT = sintonizadorTDT;
			sintonizaTDT = true;
		}
		return sintonizaTDT;
	}

	/**
	 * Método para calcular el precio final de la televisison.
	 * @return double con el precio final. teniendo en cuenta el tamaño de la pantalla (resolucion) y si sintoniza o no tdt
	 */
	@Override
	public double precioFinal() {
		double precioFinal = super.precioFinal();
		if (this.resolucion > 40) {
			precioFinal *= 1.3;
		}
		if (this.sintonizadorTDT) {
			precioFinal += 50;
		}
		return precioFinal;
	}

}

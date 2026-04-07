package ejercicio005;

abstract class Poligono {
	protected int numeroLados;

	public Poligono(int numeroLados) {
		setNumeroLados(numeroLados);
	}

	public int getNumeroLados() {
		return numeroLados;
	}

	public void setNumeroLados(int numeroLados) {
		if (numeroLados > 0) {
			this.numeroLados = numeroLados;
		}
	}

	@Override
	public String toString() {
		return "Numero de lados:" + numeroLados;
	}

	/**
	 * Método abstracto para el area, ya que varia segun el poligono
	 * 
	 * @return double con el area concreta
	 */
	public abstract double area();

}

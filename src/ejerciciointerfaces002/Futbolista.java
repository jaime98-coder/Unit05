package ejerciciointerfaces002;

class Futbolista implements Comparable<Futbolista> {
	private int numeroCamiseta;
	private String nombre;
	private int edad;
	private int numeroGoles;

	public Futbolista(int numeroCamiseta, String nombre, int edad, int numeroGoles) {
		setNumeroCamiseta(numeroCamiseta);
		setNombre(nombre);
		setEdad(edad);
		setNumeroGoles(numeroGoles);
	}

	public int getNumeroCamiseta() {
		return numeroCamiseta;
	}

	public void setNumeroCamiseta(int numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumeroGoles() {
		return numeroGoles;
	}

	public void setNumeroGoles(int numeroGoles) {
		this.numeroGoles = numeroGoles;
	}

	@Override
	public int compareTo(Futbolista otroFutbolista) {
		int resultado = 0;

		if (this.numeroCamiseta < otroFutbolista.numeroCamiseta) {
			resultado = -1;
		} else if (this.numeroCamiseta > otroFutbolista.numeroCamiseta) {
			resultado = 1;
		} else {
			resultado = this.nombre.compareToIgnoreCase(otroFutbolista.nombre);
		}
		return resultado;
	}

	/**
	 * Método para identificar duplicados (Inspector de DNI). Obligatorio recibir un
	 * Object genérico.
	 */
	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = false;
		if (obj instanceof Futbolista) {
			Futbolista otroFutbolista = (Futbolista) obj;

			if (this.numeroCamiseta == otroFutbolista.numeroCamiseta
					&& this.nombre.equalsIgnoreCase(otroFutbolista.nombre)) {
				sonIguales = true;
			}

		}
		return sonIguales;
	}

	@Override
	public String toString() {
		return "Futbolista [numeroCamiseta=" + numeroCamiseta + ", nombre=" + nombre + ", edad=" + edad
				+ ", numeroGoles=" + numeroGoles + "]";
	}

}

package ejercicioanalisis002;

public class DVD extends Ficha {
	private static final int MAX_DIAS_PRESTAMO = 5;
	private String director;
	private int anioPublicacion;
	private String tipo;

	public DVD(int numero, String titulo, String director, int anioPublicacion, String tipo) {
		super(numero, titulo);
		setDirector(director);
		setAnioPublicacion(anioPublicacion);
		setTipo(tipo);
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		if (anioPublicacion > 0) {
			this.anioPublicacion = anioPublicacion;
		} else {
			throw new IllegalArgumentException(
					"ERROR: El año de publicación no puede ser cero o negativo. Valor recibido: " + anioPublicacion);
		}
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (tipo.equalsIgnoreCase("pelicula") || tipo.equalsIgnoreCase("documental")
				|| tipo.equalsIgnoreCase("serie")) {
			this.tipo = tipo;
		} else {
			throw new IllegalArgumentException(
					"ERROR. El tipo de DVD puede ser: Pelicula, Documental o Serio. Tipo que has introducido: " + tipo);
		}
	}

	/**
	 * Método para devolver los dias de prestamos para los DVD, devolviendo la
	 * constante 5.
	 */
	public int getDiasPrestamo() {
		return MAX_DIAS_PRESTAMO;
	}

	@Override
	public String toString() {
		return super.toString() + " -> DVD [director=" + director + ", anioPublicacion=" + anioPublicacion + ", tipo="
				+ tipo + ", días de préstamo=" + MAX_DIAS_PRESTAMO + "]";
	}

}

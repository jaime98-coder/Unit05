package ejercicioanalisis002;

public class Revista extends Ficha {
	private static final int MAX_DIAS_PRESTAMO = 10;
	private int numeroRevista;
	private int anioPublicacion;

	public Revista(int numero, String titulo, int numeroRevista, int anioPublicacion) {
		super(numero, titulo);
		setNumero(numeroRevista);
		setAnioPublicacion(anioPublicacion);
	}

	public int getNumeroRevista() {
		return numeroRevista;
	}

	public void setNumeroRevista(int numeroRevista) {
		if (numeroRevista > 0) {
			this.numeroRevista = numeroRevista;
		}
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		if (anioPublicacion > 0) {
			this.anioPublicacion = anioPublicacion;
		}
	}

	/**
	 * En el método getDiasPrestamo lo pongo como 10, porque es el valor
	 * correspondiente a las revistas
	 */
	public int getDiasPrestamo() {
		return MAX_DIAS_PRESTAMO;

	}

	@Override
	public String toString() {
		return super.toString() + " Revista [numeroRevista=" + numeroRevista + ", anioPublicacion=" + anioPublicacion
				+ "]";
	}

}

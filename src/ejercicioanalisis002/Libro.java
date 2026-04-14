package ejercicioanalisis002;

public class Libro extends Ficha {
	private static final int MAX_DIAS_PRESTAMO = 15;
	private String autor;
	private String editorial;

	public Libro(int numero, String titulo, String autor, String editorial) {
		super(numero, titulo);
		setAutor(autor);
		setEditorial(editorial);
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * En el método getDiasPrestamo lo pongo como 15, porque es el valor
	 * correspondiente a los libros
	 */
	public int getDiasPrestamo() {
		return MAX_DIAS_PRESTAMO;

	}

	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", editorial=" + editorial + "]";
	}

}

package ejercicioanalisis002;

public abstract class Ficha {
	protected int numero = 1;
	protected String titulo;
	protected boolean prestado = false;

	public Ficha(int numero, String titulo) {
		setNumero(numero);
		setTitulo(titulo);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero > 0) {
			this.numero = numero;
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public boolean prestarObjeto() {
		boolean operacionExitosa = false;
		if (!this.prestado) {
			this.prestado = true;
			operacionExitosa = true;
		}
		return operacionExitosa;

	}

	public boolean devolverObjeto() {
		boolean operacionExitosa = false;
		if (this.prestado) {
			this.prestado = false;
			operacionExitosa = true;
		}
		return operacionExitosa;
	}

	public abstract int getDiasPrestamo();

	@Override
	public String toString() {
		return "Ficha [numero=" + numero + ", titulo=" + titulo + ", esPrestado=" + prestado + " ";
	}

}

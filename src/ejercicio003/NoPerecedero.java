package ejercicio003;

public class NoPerecedero extends Producto {
	private String tipo;

	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		setTipo(tipo);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Método para calcular el precio por la cantidad de Productos
	 * 
	 * @param cantidadProductos. Cantidad de productos para multiplicar precio *
	 *                           esto.
	 * @return resultado. precio*cantidadProductos
	 */
	public double calcular(int cantidadProductos) {
		double precio;
		precio = super.calcular(cantidadProductos);
		return precio;
	}

}

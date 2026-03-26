package ejercicio003;

public class Perecedero extends Producto {
	private int diasACaducar;

	public Perecedero(String nombre, double precio, int diasACaducar) {
		super(nombre, precio);
		setDiasACaducar(diasACaducar);
	}

	public int getDiasACaducar() {
		return diasACaducar;
	}

	// Permito días a caducar negativos por si quiero verificar los números
	// negativos, significando así que están caducados desde hace X dias
	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}

	/**
	 * Método para calcular el precio según los días a caducar que le queden a la
	 * subclase Perecedero (Producto). Reutilizando el método de la superclase
	 * Producto
	 * 
	 * @param cantidadProductos. Cantidad de productos para hacer el cálculo
	 * @return double con precioFinal con el "descuento" realizado
	 */
	public double calcular(int cantidadProductos) {
		double precioFinal = super.calcular(cantidadProductos);
		if (this.diasACaducar == 1) {
			precioFinal /= 4;
		} else if (this.diasACaducar == 2) {
			precioFinal /= 3;
		} else if (this.diasACaducar == 3) {
			precioFinal /= 2;
		}
		return precioFinal;

	}

}

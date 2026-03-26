package ejercicio003;

public class Producto {
	protected String nombre;
	protected double precio;

	public Producto(String nombre, double precio) {
		if (!setNombre(nombre)) {
			this.nombre = "Desconocido";
		}
		if (!setPrecio(precio)) {
			this.precio = 0.0;
		}
	}

	public String getNombre() {
		return nombre;
	}

	/**
	 * Set nombre pero booleano, para proteger a tu objeto poniéndole un valor por
	 * defecto si le meten datos erróneos.
	 * 
	 * @param nombre
	 * @return
	 */
	public boolean setNombre(String nombre) {
		boolean nombreCambiado = false;
		//// Evitamos que nos pasen un nombre vacío o nulo
		if (nombre != null && !nombre.trim().isEmpty()) {
			this.nombre = nombre;
			nombreCambiado = true;
		}
		return nombreCambiado;

	}

	public double getPrecio() {
		return precio;
	}

	/**
	 * Set precio pero booleano, para proteger a tu objeto poniéndole un valor por
	 * defecto si le meten datos erróneos.
	 * 
	 * @param precio
	 * @return True --> Precio cambió. False --> Precio no cambió
	 */
	public boolean setPrecio(double precio) {
		boolean precioCambiado = false;
		if (precio >= 0) {
			this.precio = precio;
			precioCambiado = true;
		}
		return precioCambiado;
	}

	@Override
	public String toString() {
		return "Producto : " + nombre + " || Precio: " + precio;
	}

	/**
	 * Método para calcular el precio por la cantidad de Productos
	 * 
	 * @param cantidadProductos. Cantidad de productos para multiplicar precio *
	 *                           esto.
	 * @return resultado. precio*cantidadProductos
	 */
	public double calcular(int cantidadProductos) {
		double resultado = 0;
		// No seria necesario comprobar que el precio no sea negativo, porque el metodo
		// setPrecio ya nos garantizó que es imposible un precio negativo
		if (cantidadProductos >= 0) {
			resultado = this.precio * cantidadProductos;
		}

		return resultado;
	}

}

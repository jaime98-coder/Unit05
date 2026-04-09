package ejerciciointerfaces001;

class Socio implements Comparable<Socio> {
	private int id;
	private String nombre;
	private int edad;

	public Socio(int id, String nombre, int edad) {
		setId(id);
		setNombre(nombre);
		setEdad(edad);
	}

	/**
	 * Método compareTo para comparar IDs de los socios
	 * 
	 * @return resultado: 0 -> Iguales (mismo id, no es posible salvo error). 1 ->
	 *         id del objeto introducido es mayor. -1 -> id introducido es menor
	 */
	@Override
	public int compareTo(Socio otroSocio) {
		int resultado = 0;
		if (this.id < otroSocio.id) {
			resultado = -1;
		} else if (this.id > otroSocio.id) {
			resultado = 1;
		}
		return resultado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Socio [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
}

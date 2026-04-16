package ejerciciocomparator002;

public class Socio {
	
	private String nombre;
	private Integer edad;
	
	public Socio(String nombre, Integer edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}


	public Integer getEdad() {
		return edad;
	}


	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", edad=" + edad + "]";
	}


	
	

}

package ejerciciocomparator003;

public class Futbolista {
	private String nombre;
	private Integer edad;
	private Integer goles;

	public Futbolista(String nombre, Integer edad, Integer goles) {
		this.nombre = nombre;
		this.edad = edad;
		this.goles = goles;
	}

	public Integer getEdad() {
		return edad;
	}

	public Integer getGoles() {
		return goles;
	}

	@Override
	public String toString() {
		return "Futbolista [ Nombre: " + nombre + "| Edad: " + edad + " | Goles:" + goles + " ]";
	}

}

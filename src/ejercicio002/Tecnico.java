package ejercicio002;

public class Tecnico extends Operario {

	public Tecnico(String nombre) {
		super(nombre);
	}

	public String toString() {
		return super.toString() + " --> Tenico";
	}

}

package ejercicioInterfaces003;

public class Perro extends AnimalDomestico {
	private static final double PROBABILIDAD_OBEDIENCIA = 0.90;

	public Perro(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);

	}

	public void sacarPaseo() {
		System.out.println(super.getNombre() + " está dando un paseo");
	}

	@Override
	public void hacerRuido() {
		System.out.println(super.getNombre() + " dice ¡Guau!");

	}

	@Override
	public boolean hacerCaso() {
		boolean hizoCaso = true;

		if (Math.random() < PROBABILIDAD_OBEDIENCIA) {
			hizoCaso = false;
		}

		return hizoCaso;
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", peso=" + peso + ", color=" + color + "]";
	}
	

}

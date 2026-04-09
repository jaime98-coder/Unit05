package ejercicioInterfaces003;

public class Gato extends AnimalDomestico {
	private static final double PROBABILIDAD_OBEDIENCIA = 0.05;

	public Gato(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);

	}

	public void toserBolaPelo() {
		System.out.println(super.getNombre() + " está tosiendo pelo");
	}

	@Override
	public void hacerRuido() {
		System.out.println(super.getNombre() + " dice ¡Miau!");

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
		return "Gato [nombre=" + nombre + ", raza=" + raza + ", peso=" + peso + ", color=" + color + "]";
	}

}

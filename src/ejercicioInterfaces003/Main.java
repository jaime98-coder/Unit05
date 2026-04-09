package ejercicioInterfaces003;

public class Main {

	public static void main(String[] args) {
		Perro perro = new Perro("Rex", "Pastor Aleman", 30.5, "marrón");
		Gato gato = new Gato("Ulises", "Siames", 4.5, "blanco");

		mostrarPerro(perro);
		mostrarGato(gato);
		demostrarPolimorfismoVivir (new Vivir[] {perro, gato});
		demostrarPolimorfismoAnimalDomestico (new AnimalDomestico[] {perro, gato});

	}

	private static void mostrarPerro(Perro perro) {
		System.out.println("--------PERRO--------");
		System.out.println(perro);
		perro.comer();
		perro.dormir();
		perro.hacerRuido();
		imprimirObediencia(perro.getNombre(), perro.hacerCaso());
		perro.vacunar();
		perro.sacarPaseo();
		System.out.println();

	}

	private static void mostrarGato(Gato gato) {
		System.out.println("--------GATO--------");
		System.out.println(gato);
		gato.comer();
		gato.dormir();
		gato.hacerRuido();
		imprimirObediencia(gato.getNombre(), gato.hacerCaso());
		gato.vacunar();
		gato.toserBolaPelo();
		System.out.println();

	}

	private static void imprimirObediencia(String nombre, boolean obedece) {
		System.out.println(nombre + (obedece ? " hace caso." : " no hace caso"));
	}

	/**
	 * Método para comprobar polimorfismo, porque es un array 
	 * @param animales
	 */
	private static void demostrarPolimorfismoVivir(Vivir[] animales) {
		System.out.println("---------POLIMORFISMO VIVIR[]---------");
		for (Vivir animal : animales) {
			animal.hacerRuido();
		}
		System.out.println();
	}
	private static void demostrarPolimorfismoAnimalDomestico(AnimalDomestico[] animales) {
		System.out.println("---------POLIMORFISMO ANIMAL DOMESTICO[]---------");
		for (AnimalDomestico animal : animales) {
			animal.hacerRuido();
		}
		System.out.println();
	}

}

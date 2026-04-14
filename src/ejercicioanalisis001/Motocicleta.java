package ejercicioanalisis001;

public class Motocicleta extends Vehiculo {
	private int cilindrada;

	public Motocicleta(String marca, String modelo, String color, String matricula, int cilindrada) {
		super(marca, modelo, color, matricula);
		setCilindrada(cilindrada);
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		if (cilindrada >= 0) {
			this.cilindrada = cilindrada;
		}
	}

	public boolean necesitaCarnet() {
		boolean necesitaCarnet = false;
		if (cilindrada >= 125) {
			necesitaCarnet = true;
		}
		return necesitaCarnet;
	}

	@Override
	public String toString() {
		return "Motocicleta [cilindrada=" + cilindrada + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color
				+ ", matricula=" + matricula + ", motorEncendido=" + motorEncendido + ", marchaActual=" + marchaActual
				+ ", velocidadActual=" + velocidadActual + "]";
	}

}

package ejercicioanalisis001;

public class Camion extends Vehiculo {
	private double pesoMaximoAutorizado;
	private boolean transportaMercanciaPeligrosa;

	public Camion(String marca, String modelo, String color, String matricula, double pesoMaximoAutorizado,
			boolean transportaMercanciaPeligrosa) {
		super(marca, modelo, color, matricula);
		setPesoMaximoAutorizado(pesoMaximoAutorizado);
		setTransportaMercanciaPeligrosa(transportaMercanciaPeligrosa);
	}

	public double getPesoMaximoAutorizado() {
		return pesoMaximoAutorizado;
	}

	public void setPesoMaximoAutorizado(double pesoMaximoAutorizado) {
		if (pesoMaximoAutorizado >= 0) {
			this.pesoMaximoAutorizado = pesoMaximoAutorizado;
		}
	}

	public boolean isTransportaMercanciaPeligrosa() {
		return transportaMercanciaPeligrosa;
	}

	public void setTransportaMercanciaPeligrosa(boolean transportaMercanciaPeligrosa) {
		this.transportaMercanciaPeligrosa = transportaMercanciaPeligrosa;
	}

	@Override
	public String toString() {
		return "Camion [pesoMaximoAutorizado=" + pesoMaximoAutorizado + ", transportaMercanciaPeligrosa="
				+ transportaMercanciaPeligrosa + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color
				+ ", matricula=" + matricula + ", motorEncendido=" + motorEncendido + ", marchaActual=" + marchaActual
				+ ", velocidadActual=" + velocidadActual + "]";
	}

}

package ejercicioanalisis001;

public class Turismo extends Vehiculo {
	private int numeroPlazas;
	private String tipoUso = "tipo sin especificar";

	public Turismo(String marca, String modelo, String color, String matricula, int numeroPlazas, String tipoUso) {
		super(marca, modelo, color, matricula);
		setNumeroPlazas(numeroPlazas);
		setTipoUso(tipoUso);
	}

	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	/*
	 * Setter para el nº de plazas, suponiendo que el máximo de plazas es 5
	 */
	public void setNumeroPlazas(int numeroPlazas) {
		if (numeroPlazas > 0 && numeroPlazas <= 5) {
			this.numeroPlazas = numeroPlazas;
		}
	}

	public String getTipoUso() {
		return tipoUso;
	}

	public void setTipoUso(String tipoUso) {
		if (tipoUso.equalsIgnoreCase("profesional") || tipoUso.equalsIgnoreCase("particular")) {
			this.tipoUso = tipoUso;
		}
	}

	@Override
	public String toString() {
		return "Turismo [numeroPlazas=" + numeroPlazas + ", tipoUso=" + tipoUso + ", marca=" + marca + ", modelo="
				+ modelo + ", color=" + color + ", matricula=" + matricula + ", motorEncendido=" + motorEncendido
				+ ", marchaActual=" + marchaActual + ", velocidadActual=" + velocidadActual + "]";
	}
	
	

}

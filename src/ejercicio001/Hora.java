package ejercicio001;

public class Hora {
	protected int hora;
	protected int minuto;

	public Hora(int hora, int minuto) {
		if (!setHora(hora)) {
			this.hora = 0;
		}
		if (!setMinuto(minuto)) {
			this.minuto	 = 0;
		}
	}

	/**
	 * Método para cambiar el minuto
	 * 
	 * @param valor. Nuevo valor que tendrá los minutos @return. True --> Minuto
	 *               cambiado (valor correcto). False --> No se cambió minuto
	 *               (parametro de entrada inválido)
	 */
	public boolean setMinuto(int valor) {
		boolean minutoCambiado = false;
		if (valor >= 0 && valor < 60) {
			this.minuto = valor;
			minutoCambiado = true;
		}
		return minutoCambiado;
	}

	/**
	 * Método para modificar la hora
	 * 
	 * @param Nuevo valor que tendrá las horas @return. True --> Hora cambiada
	 *              (valor correcto). False --> No se cambió hora (parametro de
	 *              entrada inválido)
	 */
	public boolean setHora(int valor) {
		boolean horaCambiada = false;
		if (valor >= 0 && valor < 24) {
			this.hora = valor;
			horaCambiada = true;
		}
		return horaCambiada;
	}

	/**
	 * Método para incrementar un minuto
	 */
	public void inc() {
		if (minuto == 59) {
			minuto = 0;
			if (hora == 23) {
				hora = 0;
			} else {
				this.hora++;
			}
		} else {
			this.minuto++;
		}
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d", this.hora, this.minuto);
	}

	// Getters para que las clases hijas puedan leer los valores si los necesitan
	public int getHora() {
		return this.hora;
	}

	public int getMinuto() {
		return this.minuto;
	}

}

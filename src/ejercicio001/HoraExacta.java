package ejercicio001;

public class HoraExacta extends Hora {

	private int segundo;

	/**
	 * Constructor con atributos de la superclase Hora
	 * 
	 * @param hora
	 * @param minuto
	 */
	public HoraExacta(int hora, int minuto) {
		super(hora, minuto);
		this.segundo = 0;

	}

	/**
	 * Constructor completo
	 * 
	 * @param hora.    Atributo de la Superclase // * @param minuto. Atributo de la
	 *                 Superclase
	 * @param segundo. Atributo de la Subclase
	 */
	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		if (!setSegundo(segundo)) {
			this.segundo = 0;
		}
	}

	/**
	 * Método set con restriccion
	 * 
	 * @param segundo. Nuevos segundos
	 * @return True --> Segundo modificado (valor incorrecto). False --> Segundo no
	 *         modificado (valor incorrecto)
	 */
	public boolean setSegundo(int segundo) {
		boolean segundoModificado = false;
		if (segundo >= 0 && segundo < 60) {
			this.segundo = segundo;
			segundoModificado = true;
		}
		return segundoModificado;
	}

	/**
	 * Método para incrementar la hora un segundo
	 */
	public void inc() {
		// Si el segundo es 59, se pone a 0 y se incrementa un minuto
		if (this.segundo == 59) {
			this.segundo = 0;
			super.inc();
		} else {
			this.segundo++;
		}
	}

	@Override
	public String toString() {
		// Concatenamos el toString perfecto del padre con nuestros segundos formateados
		return super.toString() + String.format(":%02d", this.segundo);
	}

}

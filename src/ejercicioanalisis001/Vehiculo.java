package ejercicioanalisis001;

public abstract class Vehiculo {
	protected String marca;
	protected String modelo;
	protected String color;
	protected String matricula;
	protected boolean motorEncendido = false;
	protected int marchaActual = 0;
	protected int velocidadActual = 0;

	public Vehiculo(String marca, String modelo, String color, String matricula) {
		setMarca(marca);
		setModelo(modelo);
		setColor(color);
		setMatricula(matricula);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public boolean isMotorEncendido() {
		return motorEncendido;
	}

	public int getMarchaActual() {
		return marchaActual;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void parar() {
		this.motorEncendido = false;
		this.marchaActual = 0;
	}

	public void arrancar() {
		this.motorEncendido = true;
		if (this.velocidadActual == 0) {
			this.marchaActual = 1;
		}

	}

	public void subirMarcha() {
		if (this.marchaActual >= 0 && this.marchaActual < 5) {
			this.marchaActual++;
		}
	}

	public void bajarMarcha() {
		if (this.marchaActual > 0 && this.marchaActual <= 5) {
			this.marchaActual--;
		}
	}

	public void acelerar(int velocidadObjetivo) {
		if (this.motorEncendido) {
			boolean objetivoAlcanzado = false;
			while (!objetivoAlcanzado) {
				if (this.velocidadActual >= velocidadObjetivo) {
					objetivoAlcanzado = true;
				} else {
					this.velocidadActual++;
					if (this.velocidadActual == 31 || this.velocidadActual == 51 || this.velocidadActual == 71
							|| this.velocidadActual == 101) {
						subirMarcha();
					}
				}
			}
		}
	}

	public void frenarHastaParar() {
		boolean vehiculoDetenido = false;
		while (!vehiculoDetenido) {
			if (this.velocidadActual == 0) {
				vehiculoDetenido = true;
			} else {
				this.velocidadActual--;
				if (this.velocidadActual == 30 || this.velocidadActual == 50 || this.velocidadActual == 70
						|| this.velocidadActual == 100) {
					bajarMarcha();
				}
			}
		}
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", matricula=" + matricula
				+ ", motorEncendido=" + motorEncendido + ", marchaActual=" + marchaActual + ", velocidadActual="
				+ velocidadActual + "]";
	}

}

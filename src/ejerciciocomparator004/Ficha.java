package ejerciciocomparator004;

public class Ficha implements Comparable<Ficha> {

	private int idFicha;
	private String tituloFicha;
	
	public Ficha(int idFicha, String tituloFicha) {
		super();
		this.idFicha = idFicha;
		this.tituloFicha = tituloFicha;
	}
	
	public int getIdFicha() {
		return idFicha;
	}


	public String getTituloFicha() {
		return tituloFicha;
	}

	@Override
	public int compareTo(Ficha otraFicha) {
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
		return Integer.compare(this.idFicha, otraFicha.getIdFicha());

	}

	@Override
	public String toString() {
		return "Ficha [idFicha=" + idFicha + ", tituloFicha=" + tituloFicha + "]";
	}

}

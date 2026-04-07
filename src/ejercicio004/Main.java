package ejercicio004;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Electrodomestico> listaElectrodomestico = new ArrayList<Electrodomestico>();
		Electrodomestico lavadora = new Lavadora(100, 23);
		Electrodomestico television = new Television(100, 23);
		listaElectrodomestico.add(lavadora);
		listaElectrodomestico.add(television);

	}

}

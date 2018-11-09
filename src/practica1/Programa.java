package practica1;

import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Premio misPremios[] = Sorteo.creaPremios();
		CajaPremios caja = Sorteo.creaCaja(misPremios);
		ArrayList<Socio> sociosSorteo = Socio.creaSocios();
		


		Sorteo sorteo = new Sorteo();
		sorteo.setCaja(caja);
		sorteo.setSocios(sociosSorteo);
		sorteo.start();
		
	}

}

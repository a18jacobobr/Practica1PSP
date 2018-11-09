package practica1;

import java.util.ArrayList;

public class Socio extends Thread {
	
	//Socios
	
	private int numeroSocio;
	private int numeroRifaSocio;
	
	public Socio(int numeroSocio, int numeroRifaSocio) {
		super();
		this.numeroSocio = numeroSocio;
		this.numeroRifaSocio = numeroRifaSocio;
	}

	public int getNumeroSocio() {
		return numeroSocio;
	}

	public void setNumeroSocio(int numeroSocio) {
		this.numeroSocio = numeroSocio;
	}

	public int getNumeroRifaSocio() {
		return numeroRifaSocio;
	}

	public void setNumeroRifa(int numeroRifaSocio) {
		this.numeroRifaSocio = numeroRifaSocio;
	}
	
	public static ArrayList<Socio> creaSocios () {
		ArrayList <Socio> sociosSorteo = new ArrayList<Socio >();
		for (int i = 0; i < 15; i++) {
			int rifaRandom = (int) (Math.random()*15);
			Socio socio = new Socio(i, rifaRandom);
			sociosSorteo.add(socio);
		}

		return sociosSorteo;
	}
	

}

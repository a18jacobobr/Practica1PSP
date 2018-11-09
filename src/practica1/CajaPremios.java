package practica1;

public class CajaPremios {

	// Contenedor Premios

	private Premio[] premios = new Premio[5];
	private boolean socioCheckea = false;

	public CajaPremios(Premio premio1, Premio premio2, Premio premio3, Premio premio4, Premio premio5) {
		super();
		premios[0] = premio1;
		premios[1] = premio2;
		premios[2] = premio3;
		premios[3] = premio4;
		premios[4] = premio5;

	}

	public Premio[] getPremios() {
		return premios;
	}

	public void setPremios(Premio[] premios) {
		this.premios = premios;
	}

	public synchronized void espera(Socio j) {

		if (socioCheckea) {
			System.out.println("Socio " + j.getNumeroSocio() + " esperando Comprobar");
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Socio " + j.getNumeroSocio() + " liberando Comprobar");
		}

	}

	public synchronized void get(Socio j) {
		Premio premio;
		String resultadoPremio = "";

		/*
		 * while (socioCheckea) { try { wait(); } catch (Exception e) {
		 * e.printStackTrace(); } }
		 */

		espera(j);
		socioCheckea = true;
		try {
			wait((int) (Math.random() * 2000));
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int i = 0; i < 5; i++) {
			premio = premios[i];

			if (premios[i].getNumeroRifaPremio() == -1) {
				resultadoPremio = "Socio " + j.getNumeroSocio() + " sin premio desde caja";

			} else if (j.getNumeroRifaSocio() == premios[i].getNumeroRifaPremio()) {
				premios[i].setNumeroRifaPremio(-1);
				resultadoPremio = "Socio " + j.getNumeroSocio() + " consigue " + premio.getPremio();

			}

		}
		// notify();
		socioCheckea = false;
		System.out.println(resultadoPremio);

	}

}

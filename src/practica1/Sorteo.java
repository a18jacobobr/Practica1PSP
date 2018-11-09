package practica1;

import java.util.ArrayList;

public class Sorteo extends Thread {
	
	
	private CajaPremios caja;
	private ArrayList<Socio> socios;

	public ArrayList<Socio> getSocios() {
		return socios;
	}

	public void setSocios(ArrayList<Socio> socios) {
		this.socios = socios;
	}

	public Sorteo() {
		super();
	}

	public CajaPremios getCaja() {
		return caja;
	}

	public void setCaja(CajaPremios caja) {
		this.caja = caja;
	}
	

	public static Premio[] creaPremios () {
		Premio premio1 = new Premio("coche", (int) (Math.random()*15));
		Premio premio2 = new Premio("moto", (int) (Math.random()*15));
		Premio premio3 = new Premio("patata", (int) (Math.random()*15));
		Premio premio4 = new Premio("pokemon", (int) (Math.random()*15));
		Premio premio5 = new Premio("suspensorio", (int) (Math.random()*15));
		
		Premio premiosCaja[] = new Premio[5];
		premiosCaja[0]=premio1;
		premiosCaja[1]=premio2;
		premiosCaja[2]=premio3;
		premiosCaja[3]=premio4;
		premiosCaja[4]=premio5;
		
		return premiosCaja;
		
	}
	public static CajaPremios creaCaja (Premio[] premiosAMeter) {
		CajaPremios caja = new CajaPremios(premiosAMeter[0], premiosAMeter[1], premiosAMeter[2], premiosAMeter[3], premiosAMeter[4]);
		
		return caja;
	}
	
	

	public void run() {				
		Premio[] premios = caja.getPremios();
		//Boolean encontrado = false;
		
		System.out.println("            Lista de Premios                ");
		System.out.println("--------------------------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println("Premio numero "+i+" -> Numero de rifa: "+premios[i].getNumeroRifaPremio()+" - Regalo: "+premios[i].getPremio());
		}
		
		
		for (int i = 0; i < 15; i ++) { 
			
			//int rifaSocio = socios.get(i).getNumeroRifaSocio();
			
			//for (int j = 0; j <5; j++) {
				//if (rifaSocio == premios[j].getNumeroRifaPremio()) {
					//System.out.println(caja.get(socios.get(i)));  
					caja.get(socios.get(i)); 
					
					//caja.espera(socios.get(i));
					
					//encontrado = true;
					
			//	}
		//	}
			//if (encontrado == false) {
			//	System.out.println("Socio " +socios.get(i).getNumeroSocio()+" sin premio desde sorteo");  
			//} else {
			//	encontrado = false;
		}
		
		
	}


	
	
}

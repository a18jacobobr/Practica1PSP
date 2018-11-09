package practica1;


public class Premio {
	
	//RIFAS PREMIADAS
	
	private String premio;
	private int numeroRifaPremio;
	
	public Premio(String premio, int numeroRifaPremio) {
		super();
		this.premio = premio;
		this.numeroRifaPremio = numeroRifaPremio;
	}
	public String getPremio() {
		return premio;
	}
	public void setPremio(String premio) {
		this.premio = premio;
	}
	public int getNumeroRifaPremio() {
		return numeroRifaPremio;
	}
	public void setNumeroRifaPremio(int numeroRifaPremio) {
		this.numeroRifaPremio = numeroRifaPremio;
	}
	
	
	

}

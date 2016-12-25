package modelli;

import java.util.List;

public class Nave {
	
	private String idNave;
	private int lunghezza;
	private String verso;
	
	private List <Casella> caselleOccupate;
	
	

	public Nave() {
		super();
	}

	public Nave(String idNave, int lunghezza, String verso) {
		super();
		this.idNave = idNave;
		this.lunghezza = lunghezza;
		this.verso = verso;
	}

	public String getIdNave() {
		return idNave;
	}

	public void setIdNave(String idNave) {
		this.idNave = idNave;
	}

	public int getLunghezza() {
		return lunghezza;
	}

	public void setLunghezza(int lunghezza) {
		this.lunghezza = lunghezza;
	}

	public String getVerso() {
		return verso;
	}

	public void setVerso(String verso) {
		this.verso = verso;
	}

	public List<Casella> getCaselleOccupate() {
		return caselleOccupate;
	}

	public void setCaselleOccupate(List<Casella> caselleOccupate) {
		this.caselleOccupate = caselleOccupate;
	}
	
	

}

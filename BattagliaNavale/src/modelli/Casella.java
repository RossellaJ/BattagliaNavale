package modelli;

public class Casella{
	
	private char colonna;
	private int riga;
	
	
	
	
	public Casella() {
		super();
	}


	public Casella(char colonna, int riga) {
		super();
		this.colonna = colonna;
		this.riga = riga;
	}


	public char getColonna() {
		return colonna;
	}


	public void setColonna(char colonna) {
		this.colonna = colonna;
	}


	public int getRiga() {
		return riga;
	}


	public void setRiga(int riga) {
		this.riga = riga;
	}
	
	
	

}

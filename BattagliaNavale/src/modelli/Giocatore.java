package modelli;

public class Giocatore {
	
	private String nome;
	private Mare mare;
	
	
	public Giocatore() {
		super();
	}


	public Giocatore(String nome, Mare mare) {
		super();
		this.nome = nome;
		this.mare = mare;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Mare getMare() {
		return mare;
	}


	public void setMare(Mare mare) {
		this.mare = mare;
	}
	
	
	
	

}

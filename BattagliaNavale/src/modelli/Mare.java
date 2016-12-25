package modelli;

import java.util.List;

public class Mare {
	

	private int numColonne;
	private int numRighe;
	
	private List <Nave> navi;

	
	
	public Mare() {
		super();
	}

	public Mare(int numColonne, int numRighe) {
	
		this.numColonne = numColonne;
		this.numRighe = numRighe;
	}


	public int getNumColonne() {
		return numColonne;
	}

	public void setNumColonne(int numColonne) {
		this.numColonne = numColonne;
	}

	public int getNumRighe() {
		return numRighe;
	}

	public void setNumRighe(int numRighe) {
		this.numRighe = numRighe;
	}

	public List<Nave> getNavi() {
		return navi;
	}

	public void setNavi(List<Nave> navi) {
		this.navi = navi;
	}
	
	
	
	

}

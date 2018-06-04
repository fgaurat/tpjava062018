package fr.agedi.tpcarre;

public class Carre extends Rectangle{
	
	private float cote;

	public Carre(float cote) {
		super();
		System.out.println("public Carre(float cote)");
		this.cote = cote;
	}
	
	
	public Carre() {
		super();
		System.out.println("public Carre()");
		this.cote = 0;

	}



	public float getCote() {
		return cote;
	}

	public void setCote(float cote) {
		this.cote = cote;
	}
	
	

}

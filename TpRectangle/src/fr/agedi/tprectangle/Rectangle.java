package fr.agedi.tprectangle;

public class Rectangle {
	float longueur;
	private float largeur;
	private static int cpt=0;
	
	
	public Rectangle(float longueur, float largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
		cpt++;
	}
	
	public Rectangle() {
		super();
		this.longueur = 0;
		this.largeur = 0;
		cpt++;
	}	
	public float getLongueur() {
		return longueur;
	}
	public void setLongueur(float longueur) {
		this.longueur = longueur;
	}
	public float getLargeur() {
		return largeur;
	}
	public void setLargeur(float largeur) {
		this.largeur = largeur;
	}
	
	public float getSurface() {
		return this.longueur*this.largeur;
	}
	
	public static int getCpt() {
		return cpt;
	}

	@Override
	public String toString() {
		String s = super.toString();
		return s+"Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]"+this.hashCode();
	}

	
	
}

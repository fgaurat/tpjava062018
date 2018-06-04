package fr.agedi.tprectangle;

public class Rectangle {
	private float longueur;
	private float largeur;
	private static int cpt=0;
	
	private static Rectangle instance;
	
	public static Rectangle getInstance(float longueur, float largeur) {
		if(instance == null) {
			instance = new Rectangle(longueur,largeur);
		}
		instance.largeur = largeur;
		instance.longueur = longueur;
		
		return instance;
	}
	
	private Rectangle(float longueur, float largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
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
		return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]"+this.hashCode();
	}

	
	
}

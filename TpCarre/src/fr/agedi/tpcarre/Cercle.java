package fr.agedi.tpcarre;

public class Cercle implements CalcMath{

	private float rayon;

	public Cercle(float rayon) {
		super();
		this.rayon = rayon;
	}

	public Cercle() {
		super();
		this.rayon = 0;
	}

	public float getRayon() {
		return rayon;
	}

	public void setRayon(float rayon) {
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + "]";
	}

	@Override
	public float getSurface() {
		
		return (float)Math.PI*(float)Math.pow(rayon, 2);
	}
	
	
	
	
	
	
	
	
}

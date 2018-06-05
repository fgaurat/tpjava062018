package fr.agedi.tpcarre;

public class Main {
	public static void main(String argv[]) {

		Rectangle r = new Rectangle (2,3); 
		Carre c = new Carre();
		
		
		Rectangle rc = new Carre();
		CalcMath rci = new Carre();
		rci.getSurface()
		
		System.out.println("--------------------");
		Carre c1 = new Carre(2);
		System.out.println("--------------------");
		Cercle ce = new Cercle(2);
		
		CalcMath cm = new CalcMath();
		
		CalcMath cm = new Cercle();
		System.out.println(cm.getSurface());		
		
		
		System.out.println(ce.getSurface());
		afficherSurface(c);
		afficherSurface(c1);
		afficherSurface(r);
		afficherSurface(ce);
		
		
		
	}
	
	public static void afficherSurface(CalcMath c) {
		System.out.println(c);
		System.out.println("getSurface : "+c.getSurface());
		
	}
}

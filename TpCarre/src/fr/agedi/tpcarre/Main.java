package fr.agedi.tpcarre;

public class Main {
	public static void main(String argv[]) {
		


		

		Rectangle r = new Rectangle(1, 2);
		System.out.println(Rectangle.getCpt());
		Rectangle r1 = new Rectangle(1, 2);
		System.out.println(Rectangle.getCpt());
		
		Rectangle r2 = new Rectangle();
		
		if(r==r1) {
			
			System.out.println("ok");
		}
		
		float longueur = r.getLongueur();
		
		System.out.println(r);
		System.out.println(r1);
		
	}
}

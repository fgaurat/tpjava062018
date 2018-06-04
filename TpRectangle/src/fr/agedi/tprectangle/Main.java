package fr.agedi.tprectangle;

public class Main {
	public static void main(String argv[]) {
		
		int a = 12;
		Rectangle r =Rectangle.getInstance(1,2);
		System.out.println(r);
		Rectangle r1 =Rectangle.getInstance(3,4);
		System.out.println(r1);
		
		
		/*
		Rectangle r = new Rectangle(1, 2);
		System.out.println(Rectangle.getCpt());
		Rectangle r1 = new Rectangle(1, 2);
		System.out.println(Rectangle.getCpt());
		*/
		if(r==r1) {
			
			System.out.println("ok");
		}
		
		float longueur = r.getLongueur();
		
		System.out.println(r);
		System.out.println(r1);
		
	}
}

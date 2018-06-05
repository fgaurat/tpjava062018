package fr.agedi.tpdivbyzero;

import fr.agedi.tpdivbyzero.exception.DivByZeroException;

public class Main {

	public static void main(String[] args) {
		int a, b, c;
		b = 2;
		c = 0;
		
		try {
			a = Calc.div(b, c);
			System.out.println(a);
		} catch (DivByZeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		

	}

}

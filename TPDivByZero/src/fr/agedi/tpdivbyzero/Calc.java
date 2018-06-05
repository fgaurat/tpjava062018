package fr.agedi.tpdivbyzero;

import fr.agedi.tpdivbyzero.exception.DivByZeroException;

public class Calc {
	
	
	
	public static int div(int a, int b) throws DivByZeroException{
		if ( b==0) {
			DivByZeroException e = new DivByZeroException("Division par Zéroooooo !");
			
			throw e;
		}
		
		return a/b;
	}
	
	
	
}

package fr.agedi.tpdivbyzero.exception;

public class DivByZeroException extends Exception{
	
	
	public DivByZeroException() {
		super("Division par zéro");
	}
	
	public DivByZeroException(String msg) {
		super(msg);
	}	
}

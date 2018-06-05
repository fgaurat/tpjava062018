package fr.agedi.tpsocketweb;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {

	public static void main(String[] args) {
		final String file_url ="accueil-syndicat-intercommunal-agedi_fr.html"; 
		
		
		try {
			Socket s = new Socket("public.agedi.fr",80);
			System.out.println("ok");
			//OutputStream os = s.getOutputStream();
			PrintStream out = new PrintStream(s.getOutputStream()); 
			
			
			s.close();
			
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

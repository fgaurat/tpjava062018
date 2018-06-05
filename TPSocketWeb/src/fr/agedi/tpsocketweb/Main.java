package fr.agedi.tpsocketweb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
			out.println("GET "+file_url);
			//BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			InputStreamReader is = new InputStreamReader(s.getInputStream());
			BufferedReader in = new BufferedReader(is);
			
			String html = in.readLine();
			
			while(html !=null) {
				System.out.println(html);
				html = in.readLine();
			}
			
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

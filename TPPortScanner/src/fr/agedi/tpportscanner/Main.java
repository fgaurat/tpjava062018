package fr.agedi.tpportscanner;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {
	
	
	public static void main(String argv[]) {
		
		for(int i=1;i<1024;i++) {
						
			try {
				Socket s = new Socket("localhost", i);
				System.out.println("port "+i+" ok");
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				//System.out.println(i+" "+e);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//System.out.println(i+" "+e);
			}
						
		}
		
	}
}

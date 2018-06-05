package fr.agedi.tpfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File f = new File("leFichier.txt");
		
		
		try {
			
			FileWriter fw = new FileWriter(f,true);
			BufferedWriter bw = new BufferedWriter(fw);
						
			bw.write("toto");
			bw.newLine();
			bw.write("toto");
			bw.newLine();
			
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {

			BufferedReader bw = new BufferedReader(new FileReader(f));
			
			String s = bw.readLine();
			
			while(s!=null) {
				System.out.println(s);
				s = bw.readLine();
			}
			bw.close();
			
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}

package fr.agedi.tpstring;

public class Main {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer ("Bonjour");
		
		
		System.out.println(sb.hashCode());
		System.out.println(sb);
		sb.append(" le monde");
		System.out.println(sb.hashCode());
		System.out.println(sb);
		
	}

}

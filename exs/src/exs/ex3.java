package exs;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String [] tempo = new String[4];
		
		for (int i = 0; i < tempo.length; i++) {
			System.out.println("digite na ordem de hh:mm:ssAM ou PM");
			tempo[i] = in.next();
		}
		
	}

}

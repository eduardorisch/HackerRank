package exs;

import java.util.Iterator;
import java.util.Scanner;

public class ex2 {

	public static void processo(int y[]) {
		int maior=0, menor=0;
		for (int i = 0; i < y.length-1; i++) {
			maior = y[i]+maior;
		}
		for (int i = 1; i < y.length; i++) {
			menor = y[i]+menor;
		}
		if(maior > menor) {
			System.out.println("maior "+ maior + "menor" + menor);
		}
		else {
			System.out.println("maior" + menor + "menor" + maior);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[]x = new int[5];
		
		for (int i = 0; i < x.length; i++) {
			System.out.println("digite um val: ");
			x[i] = in.nextInt();
		}
		
		processo(x);
		
	}

}

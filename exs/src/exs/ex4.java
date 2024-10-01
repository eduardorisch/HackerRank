package exs;

import java.util.Scanner;

public class ex4 {

	public static void resu(int res[]) {
		int par=0;
		for (int i = 0; i < res.length-1; i++) {
			for (int j = res[i]+1; j < res.length; j++) {
				if(res[i] % res[j] == 2) {
					par++;
					}
			}
		}
		System.out.println(par);
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		
		System.out.print("digite a qnt de meias: ");
		n=in.nextInt();
		
		int [] meias = new int [n];
		
		for (int i = 0; i < meias.length; i++) {
			System.out.println("digite a cor das meias, 1- ver, 2- ver, 3-azu: ");
			meias[i] = in.nextInt();
		}
		resu(meias);
	}

}

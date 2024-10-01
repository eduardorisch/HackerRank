package exs;

import java.util.Scanner;

public class ex1 {

	public static void processo(int y[]) {
		double pos = 0, neg = 0, zr = 0;
		for (int i = 0; i < y.length; i++) {
			if(y[i] > 0) {
				pos++;
			}
			else if (y[i] < 0) {
				neg++;
			}
			else {
				zr++;
			}
		}
		pos = pos/y.length;
		System.out.println("pos" + pos);
		neg = neg/y.length;
		System.out.println("neg" + neg);
		zr = zr/y.length;
		System.out.println("zr" + zr);
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int qnt;
		
		System.out.println("Digite qnts nums: ");
		qnt = in.nextInt();
		
		int[] x = new int[qnt];
		
		for (int i = 0; i < x.length; i++) {
			System.out.println("digite algm num pos, neg ou zr: ");
			x[i]=in.nextInt();
		}
		processo(x);
	}

}

package exs;

import java.util.Random;

public class exMatriz5 {

	public static void main(String[] args) {
		Random r = new Random();
		int[][] matriz = new int[4][4];
		int impares=0, pares=0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = r.nextInt(0, 11);
				if(matriz[i][j] % 2 == 0) {
					pares++;
				}
				else if(matriz[i][j] % 2 == 1) {
					impares++;
				}
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		System.out.println(pares);
		System.out.println(impares);

	}

}

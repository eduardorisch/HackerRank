package exs;

import java.util.Random;

public class exMatriz8 {

	public static void main(String[] args) {
		Random r = new Random();
		int [][] matriz = new int [3][3];
		int aux;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = r.nextInt(0, 11);
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println(" ");
		}
		System.out.println(" ");

	}

}

package exs;

import java.util.Random;

public class exMatriz4 {

	public static void main(String[] args) {
		Random r = new Random();
		int[][] m1 = new int[2][2];
		int[][] m2 = new int[2][2];
		int[][] subtracao = new int[2][2];

		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1.length; j++) {
				m1[i][j] = r.nextInt(0, 11);
				m2[i][j] = r.nextInt(0, 11);
				subtracao[i][j] = m1[i][j] - m2[i][j];

				System.out.print(subtracao[i][j] + "\t");
			}
			System.out.println(" ");
		}

	}

}

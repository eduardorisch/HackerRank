package exs;

import java.util.Random;

public class exMatriz6 {

	public static void main(String[] args) {
		Random r = new Random();
		int [][]matriz = new int [3][4];
		int totalMes, totalAno=0;
		
		for (int i = 0; i < matriz.length; i++) {
			totalMes=0;
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=r.nextInt(0, 11);
				totalMes = matriz[i][j] + totalMes;
				totalAno = matriz[i][j] + totalAno;
				System.out.print(matriz[i][j] + "\t");
				}
			System.out.println(" ");
			System.out.println(totalMes);
		}
		System.out.println(" ");
		System.out.println(totalAno);
	}

}

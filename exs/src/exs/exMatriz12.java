package exs;

import java.util.Scanner;

public class exMatriz12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][]matriz = new int [2][6];
		int total = 0, totalMes = 0, totalDespesa = 0, maior = 0, nDespesa=0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("digite quanto gasto");
				matriz[i][j] = in.nextInt();
				total = total + matriz[i][j];
			}
		}
		System.out.println("o total do ano é " + total);
		System.out.println(" ");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				totalMes = totalMes + matriz[i][j];
			}
			
			System.out.println("o total do mes " + (i+1) + " é " + totalMes);
			totalMes=0;
			
		}
		
		System.out.println(" ");
		
		for (int i = 0; i < 6;i++) {
			totalDespesa = 0;
			for (int j = 0; j < 2; j++) {
				totalDespesa = totalDespesa + matriz[j][i];
			}
			
			System.out.println("total da despesa " + (i+1) + " é " + totalDespesa);
			
			if(totalDespesa > maior) {
				maior = totalDespesa;
				nDespesa = i+1;
			}
		}
		
		System.out.println("a maior despesa é " + maior + " da despesa " + nDespesa);
	}

}

package exs;

import java.util.Random;
import java.util.Scanner;

public class exMatriz10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		int m, n, soma = 0, negativos=0;

		// questão a
		System.out.println("digite o n de linhas");
		m = in.nextInt();
		if (m < 1 || m > 30) {
			System.out.println("tu fez merda");
		} else {
			System.out.println("digite o n de colunas");
		}
		n = in.nextInt();
		if (n < 1 || n > 30) {
			System.out.println("tu fez merda");
		}
		int[][] matriz = new int[m][n];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = r.nextInt(-10, 11);
			}
		}
		
		//questão b
		if (m == n) {
			System.out.println("a matriz é quadarada");
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					if (i == j) {
						soma = soma + matriz[i][j];
					}
					if((i+1)+(j+1) == n+1) {
						if(matriz[i][j] < 0) {
							negativos++;
						}
					}
					System.out.print(matriz[i][j] +"\t");
				}
				System.out.println(" ");
			}
			System.out.println(" ");
			System.out.println(soma);
			System.out.println(negativos);
		}
		else {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					System.out.print(matriz[i][j]+"\t");
				}
				System.out.println(" ");
			}
		}
	}
}

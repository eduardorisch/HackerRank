package exs;

import java.util.Scanner;

public class exMatriz {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][]matriz = new int [3][3];
		boolean triangular = true;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("qual o n da posição L " + i + " e da C " + j + ":");
				matriz[i][j] = in.nextInt();
				if(i < j) {
					if(matriz[i][j] != 0) {
						triangular = true;
					}
					else {
						triangular = false;
					}
				}
				else if(i > j) {
					if(matriz[i][j] == 0) {
						triangular = true;
					}
					else {
						triangular = false;
					}
				}
			}
		}
		System.out.println("a matriz: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println(" ");
		}
		
		if(triangular) {
			System.out.println(" é triangular!");
		}
		else {
			System.out.println(" n é triangular!");
		}
		
	}

}

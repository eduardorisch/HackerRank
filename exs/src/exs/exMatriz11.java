package exs;

import java.util.Random;

public class exMatriz11 {

	public static void main(String[] args) {
		Random r = new Random();
		int[][] matriz = new int[3][3];
		int soma=0, nElementos=0;
		double media;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = r.nextInt(0,11);
				soma = soma+matriz[i][j];
				nElementos++;
			}
		}
		media = soma/nElementos;
		soma=0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = matriz[i][j] - (int)media;
				matriz[i][j] = (int)Math.pow(matriz[i][j], 2);
				soma = soma + matriz[i][j];
			}
		}
		media=0;
		media = soma/nElementos;
		media = Math.sqrt(media);
		System.out.println("desvio padrão é " + media);
	}

}

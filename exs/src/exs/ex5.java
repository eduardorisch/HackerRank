package exs;

import java.util.Scanner;

public class ex5 {

	public static int contvales(String cam[]) {
		int[]niv = new int [cam.length];
		int vales = 1;
		
		for (int i = 0; i < niv.length; i++) {
			if(cam[i].equalsIgnoreCase("D")) {
				niv[i] = niv[i-1] -1;
			}
			else {
				niv[i] = niv[i-1] + 1;
			}
		}
		
		//for (int i = 0; i < niv.length; i++) {
		//	if(niv[i] > 0)
		//}

		return vales; 
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int steps;
		
		System.out.println("qnts passos: ");
		steps=in.nextInt();
		
		String [] path = new String [steps];
		for (int i = 0; i < path.length; i++) {
			System.out.println("Foi uphill ou downhill");
			path[i]=in.next();
		}
		System.out.println("ele passou por" + contvales(path) + "vales");
		
	}

}

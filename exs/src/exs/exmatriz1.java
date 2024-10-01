package exs;

public class exmatriz1 {

	public static void main(String[] args) {
		int m [][] = new int [4][4];
		
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = (j + 1) * (i+1)  ;
				System.out.print(m[i][j] + "\t");
			}
			System.out.println(" ");
		}
	}

}

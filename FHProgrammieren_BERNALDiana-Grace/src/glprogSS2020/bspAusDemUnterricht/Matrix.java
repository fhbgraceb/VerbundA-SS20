package bspAusDemUnterricht;

import java.util.Arrays;

public class Matrix {

	public static void main(String[] args) {


		int [][] mat = {
				
				{5, 1, 1},
				{2, 2, 2},
				{3, 3, 3}		
				
				
		};
		
		// Ausgabe 
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
		
		// Einzelwert überschreiben
		//mat[1][1] = 5;
		
		// Zwischenspeicher für die jeweilige Spaltensumme
		int[] gewinner = new int[3];
		
		for (int i = 0; i < mat.length; i++) {
			
			int erg = 0; 
			
			for (int j = 0; j < mat[i].length; j++) {
			erg = erg + mat[i][j];
			}
			gewinner[i] = erg;
			
			System.out.println("Zeile "  + i + " hat den Wert " + erg);	
		}
		

		// Unsortiert
			for (int i = 0; i < gewinner.length; i++) {
				System.out.println(gewinner[i]);
			}

			Arrays.sort(gewinner);
			
			
			System.out.println("Aufsteigend");
			
			for (int i = 0; i < gewinner.length; i++) {
				System.out.println(gewinner[i]);
			}
			
			System.out.println("Absteigend");
			
			for (int i = gewinner.length-1; i >= 0; i--) {
				System.out.println(gewinner[i]);
			}
			
	}

}

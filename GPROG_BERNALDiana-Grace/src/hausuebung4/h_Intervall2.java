package hausuebung4;

import java.util.Scanner;

public class h_Intervall2 {
	/*
	 8. Intervall2: Lesen Sie zwei ganze Zahlen ein.
	• Falls die zweite Zahl kleiner ist als die erste, geben Sie nichts aus.
	• Andernfalls geben Sie alle ganzen Zahlen von der ersten bis zur zweiten aus.

	Beispiel:
	Eingabe: 13 und 11
	Ausgabe: nichts
	Eingabe: 7 und 11
	Ausgabe; 7, 8, 9, 10, 11

	 */
	
	public static void main(String[] args) {
		System.out.print("h_Intervall2_____________________\n");
		
			Scanner s = new Scanner (System.in);
			
			int[] zahlen=new int[2];
			
			for (int i = 0; i < zahlen.length; i++) {
				System.out.print("Geben Sie die " + (i+1) + ".Zahl ein: ");
				zahlen[i] = s.nextInt();
//				zahlen[i]=input;
			}
			
			if (zahlen[0]<zahlen[1]) {
				for (int k = zahlen[0]; k <= zahlen[1]; k++) {
					System.out.printf(k+", ");
				}
			}
			
			s.close();
	}
}

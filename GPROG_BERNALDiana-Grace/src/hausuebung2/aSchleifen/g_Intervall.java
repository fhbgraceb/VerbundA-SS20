package hausuebung2.aSchleifen;

import java.util.Scanner;

public class g_Intervall {
	/*
	 Aufgabe:
	 7. Intervall2: Lesen Sie zwei ganze Zahlen ein.
	� Falls die zweite Zahl kleiner ist als die erste, geben Sie nichts aus.
	� Andernfalls geben Sie alle ganzen Zahlen von der ersten bis zur zweiten aus.
	Beispiel:
	Eingabe: 13 und 11
	Ausgabe: nichts
	
	Eingabe: 7 und 11
	Ausgabe; 7, 8, 9, 10, 11
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Bitte geben Sie die 1.Zahl ein: ");
		int zahl1 = s.nextInt();
		System.out.println("Bitte geben Sie die 2.Zahl ein: ");
		int zahl2 = s.nextInt();
		
		if (zahl1 < zahl2) {
			for (; zahl1 < (zahl2+1); zahl1++) {
				System.out.println(zahl1);
			}
		} 
		s.close();
	}

}

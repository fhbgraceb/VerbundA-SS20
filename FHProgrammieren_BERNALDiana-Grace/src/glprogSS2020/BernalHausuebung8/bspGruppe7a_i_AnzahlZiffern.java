package BernalHausuebung8;

import java.util.Scanner;

public class bspGruppe7a_i_AnzahlZiffern {
	
//	AnzahlZiffern: Lesen Sie eine ganze Zahl (Long) ein und geben Sie aus, 
//	wie oft die verschiedenen Ziffern in dieser Zahl vorkommen. Geben Sie dabei nur jene Ziffern aus, 
//	die in der Zahl vorkommen. 
//	Beispiel:
//		Eingabe: 12441 
//		Ausgabe: 
//			1: 2x 
//			2: 1x 
//			4: 2x

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long eingabe;
		int anzahl;

		System.out.print("Bitte Zahlen eingeben: ");
		eingabe = s.nextLong();

		for (int k=0; k <= 9; k++) {
			anzahl = 0;
			for (int i = 0; i < String.valueOf(eingabe).length(); i++) {
				char stringEingabe=String.valueOf(eingabe).charAt(i);
				if (k ==  Character.getNumericValue(stringEingabe)) {
					anzahl++; 
				}
			}
			if (anzahl > 0) {
				System.out.println(k + " : " + anzahl + "x");
			}
		}
		s.close();
	}

}

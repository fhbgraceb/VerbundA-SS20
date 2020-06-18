package BernalHausuebung8;

import java.util.Scanner;

public class bspGruppe7a_d_keineVokale {
	
//	keineVokale: Lesen Sie einen String aus Buchstaben 
//	(Sie können bei Ihrem Programm davon ausgehen, dass die Eingabe nur Buchstaben enthält) 
//	ein und geben Sie eine Kopie des Strings aus, bei der alle Vokale entfernt wurden. Beispiel:
//		Eingabe: „AbCdeFG“
//		Ausgabe: „bCdFG“

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String eingabe;
		String eingabetoUpperC;
		String ausgabe;
		String zeichenInString;

		System.out.print("Bitte String eingeben: ");
		eingabe = s.next();
		eingabetoUpperC = eingabe.toUpperCase();
		ausgabe = "";

		for (int i = 0; i < eingabe.length(); i++) {
			zeichenInString = eingabetoUpperC.substring(i, i + 1);
			if (!"AEIOU".contains(zeichenInString)) {
				ausgabe += eingabe.charAt(i);
			}
		}
		System.out.println("Ausgabe keine Vokale: " + ausgabe);
		s.close();
	}

}

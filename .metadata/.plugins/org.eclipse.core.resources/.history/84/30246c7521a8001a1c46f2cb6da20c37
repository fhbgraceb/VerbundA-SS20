package BernalHausuebung8;

import java.util.Scanner;

public class bspGruppe7b_encode {
	public static String encode(String text) {
		String code;
		char akt;
		char c;
		int anzahl;

		code = "";

		if (text.length() > 0) {
			akt = text.charAt(0);
			anzahl = 1;
			for (int i = 1; i < text.length(); i++) {
				c = text.charAt(i);
				if (akt == c) {
					if (anzahl == 9) {
						code = code + akt + anzahl;
						anzahl = 1;
					} else {
						anzahl++;
					}
				} else {
					code = code + akt + anzahl;
					akt = c;
					anzahl = 1;
				}
			}
			code = code + akt + anzahl;
			return code;
		} else {
			return "Error";
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String eingabe;
		String ausgabe;

		System.out.print("Einen String eingeben: ");
		eingabe = s.next();

		ausgabe = encode(eingabe);
		System.out.println(ausgabe);

		/*
		 * nach jedem wort ins array String eingabe = s.nextLine(); String[] woerter =
		 * eingabe.split("\\s+"); for (int i = 0; i < woerter.length; i++) { woerter[i]
		 * = woerter[i].replaceAll("[^\\w]", ""); } for (int k = 0; k < woerter.length;
		 * k++) { System.out.println(k + ".arrayfeld " + woerter[k]); }
		 */
		s.close();
	}

}

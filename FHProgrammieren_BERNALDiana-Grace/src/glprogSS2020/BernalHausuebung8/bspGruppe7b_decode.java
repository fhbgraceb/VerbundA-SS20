package BernalHausuebung8;

import java.util.Scanner;

public class bspGruppe7b_decode {

	public static String encode(String text) {
		String eingabe;
		int anzahl;
		char tmp; 
		char c;
		
		eingabe = "";

		if (text.length() > 0) {
			tmp = text.charAt(0);
			anzahl = 1;
			for (int i = 1; i < text.length(); i++) {
				c = text.charAt(i);
				if (tmp == c) {
					anzahl++;
				} else {
					eingabe = eingabe + tmp + anzahl;
					tmp = c;
					anzahl = 1;
				}
			}
			eingabe = eingabe + tmp + anzahl;
			return eingabe;
		} else {
			return "Error";
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String eingabe;
		String ausgabe;

		System.out.print("Bitte einen String eingeben: ");
		eingabe = s.next();
		ausgabe = encode(eingabe);

		System.out.println(ausgabe);
		
		s.close();
	}

}

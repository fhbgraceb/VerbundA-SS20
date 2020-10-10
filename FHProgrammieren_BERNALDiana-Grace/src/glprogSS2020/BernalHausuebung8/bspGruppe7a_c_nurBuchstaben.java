package BernalHausuebung8;

import java.util.Scanner;

public class bspGruppe7a_c_nurBuchstaben {
	
//	nurBuchstaben: Lesen Sie einen String ein und stellen Sie fest ob nur Buchstaben darin vorkommen 
//	(Umlaute können Sie dabei wie Nicht-Buchstaben behandeln). 
//	Beispiel:
//		Eingabe: „AsGHfe“
//		Ausgabe: nur Buchstaben
//		Eingabe: „asD2h,“
//		Ausgabe: da ist etwas anderes auch drinnen

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		boolean nurBuchstaben;
		String eingabe;
		char zeichen;

		System.out.print("Bitte einen String eingeben: ");
		eingabe = s.next();
		nurBuchstaben = true;

		for (int i = 0; i < eingabe.length(); i++) {
			zeichen = eingabe.charAt(i);
			if (!Character.isLetter(zeichen)) {
				nurBuchstaben = false;
			}
		}
		if (nurBuchstaben) {
			System.out.println("Nur Buchstaben.");
		} else {
			System.out.println("da ist etwas anderes auch drin");
		}
		s.close();
	}

}

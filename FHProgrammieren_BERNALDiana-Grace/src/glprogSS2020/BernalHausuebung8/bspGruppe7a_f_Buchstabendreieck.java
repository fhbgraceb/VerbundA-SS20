package BernalHausuebung8;

import java.util.Scanner;

public class bspGruppe7a_f_Buchstabendreieck {

//	Buchstabendreieck: Lesen Sie einen Grossbuchstaben ein und geben Sie ein "Buchstabendreieck" bis zu diesem Buchstaben aus.
//	Beispiele:
//	Eingabe: "C"
//	Ausgabe:
//	A
//	ABA
//	ABCBA
//	Eingabe: "E"
//	Ausgabe:
//	A
//	ABA
//	ABCBA
//	ABCDCBA
//	ABCDEDCBA
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		char buchstabe;
		do {
			System.out.print("Buchstabe eingeben: ");
			buchstabe = s.next().charAt(0);
		} while (!((buchstabe >= 'A') && (buchstabe <= 'Z')));

		for (char mittlererBuchstabe = 'A'; mittlererBuchstabe <= buchstabe; mittlererBuchstabe++) {
			for (char ausgabeBuchstabe = 'A'; ausgabeBuchstabe < mittlererBuchstabe; ausgabeBuchstabe++) {
				System.out.print(ausgabeBuchstabe);
			}

			for (char ausgabeBuchstabe = mittlererBuchstabe; ausgabeBuchstabe >= 'A'; ausgabeBuchstabe--) {
				System.out.print(ausgabeBuchstabe);
			}
			System.out.println();
		}
		s.close();
	}

}

package BernalHausuebung8;

import java.util.Scanner;

public class bspGruppe7a_b_Palindrom {
//	2. Palindrom: Lesen Sie einen beliebigen String ein und stellen Sie fest ob es sich um ein Palindrom handelt 
//	(liest von hinten genauso wie von vorne, Beispiele: „Otto“, „Abba“, Groß- und Kleinschreibung wird ignoriert).

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String eingabe;
		String umgedreht;

		System.out.print("String eingeben: ");
		eingabe = s.next();

		umgedreht = "";
		for (int i = eingabe.length() - 1; i >= 0; i--) {
			umgedreht += eingabe.substring(i, i + 1);
		}

		if (eingabe.equalsIgnoreCase(umgedreht)) {
			System.out.println("Ist ein Palindrom!");
		} else {
			System.out.println("KEIN Palindrom.");
		}
		s.close();
	}

}

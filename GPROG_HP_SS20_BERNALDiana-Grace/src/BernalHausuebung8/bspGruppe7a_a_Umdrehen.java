package BernalHausuebung8;

import java.util.Scanner;

public class bspGruppe7a_a_Umdrehen {

	/*
	 * Umdrehen: Lesen Sie einen beliebigen String ein und geben Sie den String in
	 * umgekehrter Reihenfolge aus. Bespiel: Eingabe: �asd3;+H" Ausgabe: �H+;3dsa�
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String eingabe;
		String ausgabe;

		System.out.print("String eingeben: ");
		eingabe = s.next();

		ausgabe = "";
		for (int i = eingabe.length() - 1; i >= 0; i--) {
			ausgabe += eingabe.substring(i, i + 1);
		}
		System.out.println("Ausgabe: " + ausgabe);

		s.close();
	}

}

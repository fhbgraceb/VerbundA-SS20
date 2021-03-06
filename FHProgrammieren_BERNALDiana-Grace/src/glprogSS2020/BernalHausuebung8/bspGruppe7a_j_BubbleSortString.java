package BernalHausuebung8;

import java.util.Scanner;

public class bspGruppe7a_j_BubbleSortString {
	
//	BubbleSortString: Schreiben Sie ein Programm, das einen String aus Großbuchstaben einliest und 
//	dessen Buchstaben alphabetisch sortiert ausgibt. Verwenden Sie dazu das sogenannte „Bubble Sort“-Verfahren. 
//	Sie dürfen zur Lösung den String nicht in ein Array umwandeln! 
//	Beispiel:
//		Eingabe: „FASCHINGSANFANG“
//		Ausgabe: „AAACFFGGHINNNSS“

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String wort;
		boolean finished;
		int sortierteBuchstaben = 0;
		
		System.out.println("Wort eingeben: ");
		wort = s.next().toUpperCase();
		do {
			finished = false;
			for (int i = 0; i < wort.length() - 1 - sortierteBuchstaben; i++) {
				if (wort.charAt(i) > wort.charAt(i + 1)) {
					wort = wort.substring(0, i) + wort.charAt(i + 1) + wort.charAt(i) + wort.substring(i + 2); 
					finished = true;
				}
			}
			sortierteBuchstaben++;
		} while (finished);
		System.out.println(wort);
		s.close();
	}

}

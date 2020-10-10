package BernalHausuebung8;

import java.util.Scanner;

public class bspGruppe7a_e_Tannenbaum {

//	Tannenbaum: Schreiben Sie ein Programm, dass eine Zahl einliest und einen „Tannenbaum“ in dieser Höhe zeichnet. 
//	Beispiel: 
//		Eingabe: 5 
//		Ausgabe: * 
//				*** 
//			   ***** 
//		      *******
//		     *********

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String sternis = "*";
		int zeilenAnzahl;

		System.out.print("H�he des Tannenbaums eingeben: ");
		zeilenAnzahl = s.nextInt();

		for (int zeile = zeilenAnzahl - 1; zeile >= 0; zeile--) {
			for (int i = 1; i <= zeile; i++) {
				System.out.print(" ");
			}
			System.out.println(sternis);
			sternis += "**";
		}
		s.close();
	}

}

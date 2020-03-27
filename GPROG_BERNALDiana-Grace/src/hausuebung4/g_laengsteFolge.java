package hausuebung4;

import java.util.Scanner;

public class g_laengsteFolge {
	/*
	 7. LaengsteFolge: Lesen Sie beliebig viele Zahlen ein (Abschluss mit 0, Sie
	brauchen diese nicht zu speichern). Geben Sie die Länge der längsten Folge
	von aufsteigend sortierten Zahlen an.
	Beispiel:
	3, 4, 8, 2, 4, 3, 6, 5, 0 – aufsteigende Teilfolgen:
	3, 4, 8 – 2 ist wieder kleiner
	2, 4 – 3 ist wieder kleiner
	3, 6 – 5 ist wieder kleiner
	Längste Teilfolge hat 3 Elemente 
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int vorigeZahl;
		int neueZahl;
		int aufsteigend;
		int aufsteigendMax;
			
		aufsteigendMax = 0;
		System.out.print("Bitte geben Sie eine Zahl ein (Abschluss mit 0): ");
		neueZahl = s.nextInt();
		aufsteigend = 1;
		while (neueZahl != 0){
			vorigeZahl = neueZahl;
			System.out.print("Bitte geben Sie eine Zahl ein (Abschluss mit 0): ");
			neueZahl = s.nextInt();
			if (neueZahl != 0){
				if (vorigeZahl < neueZahl){
						aufsteigend++;
					}
				else{
					if (aufsteigend > aufsteigendMax){
							aufsteigendMax = aufsteigend;
						}
						aufsteigend = 1;
				}
			}
		}

		System.out.println();
		System.out.printf("Die längste aufsteigende Folge hat %d Elemente\n", aufsteigendMax);

		s.close();
	}

}

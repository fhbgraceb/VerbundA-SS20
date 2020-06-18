package BernalHausuebung4;

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
		System.out.print("g_laengsteFolge_____________________\n");
		
		Scanner s = new Scanner(System.in);
		int oldz;
		int newz;
		int ascending;
		int ascendingmax;
			
		ascendingmax = 0;
		System.out.print("Geben Sie eine Zahl ein [Abschluss mit 0]: ");
		newz = s.nextInt();
		ascending = 1;
		while (newz != 0){
			oldz = newz;
			System.out.print("Bitte geben Sie eine Zahl ein [Abschluss mit 0]: ");
			newz = s.nextInt();
			if (newz != 0){
				if (oldz < newz){
						ascending++;
					}
				else{
					if (ascending > ascendingmax){
							ascendingmax = ascending;
						}
						ascending = 1;
				}
			}
		}

		System.out.println();
		System.out.printf("Die längste aufsteigende Folge hat %d Elemente", ascendingmax);

		s.close();
	}

}

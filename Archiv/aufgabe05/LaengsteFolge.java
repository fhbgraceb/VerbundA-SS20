package aufgabe05;

import java.util.Scanner;

/*
 * Beispielgruppe 4 - Schleifen
 *
 * LaengsteFolge: 
 * Lesen Sie beliebig viele Zahlen ein 
 * (Abschluss mit 0, Sie brauchen diese nicht zu speichern). 
 * 
 * Geben Sie die L�nge der l�ngsten Folge von aufsteigend sortierten Zahlen an.
 * Beispiele:
 * 	3, 4, 8, 2, 4, 3, 6, 5, 0 � aufsteigende Teilfolgen: 
 * 		3, 4, 8 � 2 ist wieder kleiner
 * 		2, 4 � 3 ist wieder kleiner
 * 		3, 6 � 5 ist wieder kleiner
 *
 *	L�ngste Teilfolge hat 3 Elemente
 */
/*
 * Nachdem die Anzahl der Zahlen nicht bekannt ist
 * l�sst sich dieses Beispiel (ohne Arrays) nicht mit Unterprogrammen l�sen.
 */

public class LaengsteFolge 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int vorigeZahl;
		int neueZahl;
		int aufsteigend;
		int aufsteigendMax;
		
		aufsteigendMax = 0;
		System.out.print("Bitte geben Sie eine Zahl ein (Abschluss mit 0): ");
		neueZahl = s.nextInt();
		aufsteigend = 1;
		while (neueZahl != 0)
		{
			vorigeZahl = neueZahl;
			System.out.print("Bitte geben Sie eine Zahl ein (Abschluss mit 0): ");
			neueZahl = s.nextInt();
			if (neueZahl != 0)
			{
				if (vorigeZahl < neueZahl)
				{
					aufsteigend++;
				}
				else			// Nicht mehr aufsteigend
				{
					// Schauen, ob die aufsteigende Folge l�nger war
					if (aufsteigend > aufsteigendMax)
					{
						aufsteigendMax = aufsteigend;
					}
					// und neu zu z�hlen beginnen.
					aufsteigend = 1;
				}
			}
		}

		System.out.println();
		System.out.printf("Die l�ngste aufsteigende Folge hat %d Elemente\n", aufsteigendMax);
	}

}

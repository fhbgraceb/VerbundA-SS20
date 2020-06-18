package aufgabe08_Prog2018;

import java.util.Scanner;


/*
 * Tannenbaum: 
 * 
 * Schreiben Sie ein Programm, dass eine Zahl einliest 
 * und einen „Tannenbaum“ in dieser Höhe zeichnet.
 *
 * Beispiel:
 * 
 * Eingabe: 5
 * Ausgabe:
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 * 
 * Zur Lösung:
 * 
 * Sieht man sich den Baum an so besteht er aus mehreren Zeilen-
 * In jeder Zeile wir er um 2 Sternchen breiter:
 *  -> Variable zum Speichern der Sternchen
 *  -> Schleife für die Höhe des Baumes 
 *     in edem Durchgang zur Variable "**" dazugeben-
 *     
 * Die Leerzeichen links werden immer weniger, in der letzten Zeile sind es 0,
 * in der ersten dementsprechend Höhe-1.
 * -> Schleifenariable umdrehen 
 *       (statt von 1 bis zur Höhe zählen
 *        bei Höhe - 1 beginnen und bis 0 hinunterzählen)
 */
public class Tannenbaum 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		String ausgabe = "*";
		int zeilen;
		
		System.out.print("Bitte die Höhe des Tannenbaums eingeben: ");
		zeilen = s.nextInt();
		
		for (int zeile = zeilen - 1; zeile >= 0; zeile--)
		{
			for (int i = 1; i <= zeile; i++)	// Ausgabe der Leerzeichen
			{
				System.out.print(" ");
			}
			System.out.println(ausgabe);
			
			ausgabe += "**";	// Baum breiter machen
		}	
	}
}

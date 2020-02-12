package aufgabe08;

import java.util.Scanner;

/*
 * AnzahlBuchstaben: 
 * 
 * Lesen Sie einen String aus Grossbuchstaben Buchstaben 
 * (Sie können bei Ihrem Programm davon ausgehen, 
 * dass die Eingabe nur Großbuchstaben enthält) ein 
 * und geben Sie aus wie oft jeder Buchstabe darin vorkommt.
 * 
 * Beispiel:
 * 	Eingabe: „ABCADBADD“
 * 	Ausgabe:
 *  	A : 3
 *  	B : 2
 *  	C : 1
 *  	D : 3
 *  
 *  Lösung:
 *  
 *  Analog zum Beispiel AnzahlZiffern
 */
public class AnzahlBuchstaben 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String text;
		int anzahl;
		
		System.out.print("Bitte einen String eingeben: ");
		text = s.next();
		
		// Alle Zeichen durchlaufen
		for (char buchstabe = 'A'; buchstabe <= 'Z'; buchstabe++)
		{
			// Abzählen wie oft der Buchstabe vorkommt
			anzahl = 0;
			for (int i = 0; i < text.length(); i++)
			{
				if (buchstabe == text.charAt(i))
				{
					anzahl++;
				}
			}
			System.out.println(buchstabe + " : " + anzahl + "x");
		}		
	}
}

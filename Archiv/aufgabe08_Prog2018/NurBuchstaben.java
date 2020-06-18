package aufgabe08;

import java.util.Scanner;

/*
 * nurBuchstaben: 
 * 
 * Lesen Sie einen String ein und stellen Sie fest
 * ob nur Buchstaben darin vorkommen 
 * (Umlaute können Sie dabei wie Nicht-Buchstaben behandeln).
 * 
 * Beispiele:
 * 
 * 		Eingabe: „AsGHfe“
 * 		Ausgabe: nur Buchstaben
 * 
 * 		Eingabe: „asD2h,“
 * 		Ausgabe: da ist etwas anderes auch drinnen
 * 
 * Lösung:
 * 
 * Hier werden verschiedene Varianten gezeigt.
 * 
 * Die Grundstruktur ist jeweils dieselbe:
 * 
 * Der Text wird Zeichen für Zeichen durchgegangen 
 * und jedes Zeichen einzeln untersucht. 
 * Solange es sich um Buchstaben handelt ist alles OK.
 * Wenn es jedoch kein Buchstabe ist wird 
 *       eine boolean-Variable auf false gesetzt.
 *       
 * Für den Test, ob etwas ein Buchstabe ist gibt es 3 Varianten.
 * Jeder dieser Varianten entspricht eine if-Anweisung.
 * In einer richtigen Implementierung 
 *      muss man jeweils nur eine davon verwenden.
 */
public class NurBuchstaben 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		boolean nurBuchstaben1;		// Für jede der Testmethoden
		boolean nurBuchstaben2;		// gibt es eine eigene
		boolean nurBuchstaben3;		// Variable
		String eingabe;
		char zeichen;
		
		System.out.print("Bitte einen String eingeben: ");
		eingabe = s.next();
		
		nurBuchstaben1 = true;
		nurBuchstaben2 = true;
		nurBuchstaben3 = true;
		
		for (int i = 0; i < eingabe.length(); i++)
		{
			zeichen = eingabe.charAt(i);
			
			/* 
			 * In der Variante 1 werden die ASCII-Codes der Zeichen verglichen.
			 * 
			 * Nachdem die Buchstaben aufeinanderfolgen ist die relativ einfach.
			 * Der Code des Zeichens muss zwischen den Codes 
			 * der Buchstaben 'A' und 'Z' liegen. Analog für Kleinbuchstaben.
			 * 
			 * Ist dies nicht der Fall, so ist es kein Buchstabe.
			 * Deshalb das NOT (!).
			 */
			if (! (((int)zeichen >= (int)'A' && (int)zeichen <= (int)'Z') ||
				   ((int)zeichen >= (int)'a' && (int)zeichen <= (int)'z')))
				{
					nurBuchstaben1 = false;
				}
			
			/*
			 * Allerdings lassen sich Zeichen auch direkt vergleichen.
			 * 
			 * 'A' ist kleiner als 'B'
			 * 't' ist größer als 'r'
			 */
			if (! ((zeichen >= 'A' && zeichen <= 'Z') ||
				   (zeichen >= 'a' && zeichen <= 'z')))
			{
				nurBuchstaben2 = false;
			}
			
			/* 
			 * Mit etwas Recherche in den Skripten findet folgendes:
			 * 
			 * char c
			 * 
			 * Character.isLetter(c)
			 * 
			 * Dieser Aufruf liefert true, wenn c ein Buchstabe ist, 
			 * wobei auch Umlaute richtig erkannt werden.
			 * 
			 * (PowerPoint-Folie 36; Word-Skriptum Seite 15)
			 * 
			 * Dadurch lässt sich das ganze auch so schreiben:
			 */
			if (! Character.isLetter(zeichen))
			{
				nurBuchstaben3 = false;
			}
		}
		
		System.out.print("Methode1: ");
		if (nurBuchstaben1)
		{
			System.out.println("Nur Buchstaben.");
		}
		else
		{
			System.out.println("Da ist auch etwas anderes drin.");
		}

		System.out.print("Methode2: ");
		if (nurBuchstaben2)
		{
			System.out.println("Nur Buchstaben.");
		}
		else
		{
			System.out.println("Da ist auch etwas anderes drin.");
		}

		System.out.print("Methode3: ");
		if (nurBuchstaben3)
		{
			System.out.println("Nur Buchstaben.");
		}
		else
		{
			System.out.println("Da ist auch etwas anderes drin.");
		}	
	}

}

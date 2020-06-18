package aufgabe08;

import java.util.Scanner;

/*
 * Umdrehen: 
 * 
 * Lesen Sie einen beliebigen String ein 
 * und geben Sie den String in umgekehrter Reihenfolge aus.
 * 
 * Bespiel:
 * 	Eingabe: „asd3;+H“
 * 	Ausgabe: „H+;3dsa“
 * 
 * Hier finden Sie zwei Lösungsvarianten.
 */
public class Umdrehen 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		String eingabe;
		String ausgabe;
		
		System.out.print("Bitte geben Sie einen String ein: ");
		eingabe = s.nextLine();		// So können auch Leerzeichen eingegeben werden.
		
		/*
		 *  Variante 1:
		 *  
		 *  Die Eingabe zeichenweise von hinten nach vorne durchgehen
		 *  und so wieder zusammenbasteln.
		 */
		ausgabe = "";
		for (int i = eingabe.length() - 1; i >= 0; i--)
		{
			ausgabe += eingabe.substring(i, i + 1); 
		}
		System.out.println("Ergebnis 1: " + ausgabe);
		
		/*
		 *  Variante 2:
		 *  
		 *  Die Eingabe "normal" zeichenweise von vorne nach hinten durchgehen.
		 *  Die Ausgabe aber verkehrt zusammenbauen, 
		 *  also jedes Zeichen vorne anhängen.
		 */
		ausgabe = "";
		for (int i = 0; i < eingabe.length(); i++)
		{
			ausgabe = eingabe.substring(i, i + 1) + ausgabe; 
		}
		System.out.println("Ergebnis 2: " + ausgabe);
		
	}

}

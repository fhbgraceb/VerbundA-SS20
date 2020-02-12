package aufgabe08;

import java.util.Scanner;

/*
 * Umdrehen: 
 * 
 * Lesen Sie einen beliebigen String ein 
 * und geben Sie den String in umgekehrter Reihenfolge aus.
 * 
 * Bespiel:
 * 	Eingabe: �asd3;+H�
 * 	Ausgabe: �H+;3dsa�
 * 
 * Hier finden Sie zwei L�sungsvarianten.
 */
public class UmdrehenUP 
{
	
	/*
	 *  Variante 1:
	 *  
	 *  Die Eingabe zeichenweise von hinten nach vorne durchgehen
	 *  und so wieder zusammenbasteln.
	 */
	public static String umdrehen1(String text)
	{
		String ausgabe = "";
		
		for (int i = text.length() - 1; i >= 0; i--)
		{
			ausgabe += text.substring(i, i + 1); 
		}
		
		return ausgabe;
	}
	
	/*
	 *  Variante 2:
	 *  
	 *  Die Eingabe "normal" zeichenweise von vorne nach hinten durchgehen.
	 *  Die Ausgabe aber verkehrt zusammenbauen, 
	 *  also jedes Zeichen vorne anh�ngen.
	 */
	public static String umdrehen2(String text)
	{
		String ausgabe = "";
		
		for (int i = 0; i < text.length(); i++)
		{
			ausgabe = text.substring(i, i + 1) + ausgabe; 
		}
	
		return ausgabe;
	}


	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		String eingabe;
		
		System.out.print("Bitte geben Sie einen String ein: ");
		eingabe = s.nextLine();		// So k�nnen auch Leerzeichen eingegeben werden.
		
		System.out.println("Ergebnis 1: " + umdrehen1(eingabe));
		System.out.println("Ergebnis 2: " + umdrehen2(eingabe));
		
	}

}

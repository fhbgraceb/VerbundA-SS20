package aufgabe08;

import java.util.Scanner;

/*
 * Palindrom: 
 * 
 * Lesen Sie einen beliebigen String ein und 
 * stellen Sie fest ob es sich um ein Palindrom handelt
 * (liest sich von hinten genauso wie von vorne, 
 *  Beispiele: „Otto“, „Abba“, 
 *  Groß- und Kleinschreibung wird ignoriert).
 *  
 *  Lösung:
 *  Der String wird umgedreht und mit dem ursprünglichen String verglichen.
 *  Zum Umdrehen wird das Unterprogramm aus dem Beispiel "Umdrehen" verwendet.
 *  Dabei muss man aber 
 *      beide in Großbuchstaben (oder beide in Kleinbuchstaben) umwandeln,
 *      oder die vordefinierte Methode verwenden, 
 *           der Groß- und Kleinbuchstaben egal sind.
 */
public class PalindromUP 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String eingabe;
		String umgedreht;
		
		System.out.print("Bitte um einen String: ");
		eingabe = s.next();
		
		umgedreht = UmdrehenUP.umdrehen1(eingabe);

		if (eingabe.equalsIgnoreCase(umgedreht))
//		if (eingabe.toUpperCase().equals(umgedreht.toUpperCase()))
		{
			System.out.println("Das ist ein Palindrom!");
		}
		else
		{
			System.out.println("Das ist kein Palindrom.");
		}
		
	}

}

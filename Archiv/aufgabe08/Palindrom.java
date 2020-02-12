package aufgabe08;

import java.util.Scanner;

/*
 * Palindrom: 
 * 
 * Lesen Sie einen beliebigen String ein und 
 * stellen Sie fest ob es sich um ein Palindrom handelt
 * (liest sich von hinten genauso wie von vorne, 
 *  Beispiele: �Otto�, �Abba�, 
 *  Gro�- und Kleinschreibung wird ignoriert).
 *  
 *  L�sung:
 *  Der String wird umgedreht und mit dem urspr�nglichen String verglichen.
 *  Dabei muss man aber 
 *      beide in Gro�buchstaben (oder beide in Kleinbuchstaben) umwandeln,
 *      oder die vordefinierte Methode verwenden, 
 *           der Gro�- und Kleinbuchstaben egal sind.
 */
public class Palindrom 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String eingabe;
		String umgedreht;
		
		System.out.print("Bitte um einen String: ");
		eingabe = s.next();
		
		umgedreht = "";
		for (int i = eingabe.length() - 1; i >= 0; i--)
		{
			umgedreht += eingabe.substring(i, i + 1); 
		}

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

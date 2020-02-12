package aufgabe09;

import java.util.Scanner;

/*
 * Decode: 
 * 
 * Schreiben Sie ein Unterprogramm decode() die einen String 
 * als Eingabe hat, der abwechselnd aus Buchstaben und Ziffern besteht. 
 * 
 * Dieser String soll in der folgenden Form umgewandelt werden:
 *  
 * „Die Ziffer nach jedem Buchstaben gibt an, 
 * wie oft dieser in der Ausgabe wiederholt werden soll.“
 * 
 * Beispiel:
 * 
 * decode(„A3B2F4A2“) -> „AAABBFFFFAA“
 * 		Erklärung: erst 3 „A“, dann 2 „B“, dann 4 „F“, dann 2 „A“
 * 
 */
public class Decode 
{

	public static String decode (String code)
	{
		String text;
		char buchstabe;
		char ziffer;
		int anzahl;
		
		text = "";
		
		if (code.length() % 2 == 0)
		{
			for (int i = 0; i < code.length(); i += 2)
			{
				buchstabe = code.charAt(i);
				ziffer = code.charAt(i + 1);
				
				// Zwischenausgabe zum Testen
//				System.out.println(buchstabe + " : " + ziffer + " : " + (int)ziffer);
				
				anzahl = (int)ziffer - (int)'0';
				for (int j = 1; j <= anzahl; j++)
				{
					text += buchstabe;
				}
			}
			return text;
		}
		else
		{
			return "Ungültige Eingabe!";
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		String eingabe;
		String ausgabe;
		
		System.out.print("Bitte den Code eingeben: ");
		eingabe = s.next();
		
		// Zum Testen:
//		eingabe = "A3B2F4A2";
//		eingabe = "";
//		eingabe = "ABCB";	//
//		eingabe = "A2C";	// ungerade Anzahl Zeichen -> Fehler
		
		ausgabe = decode(eingabe);

		System.out.println(ausgabe);
	}

}

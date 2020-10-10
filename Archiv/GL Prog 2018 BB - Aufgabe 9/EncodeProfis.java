package aufgabe09;

import java.util.Scanner;

/*
 * EncodeProfis: 
 * 
 * Schreiben Sie ein Unterprogramm encode(), das einen String 
 * aus Grossbuchstaben „komprimiert“. Dabei wird für jeden vorkommenden 
 * Buchstaben angegeben, wie oft er direkt hintereinander wiederholt wird.
 * 
 * Beispiel:
 * 
 * 	encode(„AAABBCAA“) -> „A3B2C1A2“
 * 
 * Erklärung: zuerst kommen 3 „A“ direkt hintereinander, 
 * 			dann 2 „B“, dann 1 „C“, dann (wieder) 2 „A“
 * 
 * Für Profis: 
 * 
 * kommen mehr als 9 Wiederholungen vor, 
 * so muss diese Anzahl „gespilttet“ werden, 
 * so dass keine zweistellige Zahl im Code vorkommt:
 * 
 * Beispiel:		
 * 
 * „AAAIIIIIIIIIIIIIIIIIIIIIIIOOO“
 * 	(3x „A“, 23x „I“, 3x „O“)
 * 
 * 	kodiert:	„A3I9I9I5O3“
 */
public class EncodeProfis 
{
	
	public static String encode(String text)
	{
		String code;
		char akt;		// "aktueller" Buchstabe, der gezählt wird
		char c;
		int anzahl;
		
		code = "";
		
		if (text.length() > 0)
		{
			akt = text.charAt(0);
			anzahl = 1;
			for (int i = 1; i < text.length(); i++)
			{
				c = text.charAt(i);
				if (akt == c)
				{
					if (anzahl == 9)	// bereits 9 gleiche Zeichen gefunden, das neue wäre das 10.
					{
						// Die neun Zeichen als Code ausgeben
						code = code + akt + anzahl;
						// Das zehnte (neue) bleibt noch über
						anzahl = 1;
					}
					else
					{
						anzahl++;
					}
				}
				else
				{
					code = code + akt + anzahl;
					akt = c;
					anzahl = 1;
				}
			}
			code = code + akt + anzahl;
			return code;
		}
		else
		{
			return "Nix drin";
		}		
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String eingabe;
		String ausgabe;
		
		System.out.print("Bitte einen String eingeben: ");
		eingabe = s.next();
		
		// Zum Testen:
//		eingabe = "AAABBCAA";
//		eingabe = "";
//		eingabe = "X";
//		eingabe = "AAAIIIIIIIIIIIIIIIIIIIIIIIOOO";
		
		ausgabe = encode(eingabe);
				
		System.out.println(ausgabe);
	}

}

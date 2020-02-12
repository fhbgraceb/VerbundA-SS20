package aufgabe09;

import java.util.Scanner;

/*
 * SeltsameFolge: 
 * 
 * Schreiben Sie ein Programm, das eine Folge, 
 * die mit einer einstelligen Zahl beginnt und 
 * nach untenstehendem Muster aufgebaut ist, ermittelt und ausgibt.
 * 
 * Beispiel: Es wurde 1 eingegeben. Untenstehende Folge ist das Ergebnis.
 * 
 * 	1,11,21,1211,111221,312211,13112221,1113213211,31131211131221, �
 * 
 * 	Die Folge entsteht durch die Dokumentation der vorhergehenden Zahl:
 * 
 * 		1 = ein Einser => 11
 * 		11 = zwei Einser => 21
 * 		21 = ein Zweier ein Einser => 1211
 * 		1211 = ein Einser ein Zweier zwei Einser => 111221
 * 			usw.
 * 
 * Beispiel: Es wurde 3 eingegeben. Ergebnis ist
 * 
 * 	3,13,1113,3113,132113,1113122113,311311222113,�.
 * 
 * 		3 = ein Dreier => 13
 * 		13 = ein Einser, ein Dreier => 1113
 *			...
 *
 * Die einstellige Startzahl soll vom Programm eingelesen werden.
 * Die ersten 10 Zahlen der Reihe sollen berechnet 
 * und ausgegeben werden wobei die Berechnung eines 
 * weiteren Elementes der Folge von einem Unterprogrammes
 * durchgef�hrt werden soll.
 * 
 * Der Einfachheit halber wird zwar eine Zahl eingelesen,
 * aber mit Strings gearbeitet.
 */
public class SeltsameFolge 
{

	/*
	 * Der Eingabestring wird von vorne nach hinten durchgegangen.
	 * Es wird mitgez�hlt, wie oft dieselbe Ziffer vorkommt.
	 * Kommt eine andere Ziffer, so wird die Anzahl und die Ziffer
	 * zur Ausgabe dazugegeben.
	 * 
	 * Achtun! Man muss bei 1 zum Z�hlen beginnen, 
	 * weil man ja die erste Ziffer schon "in der Hand hat".
	 */
	public static String umwandlung(String eingabe)
	{
		String ausgabe = "";
		int anzahl;
		char ziffer;
		char ziffer2;
		
		// Sonderf�lle beachten
		if ((eingabe == null) || (eingabe.length() == 0))
		{
			// Unterprogramm beenden
			return eingabe;
		}
		else
		{
			ziffer = eingabe.charAt(0);
			anzahl = 1;
			for (int i = 1; i < eingabe.length(); i++)
			{
				ziffer2 = eingabe.charAt(i);
				if (ziffer == ziffer2)		// ein weiteres Vorkommen derselben Ziffer
				{
					anzahl++;
				}
				else	// neue Ziffer
				{
					ausgabe = ausgabe + anzahl + ziffer;
					ziffer = ziffer2;
					anzahl = 1;
				}
			}
			
			// Die letzten Buchstaben nicht vergessen!
			ausgabe = ausgabe + anzahl + ziffer;
			
			return ausgabe;
		}
	}
	
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int zahl;
		String zahlString;
		
		do
		{
			System.out.print("Bitte eine Ziffer eingeben: ");
			zahl = s.nextInt();
		} while (! ((zahl >= 1) && (zahl <= 9)));
		zahlString = "" + zahl;
		
		System.out.println(zahlString);
		for (int i = 1; i <= 10; i++)
		{
			zahlString = umwandlung(zahlString);
			System.out.println(zahlString);
		}
	}

}

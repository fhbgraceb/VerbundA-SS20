package aufgabe05_Prog2018;

import java.util.Scanner;

/*
 * Zweierpotenz: 
 * 
 * Schreiben Sie ein Programm, 
 * das eine natürliche Zahl einliest und 
 * die größte Zweierpotenz ausgibt, die die eingelesene Zahl teilt.
 * 
 * 
 * Eingabe 	Ausgabe 
 * 	  17	   1 
 * 	  48	  16 
 * 	1024 	1024 
 * 
 * Vorgehen:
 * Hier werden so lange alle Zweierpotenzen getestet, so lange sie Teiler der Zahl sind.
 * Wenn die Schleuife beendet wird, so ist man eine Zweierpotenz "zu weit gegangen",
 * (diese ist ja kein Teiler der Zahl)
 * man muss also zur letzten Zweierpotenz zurückkehren.
 * 
 * Diese Lösung wurde auch in ein Unterprogramm gepackt, was das Testen erleichtert:
 * An den auskommentierten Aufrufen des Unterprogramms erkennt man,
 * ob die Werte richtig berechnet werden.
 */
public class ZweierPotenz_V2 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int zahl;
		int teiler;
		
		System.out.println(" *** Programm Zweierpotenz - Variante 2 ***");
		
//		System.out.println("Tests");
//		System.out.println("Test mit   17 - sollte    1 ergeben: " + zweierPotenz(17));
//		System.out.println("Test mit   48 - sollte   16 ergeben: " + zweierPotenz(48));
//		System.out.println("Test mit 1024 - sollte 1014 ergeben: " + zweierPotenz(1024));

		System.out.print("Bitte geben Sie eine Zahl ein: ");
		zahl = s.nextInt();
		
		teiler = zweierPotenz(zahl);
		
		System.out.println("Die größte Zweierpotenz, die " + zahl + " teilt ist: " + teiler);
	}

	public static int zweierPotenz (int zahl)
	{
		int teiler;
		
		teiler = 1;
		while (zahl % teiler == 0)
		{
			teiler *= 2;
		}
		teiler /= 2;
		
		return teiler;
	}
}

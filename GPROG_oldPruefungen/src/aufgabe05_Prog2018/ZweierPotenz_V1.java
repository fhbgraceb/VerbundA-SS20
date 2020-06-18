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
 * Es werden alle Zweierpotenzen getestet, ob Sie die eingegebene Zahl teilen.
 * Falls ja wird sie als Teiler gemerkt,
 * Falls nicht wird die Schleife beendet.
 */
public class ZweierPotenz_V1 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int zahl;
		int zweierPotenzTeilt;		// eine Zweierpotenz, die die eingegebene Zahl teilt
		int zweierPotenzTest;		// Die nächste Zweierpotenz, bei der erst getestet werden muss, ob sie die Zahl teilt
		
		System.out.println(" *** Programm Zweierpotenz - Variante 1 ***");
		
		System.out.print("Bitte geben Sie eine Zahl ein: ");
		zahl = s.nextInt();
		
		
		zweierPotenzTeilt = 1;		// Jede Zahl wird von 1 geteilt
		zweierPotenzTest = 2;		// Zuerst müssten wir also mit 2 testen
		while (zahl % zweierPotenzTest == 0)
		{
			zweierPotenzTeilt = zweierPotenzTest;	// Die Testzahl ist ein Teiler
			zweierPotenzTest *= 2;					// Wir gehen zur nächsten Zweierpotenz
		}
		
		System.out.println("Die größte Zweierpotenz, die " + zahl + " teilt ist: " + zweierPotenzTeilt);
	}

}

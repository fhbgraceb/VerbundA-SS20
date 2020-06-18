package aufgabe02_Prog2018;

import java.util.Scanner;

/*
 * Beispielgruppe 1 - Grundlagen: Ein/Ausgabe, einfache Berechnungen
 * 
 * Sekunden1:
 * Gehen Sie davon aus, dass ein Jahr aus 12 Monaten à 30 Tagen besteht:
 * Schreiben Sie ein Programm zur Umrechnung von Sekunden in die entsprechende 
 * Anzahl von Jahren, Monaten, Tagen, Stunden, Minuten und Sekunden. 
 * Die Anzahl der Sekunden soll eingelesen werden.
 * 
 * Testwerte: 
 *  31104000	(1 Jahr)
 * 	33786061 	(1 Jahr, 1 Monat, 1 Tag, 1 Stunde, 1 Minute, 1 Sekunde)
 *	31104000000 (1000 Jahre)
 */
public class SekundenJahre
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		/*
		 *  Die Umrechnung zwischen Sekunden und Minuten, Minuten und Stunden, etc
		 *  sind stets fix und sollten als Konstante definiert werden.
		 *  
		 *  Dies verhindert eher dass Tippfehlern übersehen werden.
		 */
		final int sekundenProMinute = 60;
		final int minutenProStunde = 60;
		final int stundenProTag = 24;
		final int tageProMonat = 30;
		final int monateProJahr = 12;
		
		long alleSekunden;		// long: damit man auch viele, viele Sekunden umrechnen kann
		long restZeit; 			// damit man beim Umrechnen alleSekunden behalten kann

		int sekunden;
		int minuten;
		int stunden;
		int monate;
		int tage;
		int jahre;
		
		System.out.println(" *** Zeitumrechnung ***");
		
		System.out.print("Bitte die Gesamtzahl der Sekunden eingeben: ");
		alleSekunden = s.nextLong();
		
		restZeit = alleSekunden;

		sekunden = (int)(restZeit % sekundenProMinute);	// % .. Modulo - Was bleibt über, wenn man durch sekundenProMinute dividiert?
		restZeit = (restZeit - sekunden) / sekundenProMinute;
		
		minuten = (int)(restZeit % minutenProStunde);
		restZeit = (restZeit - minuten) / minutenProStunde;
		
		stunden = (int)(restZeit % stundenProTag);
		restZeit = (restZeit - stunden) / stundenProTag;
		
		tage = (int)(restZeit % tageProMonat);
		restZeit = (restZeit - tage) / tageProMonat;
		
		monate = (int)(restZeit % monateProJahr);
		restZeit = (restZeit - monate) / monateProJahr;
		
		jahre = (int)restZeit;
		
		System.out.println("Das sind: ");
		System.out.println("  " + jahre + " Jahre ");
		System.out.println("  " + monate + " Monate ");
		System.out.println("  " + tage + " Tage ");
		System.out.println("  " + stunden + " Stunden ");
		System.out.println("  " + minuten + " Minuten ");
		System.out.println("  " + sekunden + " Sekunden ");
	
		System.out.println("******************************************");
        
        s.close();
	}
}

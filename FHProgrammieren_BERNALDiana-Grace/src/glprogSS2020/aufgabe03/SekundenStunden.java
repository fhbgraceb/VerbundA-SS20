package aufgabe03;

import java.util.Scanner;

/*
 * Beispielgruppe 1 - Grundlagen: Ein/Ausgabe, einfache Berechnungen
 * 
 * SekundenStunden:
 * Schreiben Sie ein Programm zur Umrechnung von Sekunden in die entsprechende 
 * Anzahl von Stunden, Minuten und Sekunden. 
 * Die Anzahl der Sekunden soll eingelesen werden.
 * 
 * Beispiele:
 * 127 Sekunden sind 0 Stunden 2 Minuten und 7 Sekunden
 * 7272 Sekunden sind 2 Stunden 1 Minuten und 12 Sekunden
 */
public class SekundenStunden
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
		
		int alleSekunden;
		int restZeit;

		int sekunden;
		int minuten;
		int stunden;
		
		System.out.println(" *** Zeitumrechnung ***");
		
		System.out.print("Bitte die Gesamtzahl der Sekunden eingeben: ");
		alleSekunden = s.nextInt();
		
		restZeit = alleSekunden;

		sekunden = (int)(restZeit % sekundenProMinute);	// % .. Modulo - Was bleibt über, wenn man durch sekundenProMinute dividiert?
		restZeit = (restZeit - sekunden) / sekundenProMinute;
		
		minuten = (int)(restZeit % minutenProStunde);
		stunden = (int)(restZeit - minuten) / minutenProStunde;
				
		System.out.println("Das sind: " + stunden + " Stunden " + minuten + " Minuten " + sekunden + " Sekunden ");
	
		System.out.println("******************************************");
        
        s.close();
	}
}

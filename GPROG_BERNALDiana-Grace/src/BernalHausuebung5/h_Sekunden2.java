package BernalHausuebung5;

import java.util.Scanner;

public class h_Sekunden2 {
	
	/*
	 8. Sekunden2: Gehen Sie davon aus, dass ein Jahr aus 12 Monaten à 30 Tagen
	besteht: Schreiben Sie ein Programm zur Umrechnung von Jahren, Monaten,
	Tagen, Stunden, Minuten und Sekunden in die entsprechende Anzahl von
	Sekunden. [6] 
	 */

	public static long zeitInSekunden(int jahre, int monate, int tage, int stunden, int minuten, int sekunden)
	{
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

		/*
		 * Im Prinzip wird hier etwas ähnliches wie das Horner-Schema verwendet
		 * Wegen der Übersichtlichkeit wird der Ausdruck
		 * 
		 * alleSekunden = ((((jahre * monateProJahr + monate) * * tageProMonat + tage) * stundenProTag + stunden) * minutenProStunde + minuten) * sekundenProMinute + sekunden;
		 * 
		 * aber auf mehrere Zeilen aufgeteilt:
		 */
		long alleMonate = 0;
		long alleTage = 0;
		long alleStunden = 0;
		long alleMinuten = 0;
		long alleSekunden = 0;

		alleMonate = jahre * monateProJahr + monate;
		alleTage = alleMonate * tageProMonat + tage;
		alleStunden = alleTage * stundenProTag + stunden;
		alleMinuten = alleStunden * minutenProStunde + minuten;
		alleSekunden = alleMinuten * sekundenProMinute + sekunden;
			
		return alleSekunden;
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		
		long alleSekunden;		// long: damit man auch viele, viele Sekunden umrechnen kann

		int sekunden;
		int minuten;
		int stunden;
		int monate;
		int tage;
		int jahre;
		
		/*
		 * Zum Testen, ob das Programm richtig rechnet:
		 * Die Ergebnis-Werte stammen aus dem Programm Sekunden1
		 * (Dieses wurde bereits überprüft und für richtig befunden.)
		 *
		 * Wenn die Ergebnisse stimmen, die Testwerte auskommentieren
		 * um sie bei späteren Änderungen nochmals zu verwenden.
		 * 
		 * Durch die Anweisung
		 * 
		 * System.exit(0);
		 * 
		 * nach den Testdaten wird das Programm nach den Testdaten beendet
		 * (und man muss keine Werte mehr einlesen).
		 */
//		System.out.println(zeitInSekunden(0, 0, 0, 0, 2, 7));		// 127
//		System.out.println(zeitInSekunden(0, 0, 0, 1, 0, 0));		// 3600
//		System.out.println(zeitInSekunden(1, 0, 0, 0, 0, 0));		// 31104000
//		System.out.println(zeitInSekunden(1, 1, 1, 1, 1, 1));		// 33786061
//		System.out.println(zeitInSekunden(1000, 0, 0, 0, 0, 0));	// 31104000000
//
//		System.exit(0);
		
		System.out.println("******************************************");
		System.out.println("          *** Zeitumrechnung ***");
		
		System.out.println("Bitte die Zeit eingeben, die umgerechnet werden soll!");
		System.out.print("Jahre: ");
		jahre = s.nextInt();
		System.out.print("Monate: ");
		monate = s.nextInt();
		System.out.print("Tage: ");
		tage = s.nextInt();
		System.out.print("Stunden: ");
		stunden = s.nextInt();
		System.out.print("Minuten: ");
		minuten = s.nextInt();
		System.out.print("Sekunden: ");
		sekunden = s.nextInt();

		alleSekunden = zeitInSekunden(jahre, monate, tage, stunden, minuten, sekunden);
		
		System.out.println("\n------------------------------------------\n");		
		System.out.printf("%5d Jahr(e) \n", jahre);
		System.out.printf("%5d Monat(e) \n", monate);
		System.out.printf("%5d Tag(e) \n", tage);
		System.out.printf("%5d Stunde(n) \n", stunden);
		System.out.printf("%5d Minute(n) \n", minuten);
		System.out.printf("%5d Sekunde(n) \n", sekunden);
		System.out.println("sind: ");
		System.out.println(alleSekunden + " Sekunden.");
	
		System.out.println("******************************************");
		
		s.close();
	}

}

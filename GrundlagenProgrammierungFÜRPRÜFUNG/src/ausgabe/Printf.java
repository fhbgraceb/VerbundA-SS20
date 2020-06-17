package ausgabe;

public class Printf 
{
	/*
	 * Ein paar Beispiele für die Verwendung von printf
	 * 
	 * Um die Übersichtlichkeit zu bewahren wird hier meist nur ein Wert ausgegeben.
	 * Es können jeodch beliebig viele Platzhalter und Wertte angegeben werden.
	 * 
	 * Gehen Sie das Programm schrittweise im Debug-Modus durch
	 * um sich dieses Befehl für Befehl ansehen zu können.
	 */
	public static void main(String[] args) 
	{
		String name1 = "Joe";
		String name2 = "Roberta";
		System.out.printf("Mein Name ist %s.\n", name1);	// s für String
		System.out.printf("Mein Name ist %s.\n", name2);
		System.out.printf("Mein Name ist %9s.\n", name1);	// 9 Stellen für Namen vorsehen 
		System.out.printf("Mein Name ist %9s.\n", name2);
		System.out.printf("Mein Name ist %-9s.\n", name1);	// rechtsbündig
		System.out.printf("Mein Name ist %-9s.\n", name2);
		
		System.out.println();
		
		int punkte1 = 17;
		int punkte2 = 2314;
		System.out.printf("Sie haben %d Punkte.\n", punkte1);		// d für integer (decimal)
		System.out.printf("Sie haben %d Punkte.\n", punkte2);		// d für integer (decimal)
		System.out.printf("Sie haben %7d Punkte.\n", punkte1);
		System.out.printf("Sie haben %7d Punkte.\n", punkte2);
		System.out.printf("Sie haben %-7d Punkte.\n", punkte1);
		System.out.printf("Sie haben %-7d Punkte.\n", punkte2);
		
		System.out.println();

		double messwert1 = 123.45678;
		double messwert2 = 76.543;		
		System.out.printf("%f\n", messwert1);
		System.out.printf("%f\n", messwert2);
		System.out.printf("%9.1f\n", messwert1);		// Fliesskommazahl mit 9 Stellen und einer Nachkommastelle
		System.out.printf("%9.1f\n", messwert2);		// Hier wird entsprechend gerundet
		System.out.printf("%9.2f\n", messwert1);		// entscheidend ist dei Anzahl der Nachkommastellen
		System.out.printf("%9.2f\n", messwert2);
		System.out.printf("%9.3f\n", messwert1);		
		System.out.printf("%9.3f\n", messwert2);		
		
		System.out.println();
		
		/*
		 * Aus Gründen der Übersicht wird beim letzten Beispiel auf die Verwendung von Variablen verzichtet.
		 */
		System.out.println("           *** Gehaltsliste ***");
		System.out.printf("%-6s %-12s %-15s %-9s\n", "ANr", "Vorname", "Nachname", "Gehalt");
		System.out.printf("%6d %-12s %-15s %9.2f €\n", 12345, "Max", "Huber", 1234.5);
		System.out.printf("%6d %-12s %-15s %9.2f €\n", 23456, "Katharina", "Althof", 12700.0);
		System.out.printf("%6d %-12s %-15s %9.2f €\n", 78354, "Romana", "Schmiedbauer", 2300.0);
		
	}

}

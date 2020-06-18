package aufgabe01_Prog2018;

/*
 * Beispielgruppe 1 - Grundlagen: Ein/Ausgabe, einfache Berechnungen
 * 
 * Gauss:
 * Berechnen Sie die Summe der Zahlen von 1 bis n 
 * mittels der Gaussíschen Summenformel.
 * 
 * Anmerkung:
 *    Summe 1 + .. + n = n * (n +1) / 2
*/

public class Gauss 
{
    public static void main(String args[]) 
    {
    	int n;
    	int summe;
    	
    	n = 6;

    	summe = n * (n + 1) / 2;
    	System.out.println("Die Summe von 1 bis " + n + " ist: " + summe);
    }
}

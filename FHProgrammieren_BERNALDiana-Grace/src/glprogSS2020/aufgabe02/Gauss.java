package aufgabe02;

/*
 * Beispielgruppe 1 - Grundlagen: Ein/Ausgabe, einfache Berechnungen
 * 
 * Gauss:
 * Berechnen Sie die Summe der Zahlen von 1 bis n 
 * mittels der Gauss’schen Summenformel.
 * 
 * Anmerkung:
 *    Summe 1 + .. + n = n * (n +1) / 2
*/

import java.util.Scanner;

public class Gauss 
{
    public static void main(String args[]) 
    {
    	Scanner s = new Scanner(System.in);

    	int n;
    	int summe;
    	
    	System.out.print("Bitte n eingeben: ");
    	n = s.nextInt();

    	summe = n * (n + 1) / 2;
    	System.out.println("Die Summe von 1 bis " + n + " ist: " + summe);
        
        s.close();
    }
}

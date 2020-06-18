package aufgabe04;

/*
 * Beispielgruppe 2 - Unterprogramme
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
	public static int gauss(int n)
	{
		int ergebnis = 0;
		
		ergebnis = n * (n + 1) / 2;

		return ergebnis;
	}
	
    public static void main(String args[]) 
    {
    	Scanner s = new Scanner(System.in);

    	int n;
    	int summe;

    	//
    	// Zum einfachen Testen ob das Unterprogramm stimmt zuerst ein paar Testläufe:
    	// Wenn die stimmen wieder auskommentieren (um sie bei späteren Änderungen zu haben)
    	//
//    	System.out.println(gauss(1));
//    	System.out.println(gauss(2));	// 1 + 2 = 3
//    	System.out.println(gauss(4));	// 1 + 2 + 3 + 4 = 10
//    	System.out.println(gauss(100));	// 1 + 2 + ... + 99 + 100 = 5050 (irgendwo im WWW gefunden ;-)

    	
    	System.out.print("Bitte n eingeben: ");
    	n = s.nextInt();

    	summe = gauss(n);
    	System.out.println("Die Summe von 1 bis " + n + " ist: " + summe);
    }
}

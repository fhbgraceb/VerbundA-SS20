package aufgabe05;

import java.util.Scanner;

/*
 * Beispielgruppe 4 - Schleifen
 * 
 * AllePrimzahlen:
 * 
 *  Lesen Sie eine Zahl ein und geben Sie alle Primzahlen aus,
 *  die kleiner als diese Zahl sind.
 *  
 *  Beispiel:
 *  	Eingabe: 10
 *  	Ausgabe: 2, 3, 5, 7
 *  (kann auch in mehreren Zeilen ausgegeben werden.)
 *  
 */
/*
 * !!! Version mit Unterprogramm aus anderem Programm.
 * 
 * Der Primzahltest wurde bereits einmal als Unterprogramm programmiert, 
 * allerdings bei einem anderen Programm (istPrimzahl() in PrimzahlUP).
 * 
 * Dieses kann jedoch von hier aus aufgerufen werden, wenn man den Programmnamen
 * vor den Unterprogrammnamen schreibt also PrimzahlUP.istPrimzahl().
 * Dazu muss das andere Programm aber im selben Package liegen.
 */
public class AllePrimzahlenUPReuse 
{
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int zahl;
		
		System.out.print("Bitte die Zahl eingeben: ");
		zahl = s.nextInt();
		
		/* 
		 * Äussere Schleife um eine Zahl nach der anderen zu Testen.
		 * Ausgabe der Zahlen erfolgt in der Schleife.
		 */
		System.out.println("Primzahlen kleiner als " + zahl + " sind:");
		for (int n = 2; n < zahl; n++)
		{
			if (PrimzahlUP.istPrimzahl(n))
			{
				System.out.print(n + " ");
			}
		}
	}

}

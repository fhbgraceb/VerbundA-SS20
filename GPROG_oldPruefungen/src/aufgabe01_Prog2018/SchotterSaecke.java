package aufgabe01_Prog2018;

/*
 * Beispielgruppe 1 - Grundlagen: Ein/Ausgabe, einfache Berechnungen
 * 
 * Schottersäcke: 
 * Sie sitzen an der LKW-Waage an der Ausfahrt eines Schotterwerkes.
 * In diesem wird Schotter in 50 kg Säcke verpackt und mit LKWs abtransportiert. 
 * Geben Sie das Leergewicht des LKWs und das Gewicht des beladenen LKWs ein
 * und berechnen Sie daraus wie viele Säcke er geladen hat.
 */

/* 
 * Bei diesem Beispiel sieht man die verschiedenen Varianten des Rundens.
 * Bitte mit den folgenden Werten für den leeren/vollen LKW ausprobieren:
 * 1000 / 1074
 * 1000 / 1075
 * 1000 / 1076
 * Es wären also 1 1/2 Säcke geladen worden.
 */
public class SchotterSaecke 
{

	public static void main(String[] args) 
	{
		double leerGewicht;		
		double vollGewicht;
		int anzahl;					// Nur ganze Säcke
		
		final double sackGewicht = 50.0;	// Konstante: ist in der Angabe fix vorgegeben
		
		// Einlesen des Gewichts des LKWs
		leerGewicht = 1500;
		vollGewicht = 2750;
		
		/*
		 *  Anzahl berechnen
		 *  Die Anzahl ist das ladegewicht des LKWs (voll - leer) 
		 *  dividiert durch das Gewicht eines Sacks
		 *  Das Ergebnis muss in integer umgerechnet werden.
		 */  
		anzahl = (int)Math.round(((vollGewicht - leerGewicht) / sackGewicht));		// exaktes runden
		
		// Ausgabe
		System.out.println("Der LKW hat " + anzahl + " Säcke geladen.");
	}

}

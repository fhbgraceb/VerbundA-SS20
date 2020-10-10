package aufgabe01;

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
import java.util.Scanner;

public class SchotterSaeckeScanner 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		double leerGewicht;		
		double vollGewicht;
		int anzahl1;				// Nur ganze Säcke
		int anzahl2;				// Um die verschiedenen Varianten des Rundens zu zeigen
		int anzahl3;				// werden alle Verfahren gleichzeitig gezeigt
		
		final double sackGewicht = 50.0;	// Konstante: ist in der Angabe fix vorgegeben
		
		// Einlesen des Gewichts des LKWs
		System.out.print("Wie viel wiegt der leere LKW? ");
		leerGewicht = s.nextDouble();
		System.out.print("Wie viel wiegt der volle LKW? ");
		vollGewicht = s.nextDouble();
		
		/*
		 *  Anzahl berechnen
		 *  Die dabei auftretenden Rundungsfehler werden je nach Rundngsverfahren behandelt.
		 *  In der Raelität kann der Fahrer etwa gegessen haben, Müll aus dem LKW entferenen, etc.
		 *  
		 *  Die Anzahl ist das ladegewicht des LKWs (voll - leer) 
		 *  dividiert durch das Gewicht eines Sacks
		 *  Das Ergebnis muss in integer umgerechnet werden.
		 */  
		anzahl1 = (int)Math.round(((vollGewicht - leerGewicht) / sackGewicht));		// exaktes runden
		anzahl2 = (int)Math.floor(((vollGewicht - leerGewicht) / sackGewicht));		// abrunden
		anzahl3 = (int)Math.ceil(((vollGewicht - leerGewicht) / sackGewicht));		// aufrunden
		
		// Ausgabe
		System.out.println("Der LKW hat " + anzahl1 + " Säcke geladen.");
		System.out.println("Der LKW hat " + anzahl2 + " Säcke geladen.");
		System.out.println("Der LKW hat " + anzahl3 + " Säcke geladen.");
        
        s.close();
	}

}

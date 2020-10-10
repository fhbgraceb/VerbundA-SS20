package aufgabe02;

/*
 * Beispielgruppe 1 - Grundlagen: Ein/Ausgabe, einfache Berechnungen
 * 
 * Lotto:
 * Schreiben Sie ein Programm, das die Wahrscheinlichkeit für 
 * einen Lottosechser beim österreichischen System (6 aus 45) berechnet. 
 * 
 * Problem bei dieser Aufgabe ist den richtigen Datentyp zu finden,
 * bei dem es zu keinem "Überlauf" kommt.
 * 
 * Variable vom Typ int (integer) können nur Werte
 *  zwischen -2147483648 und 2147483647 speichern (ca. +/- 2 Milliarden).
 *  Bei der Berechnung wird dieser Wert überstiegen und ein falscher Wert entsteht.
 *  
 * 
 */

public class Lotto {

	public static void main(String[] args) {
		int wertI;
        long wertL;
        double wertD;

        /*
         * Integer
         */
        System.out.println(" * Integer-Variable");
        wertI = (45 * 44 * 43 * 42 * 41 * 40) / (6 * 5 * 4 * 3 * 2 * 1);
        System.out.println("Die Wahrscheinlichkeit eines Lotto-Sechsers betraegt: " +
                           ( 1.0 / wertI ));
        System.out.println("   oder 1 : " + wertI);
        System.out.println();
        
        /*
         * Long
         */
        System.out.println(" * Long-Variable");
        wertL = (45 * 44 * 43 * 42 * 41 * 40) / (6 * 5 * 4 * 3 * 2 * 1);
        System.out.println("Die Wahrscheinlichkeit eines Lotto-Sechsers betraegt: " +
                           ( 1.0 / wertL ));
        System.out.println("   oder 1 : " + wertL);
        
        System.out.println();
        System.out.println(" * Long-Variable mit long-Werten");
        wertL = (45L * 44 * 43 * 42 * 41 * 40) / (6L * 5 * 4 * 3 * 2 * 1);
        System.out.println("Die Wahrscheinlichkeit eines Lotto-Sechsers betraegt: " +
                           ( 1.0 / wertL ));
        System.out.println("   oder 1 : " + wertL);
        
        System.out.println();
        System.out.println(" * Long-Variable - umgeformte Formel");
        wertL = (45 / 5 * 44 / 4 * 43 * 42 / 6 * 41 * 40 / 2) / 3;
        System.out.println("Die Wahrscheinlichkeit eines Lotto-Sechsers betraegt: " +
                           ( 1.0 / wertL ));
        System.out.println("   oder 1 : " + wertL);

        /*
         * Double
         */
        System.out.println();
        System.out.println(" * Double-Variable aber integer Zahlen");
        wertD = (45 * 44 * 43 * 42 * 41 * 40) / (6 * 5 * 4 * 3 * 2);
        System.out.println("Die Wahrscheinlichkeit eines Lotto-Sechsers betraegt: " +
                           ( 1.0 / wertD ));
        System.out.println("   oder 1 : " + wertD);        

        System.out.println();
        System.out.println(" * Double-Variable mit double Zahlen");
        wertD = (45.0 * 44.0 * 43.0 * 42.0 * 41.0 * 40.0) / (6.0 * 5.0 * 4.0 * 3.0 * 2.0);
        System.out.println("Die Wahrscheinlichkeit eines Lotto-Sechsers betraegt: " +
                           ( 1.0 / wertD ));
        System.out.println("   oder 1 : " + wertD);        
	}
}

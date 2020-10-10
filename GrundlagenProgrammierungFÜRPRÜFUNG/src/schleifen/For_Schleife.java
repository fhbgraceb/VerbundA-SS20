<<<<<<< HEAD
package schleifen;
import java.util.Scanner;

public class For_Schleife {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// FOR Schleifen eignen sich immer dann,
		// wenn die Anzahl der Wiederholungen 
		// von Anfang an feststeht.
		// Wenn in der Schleife mehr als eine Anweisung erfolgt, muss
		// das {} gesetzt werden!
		
		//Einfache Ausgabe der Zahlen 1-10 und deren Quadrate
		for (int i = 1;i <= 10; i++)
			System.out.println("Zahl " + i + " deren Quadrat: " + i*i);
		
		//oder absteigend gez�hlt in 2'er Schritten
		for (int i = 10;i > 0; i=i-2)
			System.out.println("Zahl " + i + " deren Quadrat: " + i*i);
		
		// verschachtelte FOR Schleifen
		
		// Beispiel f�r Eingabe einer 2 * 3 Matrix
		int eingabe;
		Scanner in = new Scanner(System.in);
		for (int zeile = 1; zeile <=2; zeile++)
			for (int spalte = 1; spalte <= 3; spalte++){
				System.out.println("Eingabe von (" + zeile + "," + spalte + ")");
				eingabe = in.nextInt() ;
			}
				
		// Beispiel zur Jahreszeit passend
		// die Darstellung eines Weihnachtsbaumes mit aussen brennenden Kerzen
		
		System.out.println("Bitte eine Baumh�he eingeben.");
		Scanner inp = new Scanner(System.in);
		int hoehe = inp.nextInt();
			String baum = ""; 
		   //"Krone" des Baumes zeichnen 
		    for (int i=1; i<=hoehe; i++) {		//Schleife �ber Baumh�he 
		    	for (int j=1; j<=hoehe-i; j++) 	//Schleife �ber Astbreite mit " "
		    		System.out.print(" "); 
		    	for (int j=1; j<=(2*i-1); j++)	//Schleife �ber Astbreite mit "*" 
		    		baum = baum + "*";
		    	if (i > 1) 						//Ab dem 2. Ast immer ganz aussen 1 Kerze darstellen
		    		baum= ("i" + baum.substring(1,baum.length()-1) + "i");
		    	System.out.print(baum);
		    	System.out.println(); 			//neue Astzeile
		    	baum = "";
		    } 
		    // Baumstamm 
		    for (int i=1; i<hoehe; i++)			//Bis zur Mitte-1 mit Blanks auff�llen 
		    	System.out.print(" "); 
		    System.out.println("I");			//Stamm
		    
		    
		// Schleifen verlassen mit break oder continue!
		
		// break: 	Verl�sst die aktuelle Schleife und f�hrt mit der
		//			ersten Anweisung nach der Schleife fort!
		// continue: Springt ans Ende der aktuellen Schleife und f�hrt 
		//			diese mit der n�chsten Iteration weiter aus!
		// Beide kann man mit einem Label (Sprungmarke) erg�nzen. Somit
		// wird zum Beispiel die M�glichkeit geschaffen, ganz aus 
		// verschachtelten Schleifen auszusteigen. Die beiden Anweisungen
		// break und continue sind in allen Schleifenarten einsetzbar.
		
		// Angenommen: 	Eingabewerte d�rfen nur positive Zahlen
		// 				von 1 bis 9 haben. Bei Falscheingabe soll Eingabe wiederholt 
		//				werden, wenn Eingabe = 0, dann Abbruch!
		int wert;
		exit:
		for (int i = 0;i < 3; i++)
			for (int j = 0; j < 3; j++) {
				System.out.println((i+1) + "," + (j+1) + "=");
				wert = inp.nextInt();
				if ((wert < 1) || (wert > 9))
					if (wert != 0)			// nur falsche Eingabe->Eingabe wiederholen
						j--;
					else					// 0 Engabe, Abbruch der gesamten Eingabe
						break exit;			// ein einfaches Break w�rde nur aus der inneren
											// FOR Schleife aussteigen!
			}
		
	}
}

=======
package schleifen;
import java.util.Scanner;

public class For_Schleife {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// FOR Schleifen eignen sich immer dann,
		// wenn die Anzahl der Wiederholungen 
		// von Anfang an feststeht.
		// Wenn in der Schleife mehr als eine Anweisung erfolgt, muss
		// das {} gesetzt werden!
		
		//Einfache Ausgabe der Zahlen 1-10 und deren Quadrate
		for (int i = 1;i <= 10; i++)
			System.out.println("Zahl " + i + " deren Quadrat: " + i*i);
		
		//oder absteigend gez�hlt in 2'er Schritten
		for (int i = 10;i > 0; i=i-2)
			System.out.println("Zahl " + i + " deren Quadrat: " + i*i);
		
		// verschachtelte FOR Schleifen
		
		// Beispiel f�r Eingabe einer 2 * 3 Matrix
		int eingabe;
		Scanner in = new Scanner(System.in);
		for (int zeile = 1; zeile <=2; zeile++)
			for (int spalte = 1; spalte <= 3; spalte++){
				System.out.println("Eingabe von (" + zeile + "," + spalte + ")");
				eingabe = in.nextInt() ;
			}
				
		// Beispiel zur Jahreszeit passend
		// die Darstellung eines Weihnachtsbaumes mit aussen brennenden Kerzen
		
		System.out.println("Bitte eine Baumh�he eingeben.");
		Scanner inp = new Scanner(System.in);
		int hoehe = inp.nextInt();
			String baum = ""; 
		   //"Krone" des Baumes zeichnen 
		    for (int i=1; i<=hoehe; i++) {		//Schleife �ber Baumh�he 
		    	for (int j=1; j<=hoehe-i; j++) 	//Schleife �ber Astbreite mit " "
		    		System.out.print(" "); 
		    	for (int j=1; j<=(2*i-1); j++)	//Schleife �ber Astbreite mit "*" 
		    		baum = baum + "*";
		    	if (i > 1) 						//Ab dem 2. Ast immer ganz aussen 1 Kerze darstellen
		    		baum= ("i" + baum.substring(1,baum.length()-1) + "i");
		    	System.out.print(baum);
		    	System.out.println(); 			//neue Astzeile
		    	baum = "";
		    } 
		    // Baumstamm 
		    for (int i=1; i<hoehe; i++)			//Bis zur Mitte-1 mit Blanks auff�llen 
		    	System.out.print(" "); 
		    System.out.println("I");			//Stamm
		    
		    
		// Schleifen verlassen mit break oder continue!
		
		// break: 	Verl�sst die aktuelle Schleife und f�hrt mit der
		//			ersten Anweisung nach der Schleife fort!
		// continue: Springt ans Ende der aktuellen Schleife und f�hrt 
		//			diese mit der n�chsten Iteration weiter aus!
		// Beide kann man mit einem Label (Sprungmarke) erg�nzen. Somit
		// wird zum Beispiel die M�glichkeit geschaffen, ganz aus 
		// verschachtelten Schleifen auszusteigen. Die beiden Anweisungen
		// break und continue sind in allen Schleifenarten einsetzbar.
		
		// Angenommen: 	Eingabewerte d�rfen nur positive Zahlen
		// 				von 1 bis 9 haben. Bei Falscheingabe soll Eingabe wiederholt 
		//				werden, wenn Eingabe = 0, dann Abbruch!
		int wert;
		exit:
		for (int i = 0;i < 3; i++)
			for (int j = 0; j < 3; j++) {
				System.out.println((i+1) + "," + (j+1) + "=");
				wert = inp.nextInt();
				if ((wert < 1) || (wert > 9))
					if (wert != 0)			// nur falsche Eingabe->Eingabe wiederholen
						j--;
					else					// 0 Engabe, Abbruch der gesamten Eingabe
						break exit;			// ein einfaches Break w�rde nur aus der inneren
											// FOR Schleife aussteigen!
			}
		
	}
}

>>>>>>> master

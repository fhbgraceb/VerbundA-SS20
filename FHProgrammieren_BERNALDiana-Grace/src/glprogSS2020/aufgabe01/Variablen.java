package aufgabe01;

public class Variablen {

	public static void main(String[] args) {
		
		
//		�berlege dir, was f�r eine Ausgabe der folgende Code erzeugen w�rde.
//		Compiliere den Code, f�hre ihn aus und vergleiche das Resultat mit deinen Erwartungen.
//		Was sind die Unterschiede?

				System.out.println(0);
				
				int zero = 0; // Variable "zero" deklariert(erstellt) und abschließend mit 0 initialisiert(Wertzuweisung)
				
				System.out.println(zero); // Die Zahl 0 wird hier ausgegeben.
				
				int one = 1; // s.o. @zero
				
				int whatsThis = zero; // Variable "whatsThis" wird der Wert von der Variable "zero" zugewiesen. Also die Zahl 0
				
				System.out.println(whatsThis); // Die Zahl 0 wird ausgegeben
				
				whatsThis = one; // Variable "whatsThis" wird der Wert von der Variable "one" zugewiesen. 
				
				System.out.println(whatsThis); // Die Zahl 1 wird ausgegeben
			
		}
	}


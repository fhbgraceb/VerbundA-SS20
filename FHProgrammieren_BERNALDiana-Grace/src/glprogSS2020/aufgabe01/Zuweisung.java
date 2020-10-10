package aufgabe01;

public class Zuweisung {

	public static void main(String[] args) {
		
		
//		Überlege dir, was für eine Ausgabe der folgende Code erzeugen würde.
//		Compiliere den Code, führe ihn aus und vergleiche das Resultat mit deinen Erwartungen.
//		Was sind die Unterschiede?

				System.out.println(0); //Ausgabe#1 "0"
				
				int zero = 0; //Init. und Zuweisung zero "0"
				
				System.out.println(zero); //Ausgabe#2 Wert von zero, also "0"
				
				int one = 1; //Init. und Zuweisung one "1"
				
				int whatsThis = zero; //Init. und Zuweisung whatsThis "0"
				
				System.out.println(whatsThis); //Ausgabe#3 "0"
				
				whatsThis = one; //Zuweisung whatsThis "1"
				
				System.out.println(whatsThis); //Ausgabe#4 "1"
			
		}
	}


package hausuebung1;

public class Zuweisung {

	public static void main(String[] args) {
		
		
//		�berlege dir, was f�r eine Ausgabe der folgende Code erzeugen w�rde.
//		Compiliere den Code, f�hre ihn aus und vergleiche das Resultat mit deinen Erwartungen.
//		Was sind die Unterschiede?

				System.out.println(0);
				//Ausgabe: 0
				
				int zero = 0;
				//variable zero hat jetzt ein integer Wert 0
				
				System.out.println(zero);
				//Ausgabe: 0
				
				int one = 1;
				//variable one hat jetzt ein integer Wert 0
				
				int whatsThis = zero;
				//variable whatsThis hat jetzt denselben Wert wie die variable zero, also 0
				
				System.out.println(whatsThis);
				//Ausgabe: 0
				
				whatsThis = one;
				//variable whatsThis hat jetzt denselben Wert wie die variable one, also 1
				
				System.out.println(whatsThis);
				//Ausgabe: 1
			
		}
	}


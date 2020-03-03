package hausuebung2.aSchleifen;

import java.util.Scanner;

public class b_Fakultaetheavy {
	/*
	 Aufgabe:
	 2.Fakult�t heavy: als Methode werden die Grenzen zur Berechnung dem Unterprogramm �bergeben, 
	 z.B: fac(12,16), erg = 12*13*14*15*16. 
	 Anschlie�end retourniert und abschlie�end wird das Ergebnis ausgegeben, SOUT� das Ergebnis �..
	Zudem soll vor der Berechnung, in der Methode gepr�ft werden, 
	ob das Ergebnis den Datentyp int nicht �sprengt�, erlaubt sind 0-9(einstelliger Bereich), 
	wenn ein zweistelliger Bereich �bergeben wird, oder ein Mischbereich zw. ein- und zweistellig,
	darf der Abstand zwischen den beiden Zahlen nicht mehr als 8 Betragen. Sollte dies doch der Fall sein, 
	wird als Return der Wert 0 an den Aufrufer �bergeben, und entsprechend kommuniziert.
	 */
	public static void main(String[] args) {
		Scanner numberin = new Scanner(System.in);
		int number1;
		int number2;
			
		System.out.print("Bitte 1.Zahl eingeben: ");
		number1 = numberin.nextInt();
		System.out.print("Bitte 2.Zahl eingeben: ");
		number2 = numberin.nextInt();
		int differenz = Math.abs(number2 - number1);
					
		if ((number1 > 9 || number2 > 9) && differenz <= 8) {
			System.out.println("Ergbenis von " + number1 + "! ist " + fakultaet(number1, number2));
		}
		
		numberin.close();	
	}

	public static int fakultaet(int n1, int n2){
		int ergebnis = 1;
			
		for (; n1 <= n2; n1++){
				ergebnis *= n1;
		}
			
		return ergebnis;
	}


}

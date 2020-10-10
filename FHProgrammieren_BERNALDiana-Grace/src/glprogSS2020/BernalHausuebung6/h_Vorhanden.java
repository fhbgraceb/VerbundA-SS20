package BernalHausuebung6;

import java.util.Scanner;

public class h_Vorhanden {
	
	/* Lesen Sie 10 Zahlen in ein Array ein. 
	 * Lesen Sie dann eine weitere Zahl ein und stellen Sie fest, ob die neue Zahl im Array vorkommt.
	*/

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		final int anzahlZahlen = 10;	
		int[] zahlen = new int[anzahlZahlen];
		int zahl;
		boolean vorkommt;
		
		for (int i = 0; i < anzahlZahlen; i++){
			System.out.print("Bitte geben Sie die " + (i + 1) + ". Zahl von " + anzahlZahlen + " ein: ");
			zahlen[i] = s.nextInt();
		}
		
		System.out.print("Bitte geben Sie eine weitere Zahl ein: ");
		zahl = s.nextInt();
		
		vorkommt = false;
		for (int i = 0; i < anzahlZahlen; i++){
			if (zahlen[i] == zahl){
				vorkommt = true;
			}
		}
		
		if (vorkommt){
			System.out.println(zahl + " kommt im Array vor.");
		}
		else{
			System.out.println(zahl + " kommt nicht im Array vor.");
		}
		
		s.close();
	}

}

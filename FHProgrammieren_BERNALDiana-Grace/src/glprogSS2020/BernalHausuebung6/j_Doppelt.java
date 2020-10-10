package BernalHausuebung6;

import java.util.Scanner;

public class j_Doppelt {
	
	/* Lesen Sie 10 Zahlen in ein Array ein und stellen Sie fest ob eine Zahl doppelt im Array vorkommt.*/

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		final int anzahlZahlen = 10;
		int[] zahlen = new int[anzahlZahlen];
		boolean doppelt;
		
		for (int i = 0; i < anzahlZahlen; i++){
			System.out.print("Bitte geben Sie die " + (i + 1) + ". Zahl von " + anzahlZahlen + " ein: ");
			zahlen[i] = s.nextInt();
		}
		
		doppelt = false;
		for (int i = 0; i < anzahlZahlen; i++){
			for (int j = i+ 1; j < anzahlZahlen; j++){
				if (zahlen[i] == zahlen[j])
				{
					doppelt = true;
				}
			}
		}
		
		if (doppelt){
			System.out.println("Es kommen Zahlen doppelt im Array vor.");
		}
		else{
			System.out.println("Es kommen keine Zahlen doppelt im Array vor.");
		}
		
		s.close();
	}

}

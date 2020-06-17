package BernalHausuebung2.aSchleifen;

import java.util.Scanner;

public class e_Primzahl {
	/*
	Aufgabe:
	5.Primzahl: Bestimmen Sie, 
	ob eine eingegebene natürliche Zahl eine Primzahl ist.
	*/
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int zahl;
		boolean istPrimzahl;
		
		System.out.print("Zahl eingeben: ");
		zahl = s.nextInt();
		istPrimzahl = true;
		
		if (zahl > 1){
			for (int n = 2;  n < zahl; n++){
				if (zahl % n == 0){
					istPrimzahl = false;
				}	
			}
			
			if (istPrimzahl){
				System.out.println(zahl + " ist eine Primzahl");
			}else{
				System.out.println(zahl + " ist keine Primzahl");
			}
		}else{
			System.out.println("Zahl muss > 1 sein!");
		}
		
		s.close();
	}
}

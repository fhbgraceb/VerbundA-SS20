package zweiteHausuebung.aSchleifen;

import java.util.Scanner;

public class k_ZweierPotenz {
	/*
	Aufgabe:
	11.Zweierpotenz: Schreiben Sie ein Programm, 
	das eine natürliche Zahl einliest und die größte Zweierpotenz ausgibt, 
	die die eingelesene Zahl teilt.
	Eingabe Ausgabe
	17		1
	48		16
	1024	1024
	*/
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		int teiler;

		System.out.print("Bitte Zahl eingeben: ");
		num = s.nextInt();
		
		teiler = berechnungZweier(num);
		
		System.out.println("Die größte Zweierpotenz von " + num + " ist: " + teiler);
		
		s.close();
	}
	
	public static int berechnungZweier (int num){
		int teilt;
		
		teilt = 1;
		while (num % teilt == 0){
			teilt *= 2;
		}
		teilt /= 2;
		
		return teilt;
	}

}

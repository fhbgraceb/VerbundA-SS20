package BernalHausuebung2.aSchleifen;

import java.util.Scanner;

public class c_Ziffernsumme {
	/*
	Aufgabe:
	3. Ziffernsumme: Schreiben Sie ein Programm, 
	das eine ganze Zahl einliest und mit Hilfe der Ziffernsumme überprüft, 
	ob die eingegebene Zahl durch 3 teilbar ist.
	*/
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int number;
		int reste;
		int ziffer;
		int ziffernsumme;
		
		System.out.print("Bitte eine Zahl eingeben: ");
		number = s.nextInt();
		reste = Math.abs(number);
		ziffernsumme = 0;
		while (reste > 0){
			ziffer = reste % 10;		
			ziffernsumme += ziffer;	
			reste = (reste - ziffer) / 10;	
		}
		
		if (ziffernsumme % 3 == 0){
			System.out.println(number + " durch 3 teilbar.");
		}else{
			System.out.println(number + " NICHT durch 3 teilbar.");
		}
		s.close();
	}

}

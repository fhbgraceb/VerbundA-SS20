package BernalHausuebung5;

import java.util.Scanner;

public class e_Schottersaecke {
	/*
	 5. Schottersäcke: Sie sitzen an der LKW-Waage an der Ausfahrt eines
	Schotterwerkes. In diesem wird Schotter in 50 kg Säcke verpackt und mit LKWs
	abtransportiert. Geben Sie das Leergewicht des LKWs und das Gewicht des
	beladenen LKWs ein und berechnen Sie daraus wie viele Säcke er geladen hat.
	Gehen Sie dabei davon aus, dass die Säcke immer voll beladen worden sind. [4] 
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double empty;		
		double voll;
		int saecke;

		System.out.print("LKW Gewicht leer?");
		empty = s.nextDouble();
		System.out.print("LKW Gewich beladen?");
		voll = s.nextDouble();
		
		saecke = berechnungSaecke(empty, voll);

		System.out.println("LKW tranportiert " + saecke + " Säcke.");

		s.close();
	}
	
	public static int berechnungSaecke(double z0, double z1){
		final double max = 50.0;	
		int ergebnis = 0;
		ergebnis = (int)Math.round(((z1 - z0) / max));
		return ergebnis;
	}

}

package BernalHausuebung2.bIFUnterprogramm;

import java.util.Scanner;

public class a_Notenberechnung {
	/*
	 Aufgabe:
	 1.Notenberechngung:Prüfungspunkte und Mitarbeitspunkte werden gemeinsam in einer Methode übergeben, 
	 z.B.: noteermitteln(40,23); die Prüfung muss jedoch positiv sein d.h. größer 35 Punkte, 
	 51 Punkte im Summe genügen nicht z.B.: Prüfung 30, Mitarbeitspunkte 30 ergeben aufgrund des K.O. 
	 -Kriteriums dennoch ein nicht genügend. Zurück gegeben wir die Note. 
	 Geben Sie zumindest 3 Testfälle aus, 
	 d.h. 3 Methodenaufrufe mit unterschiedlichen Anwendungs-/Verzweigungsfall. Notenschlüssel der FH entsprechend.
	 
	 FH notenschluessel:
	 sehrgut:100-89
	 gut:88-76
	 befriedigend:75-63
	 genügend:62-51
	 nicht genügend:50-0
	 */
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("Prüfungspunkte bitte eingeben: ");
		int pruefungsp=s.nextInt();
		System.out.println("Mitarbeitspunkte bitte eingeben: ");
		int mitarbeitsp=s.nextInt();
		
		int note=0;
		
		if (pruefungsp > 35) {
			
			note=noteErmittlung(pruefungsp, mitarbeitsp);
			switch (note) {
			case 1: System.out.println("Sehr Gut"); break;
			case 2: System.out.println("Gut"); break;
			case 3: System.out.println("Befriedigend"); break;
			case 4: System.out.println("Genügend"); break;
			case 5: System.out.println("Nicht Genügend"); break;
			
			default: System.out.println("nicht Beurteilt"); break;
			}
		}else{
			System.out.println("Nicht Genügend - Prüfung war negativ!");
		}
		
	s.close();
	}
	
	public static int noteErmittlung(int c,int v) {
		int gesamtsumme = c + v;
		int mark=0;
		if (gesamtsumme > 88) {
			mark=1;
		} else if (gesamtsumme > 75) {
			mark=2;
		} else if (gesamtsumme > 62) {
			mark=3;
		} else if (gesamtsumme > 50) {
			mark=4;
		} else {
			mark=5;
		}

		return mark;
	}

}

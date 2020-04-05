package BernalHausuebung5;

import java.util.Scanner;

public class h_Sekunden2 {
	
	/*
	 8. Sekunden2: Gehen Sie davon aus, dass ein Jahr aus 12 Monaten à 30 Tagen
	besteht: Schreiben Sie ein Programm zur Umrechnung von Jahren, Monaten,
	Tagen, Stunden, Minuten und Sekunden in die entsprechende Anzahl von
	Sekunden. [6] 
	 */
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		long alleSekunden;

		int sekunden;
		int minuten;
		int stunden;
		int monate;
		int tage;
		int jahre;
		
		System.out.println("Bitte die Zeit eingeben, die umgerechnet werden soll!");
		System.out.print("Jahre: ");
		jahre = s.nextInt();
		System.out.print("Monate: ");
		monate = s.nextInt();
		System.out.print("Tage: ");
		tage = s.nextInt();
		System.out.print("Stunden: ");
		stunden = s.nextInt();
		System.out.print("Minuten: ");
		minuten = s.nextInt();
		System.out.print("Sekunden: ");
		sekunden = s.nextInt();

		alleSekunden = zeitInSek(jahre, monate, tage, stunden, minuten, sekunden);
			
		System.out.printf("%5d Jahr(e) \n", jahre);
		System.out.printf("%5d Monat(e) \n", monate);
		System.out.printf("%5d Tag(e) \n", tage);
		System.out.printf("%5d Stunde(n) \n", stunden);
		System.out.printf("%5d Minute(n) \n", minuten);
		System.out.printf("%5d Sekunde(n) \n", sekunden);
		System.out.println("sind: ");
		System.out.println(alleSekunden + " Sekunden.");
		
		s.close();
	}
	
	public static long zeitInSek(int jahre, int mon, int tag, int stund, int min, int sek) {
		final int sekProMin = 60;
		final int minProStun = 60;
		final int stunProTag = 24;
		final int tageProMon = 30;
		final int monProJahr = 12;

		long alleMon = 0;
		long alleTag = 0;
		long alleStund = 0;
		long alleMin = 0;
		long alleSek = 0;

		alleMon = jahre * monProJahr + mon;
		alleTag = alleMon * tageProMon + tag;
		alleStund = alleTag * stunProTag + stund;
		alleMin = alleStund * minProStun + min;
		alleSek = alleMin * sekProMin + sek;
			
		return alleSek;
	}

}

package BernalHausuebung2.aSchleifen;

import java.util.Arrays;
import java.util.Scanner;

public class j_Aufsteigend {
	/*
	Aufgabe:
	10.Aufsteigend: Lesen Sie beliebig 5 Zahlen ein. Geben Sie an, 
	ob die Zahlen aufsteigend sortiert sind.
	Beispiele:
	1, 3, 6, 8, 13, 0 � aufsteigend sortiert
	2, 5, 7, 5, 8, 9, 0 � nicht aufsteigend sortiert (5 kommt nach 7, ist aber kleiner als 7)
	*/
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int zahl;
		boolean aufsteigend;
		aufsteigend = true;
	
		int[] zahlenArray;
		zahlenArray = new int[5];
		
		System.out.print("Dieses Programm �berpr�ft ob 5 Zahlen, die Sie eingeben, aufsteigend sortiert sind... \n");
		
		for (int i = 0; i < zahlenArray.length; i++) {
			System.out.print("Bitte " + (i+1) + ".Zahl eingeben: ");
			zahl=s.nextInt();
			zahlenArray[i]=zahl;
		}
		
		for (int k = 0; k < zahlenArray.length-1; k++) {
			if (! (zahlenArray[k] < zahlenArray[k+1])) {
				aufsteigend=false;
			}
		}
		
		
		if (aufsteigend){
			System.out.println("Zahlen sind aufsteigend sortiert");
		}
		else{
			System.out.println("Zahlen sind NICHT aufsteigend sortiert.");
		}
		
		
		//methode die schon existiert zum sorten
		System.out.println(Arrays.toString(zahlenArray));
		Arrays.sort(zahlenArray);
		System.out.println(Arrays.toString(zahlenArray));
		s.close();
	}

}

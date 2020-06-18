package BernalHausuebung3;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class fGleichverteilung {
	/*
	 Aufgabe 6) Gleichverteilung
	Es wird 123456 mit einem klassischem Würfel(1,6) gewürfelt, danach wird ausgegeben, 
	welche Nummer/Auge(n) wie oft gewürfelt wurde zB.: ein Einser wurde 4646 gewürfelt, 
	diese entspricht 3,76% der Gesamtwürfe, ein Zweier kam vor mit einer Anzahl von, 
	dies entsprach einer % … usw.
	 */

//	public static void main(String[] args) {
//		
//		for (int i = 1; i <= 6; i++) {
//			
//			int wuerfel;
//			int zaehler;
//			do {
//				wuerfel = Random(1, 6);
//				zaehler = 0;
//				zaehler = zaehler + 1;
//			} while (wuerfel==i);
//				System.out.println("Es wurde " + zaehler + " mal die Zahl " + i + " gewürfelt\n");	
//		}
//	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie die Anzahl der Durchläufe ein: ");
		int eingabe = scan.nextInt();
		double augen1 = 0;
		double augen2 = 0;
		double augen3 = 0;
		double augen4 = 0;
		double augen5 = 0;
		double augen6 = 0;
		
		double gesamtwurf1 = 0;
		double gesamtwurf2 = 0;
		double gesamtwurf3 = 0;
		double gesamtwurf4 = 0;
		double gesamtwurf5 = 0;
		double gesamtwurf6 = 0;
		
		int gewuerfelt = 0;
		int i = 1;
		
		while (i<=eingabe) 
		{
			i++;
			gewuerfelt = Random(1,6);

			if (gewuerfelt == 1)
			{
				augen1 = augen1 + 1;
				gesamtwurf1 = (augen1 / eingabe)*100;	
			}
			if (gewuerfelt == 2)
			{
				augen2 = augen2 + 1;
				gesamtwurf2 =  (augen2 / eingabe)*100;
			}
			if(gewuerfelt == 3)
			{
				augen3 = augen3 + 1;
				gesamtwurf3 =  (augen3 / eingabe)*100;
			}
			if (gewuerfelt == 4)
			{
				augen4 = augen4 + 1;
				 gesamtwurf4 =  (augen4 / eingabe)*100;	
			}
			if (gewuerfelt == 5)
			{
				augen5 = augen5 + 1;
				gesamtwurf5 =  (augen5 / eingabe)*100;
			}
			if (gewuerfelt == 6)
			{
				augen6 = augen6 + 1;
				gesamtwurf6 =  (augen6 / eingabe)*100;
			}			
		}
		System.out.println("\n"+"Zahl 1 wurde so oft gewürfelt: "+(int)augen1+", entspricht " +gesamtwurf1+" % des Gesammtwurfs.\n"+"Zahl 2 wurde so oft gewürfelt: "+(int)augen2+", entspricht " +gesamtwurf2+" % des Gesammtwurfs.\n"+"Zahl 3 wurde so oft gewürfelt: "+(int)augen3+", entspricht " +gesamtwurf3+" % des Gesammtwurfs.\n"+"Zahl 4 wurde so oft gewürfelt: "+(int)augen4+", entspricht " +gesamtwurf4+" % des Gesammtwurfs.\n"+"Zahl 5 wurde so oft gewürfelt: "+(int)augen5+", entspricht " +gesamtwurf5+" % des Gesammtwurfs.\n"+"Zahl 6 wurde so oft gewürfelt: "+(int)augen6+", entspricht " +gesamtwurf6+" % des Gesammtwurfs.");
		scan.close();
	}

	private static int Random(int untere, int obere) {
		int range = (obere - untere) + 1;     
	    return (int)(Math.random() * range) + untere;
	}
}

package BernalHausuebung5;

import java.util.Scanner;

public class d_Gauss {
	
	/*
	 4. Gauss: Berechnen Sie die Summe der Zahlen von 1 bis n mittels der
	Gaussíschen Summenformel. [4] 
	 */

	public static void main(String args[]) {
    	Scanner s = new Scanner(System.in);

    	int n;
    	int summe;
    	
    	System.out.print("n eingeben: ");
    	n = s.nextInt();

    	summe = gauss(n);
    	System.out.println("Summe von 1 bis " + n + " = " + summe);
    	
    	s.close();
    }

	public static int gauss(int n){
			int ergebnis = 0;			
			ergebnis = n * (n + 1) / 2;
			return ergebnis;
	}
		

}

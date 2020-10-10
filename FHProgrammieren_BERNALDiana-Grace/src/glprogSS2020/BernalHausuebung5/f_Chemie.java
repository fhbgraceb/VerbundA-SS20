package BernalHausuebung5;

import java.util.Scanner;

public class f_Chemie {
	
	/*
	 6. Chemie: x Gramm Wasserstoff sollen verbrannt werden. Lesen Sie x ein und
	berechnen Sie, wie viele Gramm Sauerstoff für die Reaktion erforderlich sind und
	wie viele Milliliter Wasser entstehen. [4]
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
    	
        double grammWasserstoff;
        double grammSauerstoff;

        System.out.println("Wie viel Gramm Wasserstoff?");
        grammWasserstoff = s.nextDouble();

        grammSauerstoff = knallGas(grammWasserstoff);
	
        System.out.printf("%10.3f Gramm Wasserstoff ergeben \n%10.3f Milliliter Wasser.\n", grammWasserstoff, grammSauerstoff);
        
        s.close();

	}
	
	public static double knallGas(double xWasser)
	{
        final double h = 1.00794;
        final double o = 15.9994;
        final double rhoH2O = 1.0; 
        double xO;
        double xH2O;
        double mlH2O;

        xO = xWasser/h/2*o;
        xH2O = xWasser + xO;
        System.out.printf("Gerade wurden %.3f Gramm Sauerstoff verbraucht.\n\n", xO);
        mlH2O = xH2O / rhoH2O;
		
        return mlH2O;
	}

}

package aufgabe03_Prog2018;

/*
 * Beispielgruppe 2 - Unterprogramme
 *
 * Chemie:
 * x Gramm Wasserstoff sollen verbrannt werden. 
 * Lesen Sie x ein und berechnen Sie, wie Gramm Sauerstoff 
 * für die Reaktion erforderlich sind
 * und wie viele Milliliter Wasser entstehen.
 * 
 * Anmerkungen:
 *    2 Wasserstoffatome (H) verbinden sich mit
 *    1 Sauerstoffatom (O) zu
 *    1 Molekül Wasser (H2O)
 *
 *    1 Wasserstoff-Atom "wiegt" mH = 1.00794
 *    1 Sauerstoff-Atom "Wiegt"  mO = 15.9994
 *
 *    xH (Gramm) Wasserstoff enthalten xH/mH Atome Wasserstoff
 *    diese koennen die halbe Anzahl (xH/mH/2) Sauerstoff-Atome binden (2 H pro 1 O)
 *    welche xH/mH/2 * mO wiegen
 *
 */

import java.util.Scanner;

public class Chemie 
{

	public static double knallGas(double xH)
	{
        final double mH = 1.00794;
        final double mO = 15.9994;
        final double rhoH2O = 1.0;    // Dichte von Wasser: bei 0°C 0,9168; 1°C 0,9999;
                                      // 4°C 1,0000; 10°C 0,997; 15°C 0,9991;
                                      // 20°C 0,9982; 25°C 0,9971; 100°C 0,9584
        double xO;
        double xH2O;
        double mlH2O;

        xO = xH/mH/2*mO;
        xH2O = xH + xO;
        System.out.printf("Gerade wurden %.3f Gramm Sauerstoff verbraucht.\n\n", xO);
        mlH2O = xH2O / rhoH2O;
		
        return mlH2O;
	}
	
    public static void main(String args[]) 
    {
    	Scanner s = new Scanner(System.in);
    	
        double xH;
        double mlH2O;

        System.out.println("Wie viel Gramm Wasserstoff sollen verbrannt werden?");
        xH = s.nextDouble();

        mlH2O = knallGas(xH);
	
        System.out.printf("%10.3f Gramm Wasserstoff ergeben \n%10.3f Milliliter Wasser (bei 4°C).\n", xH, mlH2O);
        
        s.close();
    }
}


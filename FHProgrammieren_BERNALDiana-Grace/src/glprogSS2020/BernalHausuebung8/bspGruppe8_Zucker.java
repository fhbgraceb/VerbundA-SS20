package BernalHausuebung8;

import java.util.Scanner;

/*
 *Erstellen Sie ein Programm „Zucker“, welches einer Zuckerfabrik ermöglicht den Kunden Zucker in (fast) 
 *jeder beliebigen Menge zu liefern. Die folgende Tabelle zeigt in welchen Mengen Zucker verkauft wird 
 *(1 dkg = 0,01 kg).
Säcke

Lassen Sie den Benutzer eine beliebige Menge eingeben und geben Sie in der Console die für den 
Kunden zusammengestellte Lieferung aus, wobei immer möglichst große Verpackungen genommen werden sollen.
Beispiel: Eingabe:
Gewählte Menge: 247,74
Ausgabe:
100,0 kg Säcke: 2
20,0 kg Säcke: 2
 * */

public class bspGruppe8_Zucker {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double[] mengen = new double[]{100, 20, 5, 1, 0.5, 0.1, 0.01};
		double menge, restmenge;
		int anzahl;
		
		System.out.print("Bitte Menge eingeben: ");
		menge = s.nextDouble();
		
		restmenge = menge;
		for (int i = 0; i < mengen.length; i++)
		{
			anzahl = (int)(restmenge / mengen[i]);
			System.out.printf("%6.1f kg %-11s %3d\n", mengen[i], (mengen[i] >= 1 ? "Säcke:" : "Schachteln:"), anzahl);
			restmenge -= anzahl * mengen[i];
		}

		s.close();
	}

}

package BernalHausuebung1;
import java.util.ArrayList;
import java.util.Scanner;

public class Einkaufen {
	
	// dieses BSP ist lediglich nice-to-have
	
			// Sie gehen Einkaufen, und werden an der Kassa gefragt, wieviel St�ck Sie von einem Produkt gekauft haben
			// und den jeweiligen Preis des Artikels, nachdem alle Artikel eintragen wurden(die Anzahl ist beliebig, 2 gen�gen)
			// Werden Sie abschlie�end �ber den Zahlbetrag informiert und "�bergeben" das Geld, darauf wird Ihnen das 
			// Retourgeld angezeigt.
			// Eine L�sung k�nnte so aussehen
					
			//Wurst      1 x  4.20 EUR
			//	        4.20 EUR
			//K�se       1 x  2.30 EUR
			//	        2.30 EUR
			//Brot       1 x  2.10 EUR
			//	        2.10 EUR
			//DVD        2 x 12.00 EUR
			//	       24.00 EUR
			//----------------------------------
			//Gesamt                   32.60 EUR
			//Gegeben                  50.00 EUR
			//
			//Zur�ck                   17.40 EUR
	
	//danke f�r das beispiel, hat spa� gemacht mal wieder sowas in der richtung zu machen 

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> einkaufsListe = new ArrayList<>();
		int fertig= 0;

		System.out.println("Geben Sie einen Artikel ein und enter f�r einen weiteren Artikel oder done wenn Sie alle Artikeln eingegeben haben:  ");
		while (fertig!=1) {
			String einkauf = scanner.nextLine();
			if (einkauf.equalsIgnoreCase("done")) {
				fertig=1;
			}
			else {
				einkaufsListe.add(einkauf);
			}
		}
		
		//beliebige groesse von liste als variabel speichern
		int groesse = einkaufsListe.size();
		
		//anfang menge erfragen
		int[] menge = new int[groesse];
		for (int k = 0;k<groesse;k++){
			System.out.println("Menge von " + einkaufsListe.get(k) + "?");
			menge [k] = scanner.nextInt();
		}
		
		//anfang preis erfragen
		double[] preis =new double[groesse];
		for (int l = 0;l<groesse;l++){
			System.out.println("Preis von " + einkaufsListe.get(l) + "?");
			preis [l] = scanner.nextDouble();
		}
		
		//anfang zwischen variablen speichern
		double[] preismengen =new double[groesse];
		double summe = 0;
		for (int j = 0;j<groesse;j++){
			preismengen [j] = menge[j]*preis[j];
			summe = summe + preismengen[j];
		}
		
		//gegeben erfragen
		double geld = 0;
		do {
			System.out.println("Wieviel haben Sie gegeben? Betrag muss gr��er als die Summe sein!");
			geld = scanner.nextDouble();
		} while ( geld <= summe);
		
		//END Ausgaben
		System.out.println("\n");
		for (int i = 0;i<groesse;i++){
		    System.out.println(einkaufsListe.get(i) + "      " + menge[i] + " x   " + preis[i] + " EUR");
		    System.out.println("               " + preismengen[i] + " EUR");
		}
		
		System.out.println("---------------------------------- \n" + "Gesamt           " + summe  + "EUR" + "\nGegeben         " + geld  + "EUR" + "\nZur�ck           " + (geld-summe)  + "EUR");
		
		scanner.close();
	}

}

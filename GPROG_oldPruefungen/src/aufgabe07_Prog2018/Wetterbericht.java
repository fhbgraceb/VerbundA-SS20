package aufgabe07_Prog2018;

/*
 * Erstellen Sie ein Array in dem die Tagesh�chsttemperaturen f�r ein Jahr 
 * gespeichert werden k�nnen. (Ignorieren Sie dabei, dass es Schaltjahre gibt). 
 * 
 * F�llen Sie das Array mit ganzzahligen Zufallszahlen von -15 bis +35.
 * 
 * Beantworten Sie dann die folgenden Fragen:
 * 
 * * In welchen Monaten war es immer k�lter als 33 Grad?
 *   Geben Sie die entsprechenden Monatsnamen aus.
 * * War es an mindestens 5 aufeinander folgenden Tagen immer w�rmer als 10 Grad?
 *   Geben Sie jeweils Dauer und den ersten und den letzten Tag dieser Perioden aus.
 * * Gibt es aufeinander folgende Tage mit einer Temperaturdifferenz von mehr als 40 Grad? 
 *   Geben Sie jeweils die beiden Tage aus.
 * * Wie lange dauerte die l�ngste Periode mit steigenden Temperaturen
 *   (d.h. es war an jedem Tag w�rmer als am Tag davor)?
 *   Geben Sie die L�ge dieser Periode aus. 
 */

public class Wetterbericht 
{

	public static void main(String[] args) 
	{
		final int minTemp = -15;
		final int maxTemp = 35;
		final int tempSchrankeKaelter = 33;
		final int tempSchrankeWaermer = 10;
		final int minAnzahlWaermer = 5;
		final int tempDiff = 40;
		String[] monate = new String[]{"J�nner", "Februar", "M�rz", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
		int tageImMonat[] = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		// Zun�chst einmal Platz f�r die Monate schaffen.
		int[][] tagesHoechstTemps = new int[monate.length][];
		boolean immerKaelter;
		int anzahlWaermer;
		int ersterTag;
		int erstesMonat;
		int tempGestern;
		int tagGestern;
		int monatGestern;
		int tempHeute;
		int maxTageSteigend;
		int aktTageSteigend;
		
		// Dann f�r die entsprechende Anzahl an Tagen im Monat Platz schaffen
		for (int i = 0; i < tageImMonat.length; i++)
		{
			tagesHoechstTemps[i] = new int[tageImMonat[i]];
		}
		
		// Nun das Array mit Zufallszahlen bef�llen
		for (int monat = 0; monat < tagesHoechstTemps.length; monat++)
		{
			for (int tag = 0; tag < tageImMonat[monat]; tag++)
			{
				tagesHoechstTemps[monat][tag] = (int)(Math.random() * (maxTemp - minTemp + 1) + minTemp);
			}
		}

		// Ausgabe der Tagesh�chsttemperaturen
		System.out.printf("%-12s : ", "Monat");
		for (int i = 1; i <= 31; i++)
		{
			System.out.printf("%2d. ", i);
		}
		System.out.println();
		for (int monat = 0; monat < tagesHoechstTemps.length; monat++)
		{
			System.out.printf("%-12s : ", monate[monat]);
			for (int tag = 0; tag < tageImMonat[monat]; tag++)
			{
				System.out.printf("%3d ", tagesHoechstTemps[monat][tag]);
			}
			System.out.println();
		}
		
		/*
		 *  Nun folgt die Analyse
		 *  Um diese leichter nachvollziehen zu k�nnen wurden die verschiedenen Aufagbe getrennt behandelt.
		 *  Normalerweise k�nnte alles in einem Durchlauf geschehen.
		 *  Nachteil dabei w�re, dass die verschiedenen Ausgaben
		 *    * entweder durcheinander kommen w�rden
		 *    * oder in jeweils einem String "gesammelt" werden m�ssten
		 *  
		 *  F�r die Beantwortung einiger der Fragen wird die Temperatur des Vortages in einer eigenen Variable gespeichert.
		 *  Ebenso den Tag und Monat des Vortages (dies vereinfacht den �bergang von einem Monat auf den n�chsten)
		 */
		
		/*
		 *  In welchen Monaten war es immer k�lter als 33 Grad?
		 *  F�r jedes Monat wird zun�chst angenommen (immerKaelter), dass es immer k�lter als 10 Grad war.
		 *  Wenn man einen Tag findet, an dem es w�rmer war wird die Variable immerKaelter auf false gesetzt.
		 */
		System.out.printf("\nIn den folgenden Monaten war es immer k�lter als %d Grad: \n\n", tempSchrankeKaelter);
		for (int monat = 0; monat < tagesHoechstTemps.length; monat++)
		{
			immerKaelter = true;
			for (int tag = 0; tag < tageImMonat[monat]; tag++)
			{
				if (tagesHoechstTemps[monat][tag] > tempSchrankeKaelter)
				{
					immerKaelter = false;
				}
			}
			if (immerKaelter)
			{
				System.out.println(" * " + monate[monat]);
			}
		}

		/*
		 *  War es an mindestens 5 aufeinander folgenden Tagen immer w�rmer als 10 Grad?
		 *  
		 *  Immer wenn ein Tag w�rmer als 25 Grad war, wird ein Z�hler erh�ht.
		 *  Falls dies der erste Tag war, merkt man sich den Tag.
		 *  War die Temperatur geringer wird nachgesehen ob der Z�hler gr��er als 5 ist
		 *  	falls ja wird die Periode ausgegeben
		 *  	und der Z�hler auf 0 gesetzt.
		 */
		System.out.printf("\nIn den folgenden Perioden war es immer w�rmer als %d Grad: \n\n", tempSchrankeWaermer);
		anzahlWaermer = 0;
		ersterTag = 0;
		erstesMonat = 0;
		tagGestern = 0;
		monatGestern = 0;
		for (int monat = 0; monat < tagesHoechstTemps.length; monat++)
		{
			for (int tag = 0; tag < tageImMonat[monat]; tag++)
			{
				if (tagesHoechstTemps[monat][tag] > tempSchrankeWaermer)
				{
					anzahlWaermer++;
					if (anzahlWaermer == 1)
					{
						ersterTag = tag;
						erstesMonat = monat;
					}
				}
				else
				{
					if (anzahlWaermer >= minAnzahlWaermer)
					{
						System.out.printf(" * W�rmeperiode vom %2d. %-10s bis zum %2d. %-10s (%d Tage)\n", 
								ersterTag + 1, monate[erstesMonat], tagGestern + 1, monate[monatGestern], anzahlWaermer);
					}
					anzahlWaermer = 0;
				}
				tagGestern = tag;
				monatGestern = monat;
			}
		}

		/*
		 * Gibt es aufeinander folgende Tage mit einer Temperaturdifferenz von mehr als 40 Grad?
		 * Immer mit der Temperatur des Vortages vergleichen.
		 * 
		 * Dabei wird der 1.1. mit sich selbst verglichen.
		 * 		Die Differenz ist allerdings 0, es spielt also keine Rolle.
		 * 		Alternativ k�nnte man ein if einbauen (! (tag == 0) && (monat == 0)))
		 * 		um so erst ab dem 2.1. zu vergleichen. 
		 */
		System.out.printf("\nTemperaturdifferenzen von mehr als %d Grad gab es zwischen:\n\n", tempDiff);
		tempGestern = tagesHoechstTemps[0][0];
		tagGestern = 0;
		monatGestern = 0;
		for (int monatHeute = 0; monatHeute < tagesHoechstTemps.length; monatHeute++)
		{
			for (int tagHeute = 0; tagHeute < tageImMonat[monatHeute]; tagHeute++)
			{
				tempHeute = tagesHoechstTemps[monatHeute][tagHeute];
				if (Math.abs(tempGestern - tempHeute) > tempDiff)
				{
					System.out.printf("%2d. %-10s und %2d. %-10s (von %3d auf %3d)\n", 
								tagGestern + 1, monate[monatGestern], tagHeute + 1, monate[monatHeute], tempGestern, tempHeute);
				}
				// Den n�chsten Tag vorbereiten
				tempGestern = tempHeute;
				tagGestern = tagHeute;
				monatGestern = monatHeute;
			}
		}

		/*
		 * * Wie lange dauerte die l�ngste Periode mit steigenden Temperaturen
		 *   (d.h. es war an jedem Tag w�rmer als am Tag davor)?
		 *   Geben Sie die L�ge dieser Periode aus. 
		 */
		maxTageSteigend = 0;
		aktTageSteigend = 1;		
		tempGestern = tagesHoechstTemps[0][0];
		for (int monatHeute = 0; monatHeute < tagesHoechstTemps.length; monatHeute++)
		{
			for (int tagHeute = 0; tagHeute < tageImMonat[monatHeute]; tagHeute++)
			{
				tempHeute = tagesHoechstTemps[monatHeute][tagHeute];
				if (tempHeute > tempGestern)
				{
					aktTageSteigend++;
					if (aktTageSteigend > maxTageSteigend)
					{
						maxTageSteigend = aktTageSteigend;
					}
				}
				else
				{
					aktTageSteigend = 1;
				}
				tempGestern = tempHeute;
				tagGestern = tagHeute;
				monatGestern = monatHeute;
			}
		}
		System.out.println();
		System.out.println("Dauer der l�ngsten Periode mit steigenden Temperaturen: " + maxTageSteigend + " Tage.");

	}

}

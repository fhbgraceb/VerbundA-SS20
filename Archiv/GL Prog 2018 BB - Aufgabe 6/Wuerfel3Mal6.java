package aufgabe06;

import java.util.Scanner;

/*
 * Wuerfel3Mal6: 
 * 
 * Bei diesem Spiel w�rfeln mehrere Personen reihum. 
 * Sieger ist die Person, die als erstes zum dritten Mal einen 6er w�rfelt. 
 * Dies muss nicht in aufeinanderfolgenden Runden geschehen. 
 * W�rfeln mehrere Personen in derselben Runde den dritten Sechser, gibt es mehrere SiegerInnen.
 * 
 * Lesen Sie dabei aber Anzahl und die Namen der SpielerInnen ein.
 */
public class Wuerfel3Mal6 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		final int sieger6er = 3;
		int anzahlSpielerInnen;
		String[] namen;
		int[] anzahl6;
		int augenzahl;
		boolean fertig;

		// Einlesen wie viele SpielerInnen - Die Anzahl muss positiv wein
		do
		{
			System.out.print("Wie viele Leute wollen mitspielen? ");
			anzahlSpielerInnen = s.nextInt();
		} while (anzahlSpielerInnen <= 0);
		
		namen = new String[anzahlSpielerInnen];
		// Einlesen der Namen
		for (int i = 0; i < namen.length; i++)
		{
			System.out.print("Bitte den " + (i + 1) + ". Namen eingeben: ");
			namen[i] = s.next();
		}
		// F�r Testzwecke kann man auf das Einlesen verzichten und vorgegebene Namen verwenden.
//		namen = new String[]{"Peter", "Susi", "Max", "Karin"};

		// f�r jeden Spieler einen Z�hler f�r die Sechser
		anzahl6 = new int[namen.length];
		
		fertig = false;
		do
		{
			// Reihum w�rfeln
			for (int i = 0; (i < namen.length) && (! fertig); i++)
			{
				System.out.print("Jetzt w�rfelt: " + namen[i] + " - ");
				augenzahl = wuerfeln();
				System.out.print(augenzahl);
				// Ist es ein 6er?
				if (augenzahl == 6)
				{
					// den 6er mitz�hlen
					anzahl6[i]++;
					System.out.print(" - Das ist der " + anzahl6[i] + ". Sechser!");
					// War es schon der dritte 6er?
					if (anzahl6[i] >= sieger6er)
					{
						System.out.println("\nSieger ist: " + namen[i]);
						fertig = true;
					}
				}
				System.out.println();
			}
		} while (! fertig);		// Solange noch niemand einen Sechser gew�rfelt hat
		
		s.close();
	}

	public static int wuerfeln()
	{
		final int minAugen = 1;
		final int maxAugen = 6;
		
		return (int)(Math.random() * (maxAugen - minAugen + 1) + 1);
	}
}

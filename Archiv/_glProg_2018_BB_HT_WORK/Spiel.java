package _glProg_2018_BB_HT_WORK;

/*
 * Gegenüber der Musterlösung der Algorithmen-Prüfung (2017 HT BB)
 * verschiebt sich alles was mit dem Array zu tun hat um 1,
 * Da die Indizes bei Java-Arrays bei 0 beginnen.
 */
public class Spiel 
{

	public static void main(String[] args) 
	{
		final int anzahlFelder = 20;
		final int besuchsZiel = 30;
		int[] spielfeld = new int[anzahlFelder];
		int runde;
		int wuerfel;
		boolean fertig;
		int position;
		
		for (int i = 0; i < spielfeld.length; i++)
		{
			spielfeld[i] = 0;
		}
		fertig = false;
		runde = 0;
		position = 0;
		spielfeld[position] = 1;
		while (! fertig)
		{
			wuerfel = (int)(Math.random() * (6 - 1 + 1) + 1);
			position += wuerfel;
			if (position >= spielfeld.length)
			{
				runde++;
				position = position % anzahlFelder;
			}
			spielfeld[position]++;
			if (spielfeld[position] >= besuchsZiel)
			{
				fertig = true;
			}
		}
		System.out.println("Der Kegel hat das Spielfeld " + runde + " Mal umrundet.");
	}

}

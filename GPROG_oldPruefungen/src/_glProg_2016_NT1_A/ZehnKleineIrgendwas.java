package _glProg_2016_NT1_A;

public class ZehnKleineIrgendwas 
{

	public static void main(String[] args) 
	{
		final int felder = 10;
		final int anzahlRunden = 1000;
		int[] spielfeld = new int[felder];		// Wird als Zähler benutzt
		int position = 1;
		int wuerfel;
		int minimum = 0;
		int minimumFeld;
		
		for (int runde = 1; runde <= anzahlRunden; runde++) 
		{
			wuerfel = (int)(Math.random() * (6 - 1 + 1) + 1);
			System.out.println("Sie stehen auf Feld " + position + " und würfeln " + wuerfel);
			position += wuerfel;
			if (position > spielfeld.length) 
			{
				position = position % spielfeld.length;
			}
			spielfeld[position - 1]++;
		}
		System.out.println("Sie stehen auf Feld " + position + " und würfeln nicht mehr.\n");		

		minimum = spielfeld[0];
		minimumFeld = 1;
		for (int feld = 1; feld < spielfeld.length; feld++) 
		{
			if (spielfeld[feld] < minimum) 
			{
				minimum = spielfeld[feld];
				minimumFeld = feld + 1;
			}
		}
		System.out.println("Feld " + minimumFeld + " wurde nur " + minimum + " mal besucht");
	}

}

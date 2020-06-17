package _glProg_2016_HT_BB_GrA;

public class Kleidung 
{
	/*
	Franz hat 3 Jacken in den Farben rot, grün und gelb, 5 Hosen in den Farben rot, blau, violett, grün und schwarz und 4 Paar
	Schuhe in den Farben schwarz, weiß, rot und blau.
Wie viele Möglichkeiten gibt es die Kleidungsstücke zu kombinieren, sodass er eine Jacke, eine Hose und ein Paar Schuhe anhat,
aber die Kleidungsstücke alle eine andere Farbe haben?

	* */

	public static void main(String[] args) 
	{
		String[] jacken = new String[]{"rot", "gr�n", "gelb"};
		String[] hosen = new String[]{"rot", "blau", "violett", "gr�n", "schwarz"};
		String[] schuhe = new String[]{"schwarz", "wei�", "rot", "braun"};
		int anzahl = 0;
		
		for (int j = 0; j < jacken.length; j++ )
		{
			for (int h = 0; h < hosen.length; h++)
			{
				for (int s = 0; s < schuhe.length; s++)
				{
					if ((! jacken[j].equals(hosen[h])) 
						&& (! hosen[h].equals(schuhe[s])) 
						&& (! jacken[j].equals(schuhe[s])))
						{
							System.out.println("Jacke: " + jacken[j] + " - Hose: " + hosen[h] + " - Schuhe: " + schuhe[s]);
							anzahl++;
						}
				}
			}
		}
		System.out.println("Anzahl der Kombinationen: " + anzahl);
	}

}

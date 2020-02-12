package aufgabe05;

/*
 * Beispielgruppe 4 - Schleifen
 * 
 * Kugelkorb:
 * 
 * In einem Korb liegen 66 verschiedenfarbige Kugeln: 
 *  * es sind doppelt so viel weiße wie grüne, 
 *  * eine blaue weniger als grüne und 
 *  * sieben rote mehr als grüne.
 *  
 *  Wie viele Kugeln von jeder Farbe sind im Korb?
 *  
 * Aus Interesse wurde ein Zähler (checks) eingebaut um zu sehen, wie oft die if-Anweisung durchgeführt wird.
 */
public class Kugelkorb 
{

	public static void main(String[] args) 
	{
		final int insgesamt = 66;
//		int checks = 0;
		
		for (int weiss = 1; weiss <= insgesamt; weiss++)
		{
			for (int gruen = 1; gruen <= insgesamt; gruen++)
			{
				for (int blau = 1; blau <= insgesamt; blau++)
				{
					for (int rot = 1; rot <= insgesamt; rot++)
					{
//						checks++;
						if ((weiss + gruen + blau + rot == 66)
							&& (weiss == 2 * gruen)
							&& (blau == gruen - 1)
							&& (rot == gruen + 7))
						{
							System.out.printf("Es sind %d weisse %d grüne %d blaue und %d rote Kugeln im Korb.\n",
													   weiss,	gruen,	  blau,		   rot);
						}
					}
				}
			}
		}
//		System.out.println("Anzahl der Tests im innersten der Schleifen: " + checks);
	}

}

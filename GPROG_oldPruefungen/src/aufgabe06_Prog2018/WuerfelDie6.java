package aufgabe06_Prog2018;

/*
 * WuerfelDie6: 
 * 
 * Bei diesem Spiel wird reihum gew�rfelt. 
 * 
 * Wer einen 6er w�rfelt, hat das Spiel gewonnen. 
 * Wird dabei von niemandem ein 6er gew�rfelt, so wird eine neue W�rfelrunde begonnen. 
 * Dies wird so lange wiederholt, bis es endlich einen Sieger gibt. 
 * W�rfeln innerhalb einer W�rfelrunde mehrere Personen einen 6er, 
 * so haben diese alle gewonnen.
 * 
 * Die Namen der beteiligten Personen sollen fix in einem Array gespeichert sein 
 * (Sie m�ssen diese nicht einlesen).
 */
public class WuerfelDie6 
{

	public static void main(String[] args) 
	{
//		String[] namen = new String[]{"Peter", "Paul", "Mary"};
		String[] namen = new String[]{"Dave", "Dee", "Dozy", "Beaky", "Mick", "Tich"};
		boolean gewonnen;	// wird auf true gesetzt, sobald jemand 6 gew�rfelt hat.
		int gewuerfelt;
		
		// Am Anfang hat noch niemand gewonnen.
		gewonnen = false;
		// Die SiegerInnen werden nicht gemerkt, sondern einfach ausgegeben
		System.out.println("Gewonnen hat:");
		while (! gewonnen)		// so lange niemand gewonnen hat ... 
		{
			// ... spielen die Beteiligten reihum
			for (int i = 0; i < namen.length; i++)
			{
				// JedeR w�rfelt
				gewuerfelt = wuerfeln();
				// Wurde ein 6er gew�rfelt, so hat die Person gewonnen
				if (gewuerfelt == 6)
				{
					// Den Namen ausgeben ...
					System.out.println(namen[i]);
					// ... und merken, dass jemand gewonnen hat (damit keine neue Runde begonnen wird).
					gewonnen = true;
				}
			}
		}
	}
	
	public static int wuerfeln()
	{
		final int minAugen = 1;
		final int maxAugen = 6;
		
		return (int)(Math.random() * (maxAugen - minAugen + 1) + minAugen);
	}
}

package _glProg_2016_NT2_GrA;

public class TanzendeSterne 
{

	/*
	* Für einen Tanzwettbewerb sollen sich die teilnehmenden Paare ein Programm aus 3 Tänzen zusammenstellen.
	* Dabei müssen jedoch bestimmte Regeln eingehalten werden:
Zunächst einmal darf keiner der Tänze doppelt vorkommen.
Dann muss der
•	erste Tanz einer der Tänze Samba, Rumba, Cha-Cha-Cha, Walzer oder Jive
•	zweite Tanz Jive, Boogie-Woogie, Pogo oder Rumba
•	dritte Tanz Walzer, Jive, Polka oder  Salsa
sein.
Wie viele Möglichkeiten gibt es, ein Programm zusammenzustellen?

	* */

	public static void main(String[] args) 
	{
		String[] tanz1 = new String[]{"Samba", "Rumba", "Cha-Cha-Cha", "Walzer", "Jive"};
		String[] tanz2 = new String[]{"Jive", "Boogie-Woogie", "Pogo", "Rumba"};
		String[] tanz3 = new String[]{"Walzer", "Jive", "Polka", "Salsa"};
		int anzahl = 0;
		
		for (int t1 = 0; t1 < tanz1.length; t1++)
		{
			for (int t2 = 0; t2 < tanz2.length; t2++) 
			{
				for (int t3 = 0; t3 < tanz3.length; t3++)
				{
					if ((! tanz1[t1].equals(tanz2[t2]))
						&& (! tanz1[t1].equals(tanz3[t3]))
						&& (! tanz2[t2].equals(tanz3[t3])))
						{
							anzahl++;
							System.out.println(tanz1[t1] + " - " + tanz2[t2] + " - " + tanz3[t3]);
						}
				}
			}
		}
		System.out.println("Anzahl der m�glichen Programme: " + anzahl);
	}

}
